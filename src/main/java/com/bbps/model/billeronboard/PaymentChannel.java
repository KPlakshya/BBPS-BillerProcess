package com.bbps.model.billeronboard;

import java.io.Serializable;

import lombok.Data;
@Data
public class PaymentChannel implements Serializable{

	private static final long serialVersionUID = -1881158992245732140L;
	
	private String paymentChannel;
	private String minLimit;
	private String supportPendingStatus;
}
