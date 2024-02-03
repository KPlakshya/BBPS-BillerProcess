package com.bbps.service;


import com.bbps.BillerApp;
import com.bbps.entity.BillerConfigEntity;
import com.bbps.model.billeronboard.BillerDto;
import com.bbps.repository.BillerRepo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
@Slf4j
public class FileReaderService {

    @Autowired
    BillerExcelUploadService billerExcelUploadService;

    @Autowired
    BillerRepo billerRepo;

    public void read(MultipartFile requestFile){
        try {
            if (billerExcelUploadService.isValidExcelFile(requestFile)) {
                log.info("Inside Filrreader");
                List<BillerDto> billerList = new ArrayList<>();
                if(!requestFile.isEmpty()) {
                    billerList = billerExcelUploadService.getDataFromExcel(requestFile.getInputStream());
                    log.info("Biller List Size [{}]", billerList.size());
                    List<BillerConfigEntity> billerConfigEntityList = new ArrayList<>();
                    if (Objects.nonNull(billerList)) {

                        billerList.stream().forEach(billerDto -> {
                            log.info("Biller DTO [{}]", billerDto);
                            BillerConfigEntity billerConfigEntity = new BillerConfigEntity();
                            try {
                                billerConfigEntity.setBillerDetails(new ObjectMapper().writeValueAsString(billerDto));
                                billerConfigEntity.setBillerId(billerDto.getBlr_id());
                                billerConfigEntity.setBilllerCategoryName(billerDto.getBlr_category_name());
                                billerConfigEntity.setBlrName(billerDto.getBlr_name());
                                billerConfigEntity.setCreated("System");
                                billerConfigEntity.setCreatedDateTime(Timestamp.valueOf(LocalDateTime.now()));
                                billerConfigEntity.setStatus("Y");
                                billerConfigEntityList.add(billerConfigEntity);
                                log.info("Biller Entity [{}]", billerConfigEntity);

                            } catch (JsonProcessingException e) {
                                throw new RuntimeException(e);
                            }
                        });

                        billerRepo.saveAll(billerConfigEntityList);

                    }
                }
            }

        }catch (IOException e){
            log.info("Exceptipon IO");
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();

        }

    }
}
