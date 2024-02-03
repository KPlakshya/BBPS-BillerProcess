package com.bbps.model.billeronboard;

import java.io.Serializable;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class BillerFetchRequest implements Serializable {

	private static final long serialVersionUID = -7914477156628847490L;

	@NotBlank(message = "billerId is required")
	public String billerId;


	@NotBlank(message = "billerCategoryName is required")
	public String billerCategoryName;

	@NotBlank(message = "searchMyBiller is required for Yes/No")
	public String searchMyBiller;

}
