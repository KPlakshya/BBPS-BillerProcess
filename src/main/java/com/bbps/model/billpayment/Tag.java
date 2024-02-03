package com.bbps.model.billpayment;

import java.io.Serializable;

import lombok.Data;

@Data
public class Tag implements Serializable {
	private static final long serialVersionUID = 1L;
	 private String name;
	    private String value;

}
