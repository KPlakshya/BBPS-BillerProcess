package com.bbps.kafka;

import com.bbps.kafka.model.Message;
import com.fasterxml.jackson.core.JsonProcessingException;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Slf4j
public class KafkaMessagePostingService {

    @Autowired
    KafkaTemplate kafkaTemplate;


    public void postMessage(Object reqMsgBody,Map<String, Object> headersMap, String queueName) throws JsonProcessingException {
        Message message = new Message();

        Message.BbpsReqinfo bbpsReqinfo = new Message.BbpsReqinfo();

        bbpsReqinfo.setHeaders(headersMap);

        Message.MessageBody messageBody = new Message.MessageBody();

        Map<String, Object> map =new ObjectMapper()
                .convertValue(reqMsgBody, new TypeReference<Map<String, Object>>() {});

        messageBody.setBody(new ObjectMapper().writeValueAsString(reqMsgBody));
        bbpsReqinfo.setMessageBody(messageBody);

        message.setBbpsReqinfo(bbpsReqinfo);

        log.info("Posting Request -QueueName[{}] , Message [{}]",queueName, message);
        kafkaTemplate.send(queueName, new ObjectMapper().writeValueAsString(message));
        log.info("Request Posted  SuccessFully -QueueName[{}]",queueName);

    }
}