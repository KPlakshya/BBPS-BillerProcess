package com.bbps.model.agentfetch;

import java.io.Serializable;

import lombok.Data;

@Data
public class AgentPaymentChannel implements Serializable {

	private static final long serialVersionUID = 1409723731053740872L;
	private String paymentChannel;
	private String maxLimit;
	private String minLimit;

}
