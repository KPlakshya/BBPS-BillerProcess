package com.bbps.model.billeronboard;

import java.io.Serializable;

import lombok.Data;

@Data
public class BillerAdditionalInfoPayment implements Serializable{

	private static final long serialVersionUID = -1881158992245732140L;
	
	private String paramName;
	private String dataType;
	private String optional;
}