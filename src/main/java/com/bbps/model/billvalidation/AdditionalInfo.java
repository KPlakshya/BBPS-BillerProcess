package com.bbps.model.billvalidation;

import java.io.Serializable;

import lombok.Data;

@Data
public class AdditionalInfo implements Serializable {
	private static final long serialVersionUID = 7948080969289899367L;
	private String name;
	private String value;

}
