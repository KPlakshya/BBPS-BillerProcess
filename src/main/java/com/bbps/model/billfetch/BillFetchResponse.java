package com.bbps.model.billfetch;

import java.io.Serializable;
import java.util.List;

import lombok.Data;
@Data
public class BillFetchResponse implements Serializable{

	private static final long serialVersionUID = 1L;
	private String responseCode;
    private String responseMessage;
    private InputParams inputParams;
    private String customerName;
    private String amount;
    private String dueDate;
    private String billDate;
    private String billNumber;
    private String billPeriod;
    private List<Tag> billerResponseTag;
    private List<Tag> additionaInfo;
    
    

}
