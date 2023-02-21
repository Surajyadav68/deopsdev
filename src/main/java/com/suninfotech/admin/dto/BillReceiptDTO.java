package com.suninfotech.admin.dto;


public class BillReceiptDTO {
	
	private String id;
	private String sqlString;
	private String societyId ;
	private String yearId ;
	private String fromDate;
	private String toDate;
	private String fromInvoice ;
    private String toInvoice ;
	private String sqlCondition ;
	private String billColumn = "invcode,societycode,AccountingYear,invoiceno,invoicedate,membercode,billperiod," +
						"InvoiceTotal,arrears,intarrears,totalamount,address_1,address_2,address_3,HighlightedFootNote," +
						"BottomDesc,AuthorisedSignatory,BillFrequency,MemberName,EstablishmentType,FlatNo,BldgNWing,name,mode,area "; 

	private String billDetail = "invcode,societycode,AccountingYear,invoiceno,ParameterName,amount" ;

	public BillReceiptDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BillReceiptDTO(String id, String sqlString, String societyId, String yearId, String fromDate, String toDate,
			String fromInvoice, String toInvoice, String sqlCondition, String billColumn, String billDetail) {
		super();
		this.id = id;
		this.sqlString = sqlString;
		this.societyId = societyId;
		this.yearId = yearId;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.fromInvoice = fromInvoice;
		this.toInvoice = toInvoice;
		this.sqlCondition = sqlCondition;
		this.billColumn = billColumn;
		this.billDetail = billDetail;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSqlString() {
		return sqlString;
	}

	public void setSqlString(String sqlString) {
		this.sqlString = sqlString;
	}

	public String getSocietyId() {
		return societyId;
	}

	public void setSocietyId(String societyId) {
		this.societyId = societyId;
	}

	public String getYearId() {
		return yearId;
	}

	public void setYearId(String yearId) {
		this.yearId = yearId;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public String getFromInvoice() {
		return fromInvoice;
	}

	public void setFromInvoice(String fromInvoice) {
		this.fromInvoice = fromInvoice;
	}

	public String getToInvoice() {
		return toInvoice;
	}

	public void setToInvoice(String toInvoice) {
		this.toInvoice = toInvoice;
	}

	public String getSqlCondition() {
		return sqlCondition;
	}

	public void setSqlCondition(String sqlCondition) {
		this.sqlCondition = sqlCondition;
	}

	public String getBillColumn() {
		return billColumn;
	}

	public void setBillColumn(String billColumn) {
		this.billColumn = billColumn;
	}

	public String getBillDetail() {
		return billDetail;
	}

	public void setBillDetail(String billDetail) {
		this.billDetail = billDetail;
	}

	@Override
	public String toString() {
		return "BillReceiptDTO [id=" + id + ", sqlString=" + sqlString + ", societyId=" + societyId + ", yearId="
				+ yearId + ", fromDate=" + fromDate + ", toDate=" + toDate + ", fromInvoice=" + fromInvoice
				+ ", toInvoice=" + toInvoice + ", sqlCondition=" + sqlCondition + ", billColumn=" + billColumn
				+ ", billDetail=" + billDetail + "]";
	}

}