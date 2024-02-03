package com.bbps.model.billfetch;

import java.io.Serializable;

import lombok.Data;

@Data
public class Input implements Serializable {
	private static final long serialVersionUID = 1L;
	public String paramName;
    public String paramValue;
}
