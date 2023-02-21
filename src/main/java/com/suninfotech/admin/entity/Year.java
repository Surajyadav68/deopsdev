package com.suninfotech.admin.entity;

import java.io.Serializable;

public class Year implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String code;
	private String companyCode;
	private String startDate;
	private String endDate;

	public Year() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Year(String id, String code, String companyCode, String startDate, String endDate) {
		super();
		this.id = id;
		this.code = code;
		this.companyCode = companyCode;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "YearDTO [id=" + id + ", code=" + code + ", companyCode=" + companyCode + ", startDate=" + startDate
				+ ", endDate=" + endDate + "]";
	}


