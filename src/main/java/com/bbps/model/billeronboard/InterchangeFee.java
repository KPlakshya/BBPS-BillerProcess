package com.bbps.model.billeronboard;

import java.io.Serializable;

import lombok.Data;

@Data
public class InterchangeFee implements Serializable { 
    private static final long serialVersionUID = 1L;
	private String feeCode;
    private String feeDesc;
    private String feeDirection;
    private InterchangeFeeDetails interchangeFeeDetails;

    
}
