package com.bbps.service;

import com.bbps.model.billeronboard.BillerDto;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

@Service
@Slf4j
public class BillerExcelUploadService {

    public static boolean isValidExcelFile(MultipartFile file){
        return Objects.equals(file.getContentType(),"application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
    }

    public static boolean isValidCsvFile(MultipartFile file){
        String type = "text/csv";
        if(!type.equals(file.getContentType()))
            return false;
        return true;

    }
    public  List<BillerDto> getDataFromExcel(InputStream inputStream)  {
        List<BillerDto> billerList = new ArrayList<>();
        log.info("Indside getDataFromExcel");

        try {
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            XSSFSheet  sheet = workbook.getSheetAt(0);

            int rowIndex = 0;
            for(Row row : sheet){
                if(rowIndex == 0){
                    rowIndex++;
                    continue;
                }
                Iterator<Cell> cellIterator = row.cellIterator();
                int cellIndex = 0;
                BillerDto billerDto = new BillerDto();
                while(cellIterator.hasNext()){
                    Cell cell = cellIterator.next();
                    switch (cellIndex){
                        case 0 -> billerDto.setBlr_id(cell.getStringCellValue());
                        case 1 -> billerDto.setBlr_name(cell.getStringCellValue());
                        case 2 -> billerDto.setBlr_alias_name(cell.getStringCellValue());
                        case 3 -> billerDto.setBlr_category_name(cell.getStringCellValue());
                        case 4 -> billerDto.setBlr_linked_ou_default(cell.getStringCellValue());
                        case 5 -> billerDto.setDirectTSP(cell.getStringCellValue());
                        case 6 -> billerDto.setLogoAttached(cell.getStringCellValue());
                        case 7 -> billerDto.setBlr_pmt_amt_exactness(cell.getStringCellValue());
                        case 8 -> billerDto.setFetch_requirement(cell.getStringCellValue());
                        case 9 -> billerDto.setSupport_validation_api(cell.getStringCellValue());
                        case 10 -> billerDto.setBlr_description(cell.getStringCellValue());
                        case 11-> billerDto.setEnable_reversal_elimination("");
                        case 12 -> billerDto.setSupport_402_api_flag(cell.getStringCellValue());
                        case 13-> billerDto.setBlr_timeout(String.valueOf(cell.getNumericCellValue()));
                        case 14 -> billerDto.setBlr_retry_interval_402(String.valueOf(cell.getNumericCellValue()));
                        case 15 -> billerDto.setSupport_credit_adjustment_flag(cell.getStringCellValue());
                        case 16 -> billerDto.setBlr_tat_for_stp(cell.getStringCellValue());
                        case 17 -> billerDto.setBlr_ca_velocity_percentage(cell.getStringCellValue());
                        case 18 -> billerDto.setBlr_linked_ou_backup_1(cell.getStringCellValue());
                        case 19 -> billerDto.setBlr_linked_ou_backup_2(cell.getStringCellValue());
                        case 20 -> billerDto.setBlr_linked_ou_backup_3(cell.getStringCellValue());
                        case 21 -> billerDto.setParent_blr_id(cell.getStringCellValue());
                        case 22 -> billerDto.setIs_parent_blr(cell.getStringCellValue());
                        case 23 -> billerDto.setBlr_registered_adrline(cell.getStringCellValue());
                        case 24 -> billerDto.setBlr_registered_city(cell.getStringCellValue());
                        case 25 -> billerDto.setBlr_registered_pin_code(cell.getStringCellValue());
                        case 26 -> billerDto.setBlr_registered_state(cell.getStringCellValue());
                        case 27 -> billerDto.setBlr_registered_country(cell.getStringCellValue());
                        case 28 -> billerDto.setBlr_commumication_adrline(cell.getStringCellValue());
                        case 29 -> billerDto.setBlr_commumication_city(cell.getStringCellValue());
                        case 30 -> billerDto.setBlr_commumication_pin_code(String.valueOf(cell.getNumericCellValue()));
                        case 31 -> billerDto.setBlr_commumication_state(cell.getStringCellValue());
                        case 32 -> billerDto.setBlr_commumication_country(cell.getStringCellValue());
                        case 33 -> billerDto.setBlr_mode(cell.getStringCellValue());
                        case 34 -> billerDto.setBlr_accepts_adhoc(cell.getStringCellValue());
                        case 35 -> billerDto.setBlr_ownership(cell.getStringCellValue());
                        case 36 -> billerDto.setBlr_auth_letter_1(cell.getStringCellValue());
                        case 37 -> billerDto.setBlr_auth_letter_1_nm(cell.getStringCellValue());
                        case 38 -> billerDto.setBlr_auth_letter_2(cell.getStringCellValue());
                        case 39 -> billerDto.setBlr_auth_letter_2_nm(cell.getStringCellValue());
                        case 40 -> billerDto.setBlr_auth_letter_3(cell.getStringCellValue());
                        case 41 -> billerDto.setBlr_auth_letter_3_nm(cell.getStringCellValue());
                        case 42 -> billerDto.setBlr_avg_ticket_size(String.valueOf(cell.getNumericCellValue()));
                        case 43 -> billerDto.setBlr_volume_per_day(cell.getStringCellValue());
                        case 44 -> billerDto.setBlr_coverage(cell.getStringCellValue());
                        case 45 -> billerDto.setBlr_payment_modes(cell.getStringCellValue());
                        case 46 -> billerDto.setBlr_payment_channels(cell.getStringCellValue());
                        case 47 -> billerDto.setBlr_payment_modes_402(cell.getStringCellValue());
                        case 48 -> billerDto.setBlr_payment_channels_402(cell.getStringCellValue());
                        case 49 -> billerDto.setBlr_effctv_from(cell.getStringCellValue());
                        case 50 -> billerDto.setBlr_effctv_to(cell.getStringCellValue());
                        case 51 -> billerDto.setBlr_tan(cell.getStringCellValue());
                        case 52 -> billerDto.setBlr_uaadhaar(cell.getStringCellValue());
                        case 53 -> billerDto.setBlr_roc_uin(cell.getStringCellValue());
                        case 54 -> billerDto.setBlr_customer_params(cell.getStringCellValue());
                        case 55 -> billerDto.setBlr_response_params(cell.getStringCellValue());
                        case 56 -> billerDto.setBlr_additional_info(cell.getStringCellValue());
                        case 57 -> billerDto.setEntity_status(cell.getStringCellValue());
                        case 58 -> billerDto.setFetch_ageing(cell.getStringCellValue());
                        case 59 -> billerDto.setBlr_customer_params(cell.getStringCellValue());
                        default -> {
                        }
                    }
                    cellIndex++;
                }
                billerList.add(billerDto);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return billerList;

    }



}
