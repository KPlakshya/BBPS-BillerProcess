package com.bbps.model;

import com.bbps.kafka.model.Message;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.validation.constraints.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class statusCheckRequest implements Serializable {
	private static final long serialVersionUID = 7948080969289899367L;

	@NotBlank(message = "customerReqId is required")
	@Pattern(regexp = "^[0-9]$",message="customerReqId should be numeric")
	private String customerReqId;
	private String reqType;
	private String status;

}
