package com.suninfotech.admin.dto;

import java.io.Serializable;

import com.suninfotech.admin.entity.AccountsMaster;

public class AccountsMasterDTO implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String code;
	private String accountname;
	private String accounttype;
	private String openingbalance;
	private String crdr;
	private String panno;
	private String address;
	private String phone1;
	private String phone2;
	private String email1;
	private String email2;

	private String personId;
	private String accountingyear;

	private String scheduleType;

	private String canEdit;
	private String GSTNo;
	public AccountsMasterDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccountsMasterDTO(String id, String code, String accountname, String accounttype, String openingbalance,
			String crdr, String panno, String address, String phone1, String phone2, String email1, String email2,
			String personId, String accountingyear, String scheduleType, String canEdit, String gSTNo) {
		super();
		this.id = id;
		this.code = code;
		this.accountname = accountname;
		this.accounttype = accounttype;
		this.openingbalance = openingbalance;
		this.crdr = crdr;
		this.panno = panno;
		this.address = address;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.email1 = email1;
		this.email2 = email2;
		this.personId = personId;
		this.accountingyear = accountingyear;
		this.scheduleType = scheduleType;
		this.canEdit = canEdit;
		GSTNo = gSTNo;
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
	public String getOpeningbalance() {
		return openingbalance;
	}
	public void setOpeningbalance(String openingbalance) {
		this.openingbalance = openingbalance;
	}
	public String getCrdr() {
		return crdr;
	}
	public void setCrdr(String crdr) {
		this.crdr = crdr;
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
	public String getPhone1() {
		return phone1;
	}
	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}
	public String getPhone2() {
		return phone2;
	}
	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}
	public String getEmail1() {
		return email1;
	}
	public void setEmail1(String email1) {
		this.email1 = email1;
	}
	public String getEmail2() {
		return email2;
	}
	public void setEmail2(String email2) {
		this.email2 = email2;
	}
	public String getPersonId() {
		return personId;
	}
	public void setPersonId(String personId) {
		this.personId = personId;
	}
	public String getAccountingyear() {
		return accountingyear;
	}
	public void setAccountingyear(String accountingyear) {
		this.accountingyear = accountingyear;
	}
	public String getScheduleType() {
		return scheduleType;
	}
	public void setScheduleType(String scheduleType) {
		this.scheduleType = scheduleType;
	}
	public String getCanEdit() {
		return canEdit;
	}
	public void setCanEdit(String canEdit) {
		this.canEdit = canEdit;
	}
	public String getGSTNo() {
		return GSTNo;
	}
	public void setGSTNo(String gSTNo) {
		GSTNo = gSTNo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "AccountsMasterDTO [id=" + id + ", code=" + code + ", accountname=" + accountname + ", accounttype="
				+ accounttype + ", openingbalance=" + openingbalance + ", crdr=" + crdr + ", panno=" + panno
				+ ", address=" + address + ", phone1=" + phone1 + ", phone2=" + phone2 + ", email1=" + email1
				+ ", email2=" + email2 + ", personId=" + personId + ", accountingyear=" + accountingyear
				+ ", scheduleType=" + scheduleType + ", canEdit=" + canEdit + ", GSTNo=" + GSTNo + "]";
	}
	
	 public static AccountsMaster convertToEntity(AccountsMasterDTO accountsMasterDTO) {
	        return new AccountsMaster(accountsMasterDTO.getId(), accountsMasterDTO.getCode(), accountsMasterDTO.getAccountname(), accountsMasterDTO.getAccounttype(),
	        		accountsMasterDTO.getOpeningbalance(), accountsMasterDTO.getCrdr(), accountsMasterDTO.getPanno(),
	        		accountsMasterDTO.getAddress(), accountsMasterDTO.getPhone1(), accountsMasterDTO.getPhone2(), accountsMasterDTO.getEmail1(),accountsMasterDTO.getEmail2(), accountsMasterDTO.getPersonId(),accountsMasterDTO.getAccountingyear(),accountsMasterDTO.getScheduleType(),accountsMasterDTO.getCanEdit(),accountsMasterDTO.getGSTNo());
	    }

}