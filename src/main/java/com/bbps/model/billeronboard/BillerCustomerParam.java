package com.bbps.model.billeronboard;

import java.io.Serializable;

import lombok.Data;

@Data
public class BillerCustomerParam implements Serializable { 
    private static final long serialVersionUID = -8147212297757284492L;
	private String paramName;
    private String dataType;
    private boolean optional;
    private int minLength;
    private int maxLength;
    private String regex;
    private boolean visibility;
}
