package com.suninfotech.admin.entity;

import java.io.Serializable;

public class ScheduleMaster implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String code;
	private String accountname;
	private String accounttype;
	private String remark;
	public ScheduleMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ScheduleMaster(String id, String code, String accountname, String accounttype, String remark) {
		super();
		this.id = id;
		this.code = code;
		this.accountname = accountname;
		this.accounttype = accounttype;
		this.remark = remark;
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
	public String getAccountname() {
		return accountname;
	}
	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "ScheduleMasterDTO [id=" + id + ", code=" + code + ", accountname=" + accountname + ", accounttype="
				+ accounttype + ", remark=" + remark + "]";
	}
	