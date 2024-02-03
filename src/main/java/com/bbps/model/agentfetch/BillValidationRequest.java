package com.bbps.model.agentfetch;

import java.io.Serializable;

import lombok.Data;

@Data
public class BillValidationRequest implements Serializable {
	private static final long serialVersionUID = 1864629882762121313L;
	private String agentId;
    private String billerId;
    private InputParams inputParams;
	

}
