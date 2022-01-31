package com.cyclingapp.cyclingservice.dto;

import java.io.Serializable;
import java.util.Date;

public class ErrorResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private int errorCode;

	private String errorMsg;

	private Date timestamp;

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

}
