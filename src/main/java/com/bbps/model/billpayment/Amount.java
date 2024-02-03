package com.bbps.model.billpayment;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class Amount implements Serializable{
	
	private static final long serialVersionUID = 5551278961737273498L;
	private String amt;
    private String custConvFee;
    private String couCustConvFee;
    private String currency;
    private String splitPayAmount;
    private List<Tag> amountTags;

}
