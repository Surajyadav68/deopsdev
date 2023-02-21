package com.suninfotech.admin.dto;

import java.io.Serializable;

public class TransactionsMasterDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String TransactionsID;
	private String account1;
	private String account2;
	private String trnDate;
	private String amount;
	private String docNo;
	private String narration;
	private String type;
	private String AgainestSuppBill;
	private String ReceiptNo;
	private String DrCrNo;

	public TransactionsMasterDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TransactionsMasterDTO(String id, String transactionsID, String account1, String account2, String trnDate,
			String amount, String docNo, String narration, String type, String againestSuppBill, String receiptNo,
			String drCrNo) {
		super();
		this.id = id;
		TransactionsID = transactionsID;
		this.account1 = account1;
		this.account2 = account2;
		this.trnDate = trnDate;
		this.amount = amount;
		this.docNo = docNo;
		this.narration = narration;
		this.type = type;
		AgainestSuppBill = againestSuppBill;
		ReceiptNo = receiptNo;
		DrCrNo = drCrNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTransactionsID() {
		return TransactionsID;
	}

	public void setTransactionsID(String transactionsID) {
		TransactionsID = transactionsID;
	}

	public String getAccount1() {
		return account1;
	}

	public void setAccount1(String account1) {
		this.account1 = account1;
	}

	public String getAccount2() {
		return account2;
	}

	public void setAccount2(String account2) {
		this.account2 = account2;
	}

	public String getTrnDate() {
		return trnDate;
	}

	public void setTrnDate(String trnDate) {
		this.trnDate = trnDate;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDocNo() {
		return docNo;
	}

	public void setDocNo(String docNo) {
		this.docNo = docNo;
	}

	public String getNarration() {
		return narration;
	}

	public void setNarration(String narration) {
		this.narration = narration;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAgainestSuppBill() {
		return AgainestSuppBill;
	}

	public void setAgainestSuppBill(String againestSuppBill) {
		AgainestSuppBill = againestSuppBill;
	}

	public String getReceiptNo() {
		return ReceiptNo;
	}

	public void setReceiptNo(String receiptNo) {
		ReceiptNo = receiptNo;
	}

	public String getDrCrNo() {
		return DrCrNo;
	}

	public void setDrCrNo(String drCrNo) {
		DrCrNo = drCrNo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "TransactionsMasterDTO [id=" + id + ", TransactionsID=" + TransactionsID + ", account1=" + account1
				+ ", account2=" + account2 + ", trnDate=" + trnDate + ", amount=" + amount + ", docNo=" + docNo
				+ ", narration=" + narration + ", type=" + type + ", AgainestSuppBill=" + AgainestSuppBill
				+ ", ReceiptNo=" + ReceiptNo + ", DrCrNo=" + DrCrNo + "]";
	}

}