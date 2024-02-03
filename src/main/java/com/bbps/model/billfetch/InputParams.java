package com.bbps.model.billfetch;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class InputParams implements Serializable{
	
	private static final long serialVersionUID = 1L;
	public List<Input> input;

}
