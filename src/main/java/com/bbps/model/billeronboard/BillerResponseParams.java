package com.bbps.model.billeronboard;

import java.io.Serializable;

import lombok.Data;

@Data
public class BillerResponseParams implements Serializable {
	private static final long serialVersionUID = 1L;
	private AmountOptions amountOptions;

}