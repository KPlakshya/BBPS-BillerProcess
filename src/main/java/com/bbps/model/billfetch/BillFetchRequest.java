package com.bbps.model.billfetch;

import java.io.Serializable;

import lombok.Data;


@Data
public class BillFetchRequest implements Serializable {

	private static final long serialVersionUID = 1L;

//	@NotBlank(message = "directBillChannel is required")
	public String directBillChannel;

//	@NotBlank(message = "agentId is required")
	public String agentId;
	public AgentDeviceInfo agentDeviceInfo;
	public CustomerInfo customerInfo;

//	@NotBlank(message = "billerId is required")
	public String billerId;
	public InputParams inputParams;

}
