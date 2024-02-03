package com.bbps.model.agentfetch;

import java.io.Serializable;

import lombok.Data;

@Data
public class AgentPaymentMode implements Serializable {

	private static final long serialVersionUID = -5300966333801991746L;
	private String paymentMode;
	private String maxLimit;
	private String minLimit;

}
