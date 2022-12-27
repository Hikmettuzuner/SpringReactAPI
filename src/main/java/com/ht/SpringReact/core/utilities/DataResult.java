package com.ht.SpringReact.core.utilities;

public class DataResult<T> extends Result {

	private T data;

	public DataResult(T data, boolean status, String message) {
		super(status, message);
		this.data = data;
	}

	public DataResult(T data, boolean status) {
		super(status);
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
