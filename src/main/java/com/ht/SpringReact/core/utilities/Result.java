package com.ht.SpringReact.core.utilities;

public class Result {
	private boolean status;
	private String message;

	public Result(boolean status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

	public Result(boolean status) {
		super();
		this.status = status;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
