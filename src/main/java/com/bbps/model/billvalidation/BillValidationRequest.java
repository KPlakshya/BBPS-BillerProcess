package com.bbps.model.billvalidation;

import java.io.Serializable;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class BillValidationRequest implements Serializable {
	private static final long serialVersionUID = 1864629882762121313L;

    @NotBlank(message = "agentId is required")
	private String agentId;

    @NotBlank(message = "billerId is required")
    private String billerId;

    private InputParams inputParams;
	

}
