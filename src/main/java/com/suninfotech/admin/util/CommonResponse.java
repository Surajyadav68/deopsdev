package com.suninfotech.admin.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.suninfotech.admin.dto.Page;

@SuppressWarnings("hiding")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommonResponse<T> {

	private boolean success;
	private String message;
	private String errorCode;
	private T data;
	private String url;
	private Page page;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public void setPage(int totalPages, int numberOfElements, long totalElements, int docketCounts, double docketWeight, double docketVolWeight) {
		this.page = new Page(totalPages, numberOfElements, totalElements, docketCounts, docketWeight, docketVolWeight);
	}
}
