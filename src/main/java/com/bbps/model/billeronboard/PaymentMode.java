package com.bbps.model.billeronboard;

import java.io.Serializable;

import lombok.Data;

@Data
public class PaymentMode implements Serializable { 
    private static final long serialVersionUID = 1L;
	private String paymentMode;
    private int minLimit;
    private String supportPendingStatus;
}

