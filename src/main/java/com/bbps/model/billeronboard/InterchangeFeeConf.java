package com.bbps.model.billeronboard;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class InterchangeFeeConf implements Serializable { 
    private static final long serialVersionUID = 2590951046345550863L;
	private String mti;
    private String responseCode;
    private List<String> fees;
    private boolean defaultFee;
    private String effctvFrom;
}
