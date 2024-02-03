package com.bbps.model.billpayment;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class BillerResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	private String customerName;
	private String amount;
	private String dueDate;
	private String billDate;
	private String billNumber;
	private String billPeriod;
	private List<Tag> tags;

}
