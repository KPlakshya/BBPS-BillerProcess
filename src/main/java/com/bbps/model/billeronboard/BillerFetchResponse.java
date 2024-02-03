package com.bbps.model.billeronboard;
import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class BillerFetchResponse implements Serializable { 
    private static final long serialVersionUID = 1L;
	private String responseCode;
    private String responseMessage;
    private String billerId;
    private String billerName;
    private String billerAliasName;
    private String billerCategoryName;
    private String billerMode;
    private boolean billerAcceptsAdhoc;
    private boolean parentBiller;
    private String billerOwnerShp;
    private String billerCoverage;
    private String fetchRequirement;
    private String paymentAmountExactness;
    private String supportBillValidation;
    private String billerEffctvFrom;
    private String billerEffctvTo;
    private String billerTempDeactivationStart;
    private String billerTempDeactivationEnd;
    private List<PaymentMode> billerPaymentModes;
    private List<PaymentChannel> billerPaymentChannels;
    private List<BillerCustomerParam> billerCustomerParams;
    private CustomerParamGroups customerParamGroups;
    private BillerResponseParams billerResponseParams;
    private List<BillerAdditionalInfo> billerAdditionalInfo;
    private BillerAdditionalInfoPayment billerAdditionalInfoPayment;
    private List<InterchangeFeeConf> interchangeFeeConf;
    private List<InterchangeFee> interchangeFee;
    private String Status;
    private String billerDescription;
    private String supportDeemed;
    private String supportPendingStatus;
    private int billerTimeOut;
    private String planMdmRequirement;
    private List<PlanAdditionalInfo> planAdditionalInfo;
}












