package com.bbps.model.agentfetch;

import java.io.Serializable;

import lombok.Data;

@Data
public class AgentFetchRequest implements Serializable {
	private static final long serialVersionUID = 4311875231777820539L;
	private String agentId;

}
