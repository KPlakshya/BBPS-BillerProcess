package com.bbps.model.billeronboard;

import java.io.Serializable;

import lombok.Data;

@Data
public class InterchangeFeeDetails implements Serializable { 
    private static final long serialVersionUID = 3230385816485973719L;
	private long tranAmtRangeMax;
    private long tranAmtRangeMin;
    private int percentFee;
    private int flatFee;
    private String effctvFrom;
    private String effctvTo;
}