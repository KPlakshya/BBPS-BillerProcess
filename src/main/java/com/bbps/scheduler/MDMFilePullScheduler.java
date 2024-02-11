package com.bbps.scheduler;


import com.bbps.service.BillerExcelUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@ConditionalOnProperty(value = "mdm.pull.job.enabled")
public class MDMFilePullScheduler {

    @Autowired
    BillerExcelUploadService billerExcelUploadService;


    @Scheduled(cron = "${mdm.pull.job.cron}")
    public void fileRead(){

        //Call Service Implementation Part

    }
}
