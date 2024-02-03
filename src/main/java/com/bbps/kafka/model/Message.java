package com.bbps.kafka.model;
import lombok.Data;
import lombok.ToString;

import java.util.Map;

@Data
public class Message {

    public BbpsReqinfo bbpsReqinfo;

    @Data
    public static class BbpsReqinfo {
        public Map<String, Object> headers;
        public MessageBody messageBody;
    }

    @Data
    public static class MessageBody {
        public String body;
    }

}