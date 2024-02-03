package com.bbps.model.billpayment;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class BillPaymentRequest implements Serializable {

	private static final long serialVersionUID = -6693012096257237640L;
	private String siTxn;
	private String origRefId;
	private String txnReferenceId;
	private String directBillChannel;
	private String directBillContentId;
	private String paymentRefId;
	private CustomerInfo customerInfo;
	private String agentId;
	private AgentDeviceInfo agentDeviceInfo;
	private String billerId;
	private InputParams inputParams;
	private BillerResponse billerResponse;
	private List<AdditionalInfo> additionaInfo;
	private PaymentMethod paymentMethod;
	private Amount amount;
	private List<Tag> paymentInformationTags;

}
