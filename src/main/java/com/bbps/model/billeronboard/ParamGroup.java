package com.bbps.model.billeronboard;

import java.io.Serializable;

import lombok.Data;

@Data
public  class ParamGroup implements Serializable { 
    private static final long serialVersionUID = -6569541974150676833L;
	private String param;
    private ParamGroup group;
}