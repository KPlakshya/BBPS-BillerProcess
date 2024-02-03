package com.bbps.model.billeronboard;

import java.io.Serializable;

import lombok.Data;

@Data
public class PlanAdditionalInfo implements Serializable { 
    private static final long serialVersionUID = 1L;
	private String paramName;
    private String dataType;
    private boolean optional;
}