package com.bbps.model.billpayment;

import java.io.Serializable;

import lombok.Data;

@Data
public class PaymentMethod implements Serializable {
	private static final long serialVersionUID = 1L;
	private String quickPay;
	private String splitPay;
	private String offusPay;
	private String paymentMode;

}
