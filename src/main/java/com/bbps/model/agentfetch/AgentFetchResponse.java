package com.bbps.model.agentfetch;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class AgentFetchResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	private String responseCode;
	private String responseMessage;
	private String agentId;
	private String agentBusnsType;
	private String agentName;
	private String agentAliasName;
	private String agentLinkedAgentInst;
	private String agentGeoCode;
	private String agent_shop_name;
	private String agent_mobile_no;
	private String agentDummy;
	private List<AgentPaymentMode> agentPaymentModes;
	private List<AgentPaymentChannel> agentPaymentChannels;
	private String agentEffctvFrom;
	private String agentEffctvTo;
	private String agentStatus;
	private String agentTempDeactivationStart;
	private String agentTempDeactivationEnd;
	private String agentRefId;
	private String agentBulk;
	private String agentPinCode;
	private String agentRegisteredCity;
	private String agentRegisteredState;
	private String agentRegisteredAddres;
	private String agentRegisteredCountry;
}
