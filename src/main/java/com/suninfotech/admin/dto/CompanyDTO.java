package com.suninfotech.admin.dto;

import java.io.Serializable;

public class CompanyDTO implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String code;
	private String name;
	private String panno;
	private String address;
	private String startDate;
	private String endDate;
	public CompanyDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CompanyDTO(String id, String code, String name, String panno, String address, String startDate,
			String endDate) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.panno = panno;
		this.address = address;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPanno() {
		return panno;
	}
	public void setPanno(String panno) {
		this.panno = panno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
		return "CompanyDTO [id=" + id + ", code=" + code + ", name=" + name + ", panno=" + panno + ", address="
				+ address + ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}
	
	}
	