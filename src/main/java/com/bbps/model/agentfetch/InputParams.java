package com.bbps.model.agentfetch;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class InputParams implements Serializable {
	private static final long serialVersionUID = 2423040735973632848L;
	private List<InputParam> input;

}
