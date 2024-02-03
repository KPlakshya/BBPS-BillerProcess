package com.bbps.model.billfetch;

import java.io.Serializable;

import lombok.Data;

@Data
public class CustomerInfo implements Serializable{

	private static final long serialVersionUID = 1L;
	public String customerMobile;
	public String customerEmail;
	public String customerAdhaar;
	public String customerPan;

}
