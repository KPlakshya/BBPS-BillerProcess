package com.bbps.model.agentfetch;

import java.io.Serializable;

import lombok.Data;

@Data
public class InputParam implements Serializable {
	private static final long serialVersionUID = 1911557662235206175L;

	private String paramName;
	private String paramValue;

}
