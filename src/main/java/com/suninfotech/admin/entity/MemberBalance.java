package com.suninfotech.admin.entity;

public class MemberBalance {
	private String id;
	private String societyCode;
	private String yearCode;
	private String memberCode;
	private String mainArrears;
	private String suppArrears;
	private String mainIntArr;
	private String suppIntArr;
	private String creditAmt;
	private String disputedAmt;

	public MemberBalance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MemberBalance(String id, String societyCode, String yearCode, String memberCode, String mainArrears,
			String suppArrears, String mainIntArr, String suppIntArr, String creditAmt, String disputedAmt) {
		super();
		this.id = id;
		this.societyCode = societyCode;
		this.yearCode = yearCode;
		this.memberCode = memberCode;
		this.mainArrears = mainArrears;
		this.suppArrears = suppArrears;
		this.mainIntArr = mainIntArr;
		this.suppIntArr = suppIntArr;
		this.creditAmt = creditAmt;
		this.disputedAmt = disputedAmt;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSocietyCode() {
		return societyCode;
	}

	public void setSocietyCode(String societyCode) {
		this.societyCode = societyCode;
	}

	public String getYearCode() {
		return yearCode;
	}

	public void setYearCode(String yearCode) {
		this.yearCode = yearCode;
	}

	public String getMemberCode() {
		return memberCode;
	}

	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
	}

	public String getMainArrears() {
		return mainArrears;
	}

	public void setMainArrears(String mainArrears) {
		this.mainArrears = mainArrears;
	}

	public String getSuppArrears() {
		return suppArrears;
	}

	public void setSuppArrears(String suppArrears) {
		this.suppArrears = suppArrears;
	}

	public String getMainIntArr() {
		return mainIntArr;
	}

	public void setMainIntArr(String mainIntArr) {
		this.mainIntArr = mainIntArr;
	}

	public String getSuppIntArr() {
		return suppIntArr;
	}

	public void setSuppIntArr(String suppIntArr) {
		this.suppIntArr = suppIntArr;
	}

	public String getCreditAmt() {
		return creditAmt;
	}

	public void setCreditAmt(String creditAmt) {
		this.creditAmt = creditAmt;
	}

	public String getDisputedAmt() {
		return disputedAmt;
	}

	public void setDisputedAmt(String disputedAmt) {
		this.disputedAmt = disputedAmt;
	}

	@Override
	public String toString() {
		return "MemberBalanceDTO [id=" + id + ", societyCode=" + societyCode + ", yearCode=" + yearCode
				+ ", memberCode=" + memberCode + ", mainArrears=" + mainArrears + ", suppArrears=" + suppArrears
				+ ", mainIntArr=" + mainIntArr + ", suppIntArr=" + suppIntArr + ", creditAmt=" + creditAmt
				+ ", disputedAmt=" + disputedAmt + "]";
	}
}