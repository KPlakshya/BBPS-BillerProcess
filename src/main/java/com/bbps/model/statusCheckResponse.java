package com.bbps.model;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
public class statusCheckResponse implements Serializable {
	private static final long serialVersionUID = 7948080969289899367L;
	private String customerReqId;
	private String reqType;
	private String response;
	private String status;
	private Timestamp requestTimestamp;
	private Timestamp responseTimestamp;
}
