
package com.suninfotech.admin.dto;

import java.util.List;

/**
 * @author SURAJ YADAV
 *
 */
public class BillRegisterDTO {
	  private String  id;
    private String  invCode;
    private String invoiceNo;
    private String invoiceDate;
    private String billDueDate;
    private String memberName;
    private String establishmentType;
    private String flatNo;
    private String bldgNWing;
    private String billPeriod;
    private String amount1;
    private String amount2;
    private String amount3;
    private String amount4;
    private String amount5;
    private String amount6;
    private String amount7;
    private String amount8;
    private String amount9;
    private String amount10;
    private String amount11;
    private String amount12;
    private String amount13;
    private String amount14;
    private String amount15;
	

    private String cgstAmt1;
    private String cgstAmt2;
    private String cgstAmt3;
    private String cgstAmt4;
    private String cgstAmt5;
    private String cgstAmt6;
    private String cgstAmt7;
    private String cgstAmt8;
    private String cgstAmt9;
    private String cgstAmt10;
    private String cgstAmt11;
    private String cgstAmt12;
    private String cgstAmt13;
    private String cgstAmt14;
    private String cgstAmt15;

    private String sgstAmt1;
    private String sgstAmt2;
    private String sgstAmt3;
    private String sgstAmt4;
    private String sgstAmt5;
    private String sgstAmt6;
    private String sgstAmt7;
    private String sgstAmt8;
    private String sgstAmt9;
    private String sgstAmt10;
    private String sgstAmt11;
    private String sgstAmt12;
    private String sgstAmt13;
    private String sgstAmt14;
    private String sgstAmt15;

    private String igstAmt1;
    private String igstAmt2;
    private String igstAmt3;
    private String igstAmt4;
    private String igstAmt5;
    private String igstAmt6;
    private String igstAmt7;
    private String igstAmt8;
    private String igstAmt9;
    private String igstAmt10;
    private String igstAmt11;
    private String igstAmt12;
    private String igstAmt13;
    private String igstAmt14;
    private String igstAmt15;	

	private String totalBillPay;
    private String parameterShortName1;
    private String parameterShortName2;
    private String parameterShortName3;
    private String parameterShortName4;
    private String parameterShortName5;
    private String parameterShortName6;
    private String parameterShortName7;
    private String parameterShortName8;
    private String parameterShortName9;
    private String parameterShortName10;
    private String parameterShortName11;
    private String parameterShortName12;
    private String parameterShortName13;
    private String parameterShortName14;
    private String parameterShortName15;
    private String parameterName1;
    private String parameterName2;
    private String parameterName3;
    private String parameterName4;
    private String parameterName5;
    private String parameterName6;
    private String parameterName7;
    private String parameterName8;
    private String parameterName9;
    private String parameterName10;
    private String parameterName11;
    private String parameterName12;
    private String parameterName13;
    private String parameterName14;
    private String parameterName15;
    private String address_1;
    private String address_2;
    private String address_3;
    private String highlightedFootNote;
    private String bottomDesc;
    private String bankDetail;
    private String authorisedSignatory;
    private String digitalSign;        //sharad 01.05.2020//
    private String name;
    private String arrears;
    private String intArrears;
    private String totalAmount;
    private String memberCode;
    private String societyCode;
    private String accountingYear;
    private String rebateAmount;
    private String area;
    private String memberNote;
	private String email1;
	private String email2;
	private String amountInWords;
	private List<BillParametersDTO> parameterList ;
	private String emailID;
	private String password;
	
	private String receiptNo;
	private String receiptDate;
	private String selfBank;
	private String partyName;
	private String bankName;
	private String branch;
	private String amount;
	private String narration;
	private String docNo;
	private String chequeDate;
	private String letterMatter;
	public BillRegisterDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BillRegisterDTO(String id, String invCode, String invoiceNo, String invoiceDate, String billDueDate,
			String memberName, String establishmentType, String flatNo, String bldgNWing, String billPeriod,
			String amount1, String amount2, String amount3, String amount4, String amount5, String amount6,
			String amount7, String amount8, String amount9, String amount10, String amount11, String amount12,
			String amount13, String amount14, String amount15, String cgstAmt1, String cgstAmt2, String cgstAmt3,
			String cgstAmt4, String cgstAmt5, String cgstAmt6, String cgstAmt7, String cgstAmt8, String cgstAmt9,
			String cgstAmt10, String cgstAmt11, String cgstAmt12, String cgstAmt13, String cgstAmt14, String cgstAmt15,
			String sgstAmt1, String sgstAmt2, String sgstAmt3, String sgstAmt4, String sgstAmt5, String sgstAmt6,
			String sgstAmt7, String sgstAmt8, String sgstAmt9, String sgstAmt10, String sgstAmt11, String sgstAmt12,
			String sgstAmt13, String sgstAmt14, String sgstAmt15, String igstAmt1, String igstAmt2, String igstAmt3,
			String igstAmt4, String igstAmt5, String igstAmt6, String igstAmt7, String igstAmt8, String igstAmt9,
			String igstAmt10, String igstAmt11, String igstAmt12, String igstAmt13, String igstAmt14, String igstAmt15,
			String totalBillPay, String parameterShortName1, String parameterShortName2, String parameterShortName3,
			String parameterShortName4, String parameterShortName5, String parameterShortName6,
			String parameterShortName7, String parameterShortName8, String parameterShortName9,
			String parameterShortName10, String parameterShortName11, String parameterShortName12,
			String parameterShortName13, String parameterShortName14, String parameterShortName15,
			String parameterName1, String parameterName2, String parameterName3, String parameterName4,
			String parameterName5, String parameterName6, String parameterName7, String parameterName8,
			String parameterName9, String parameterName10, String parameterName11, String parameterName12,
			String parameterName13, String parameterName14, String parameterName15, String address_1, String address_2,
			String address_3, String highlightedFootNote, String bottomDesc, String bankDetail,
			String authorisedSignatory, String digitalSign, String name, String arrears, String intArrears,
			String totalAmount, String memberCode, String societyCode, String accountingYear, String rebateAmount,
			String area, String memberNote, String email1, String email2, String amountInWords,
			List<BillParametersDTO> parameterList, String emailID, String password, String receiptNo,
			String receiptDate, String selfBank, String partyName, String bankName, String branch, String amount,
			String narration, String docNo, String chequeDate, String letterMatter) {
		super();
		this.id = id;
		this.invCode = invCode;
		this.invoiceNo = invoiceNo;
		this.invoiceDate = invoiceDate;
		this.billDueDate = billDueDate;
		this.memberName = memberName;
		this.establishmentType = establishmentType;
		this.flatNo = flatNo;
		this.bldgNWing = bldgNWing;
		this.billPeriod = billPeriod;
		this.amount1 = amount1;
		this.amount2 = amount2;
		this.amount3 = amount3;
		this.amount4 = amount4;
		this.amount5 = amount5;
		this.amount6 = amount6;
		this.amount7 = amount7;
		this.amount8 = amount8;
		this.amount9 = amount9;
		this.amount10 = amount10;
		this.amount11 = amount11;
		this.amount12 = amount12;
		this.amount13 = amount13;
		this.amount14 = amount14;
		this.amount15 = amount15;
		this.cgstAmt1 = cgstAmt1;
		this.cgstAmt2 = cgstAmt2;
		this.cgstAmt3 = cgstAmt3;
		this.cgstAmt4 = cgstAmt4;
		this.cgstAmt5 = cgstAmt5;
		this.cgstAmt6 = cgstAmt6;
		this.cgstAmt7 = cgstAmt7;
		this.cgstAmt8 = cgstAmt8;
		this.cgstAmt9 = cgstAmt9;
		this.cgstAmt10 = cgstAmt10;
		this.cgstAmt11 = cgstAmt11;
		this.cgstAmt12 = cgstAmt12;
		this.cgstAmt13 = cgstAmt13;
		this.cgstAmt14 = cgstAmt14;
		this.cgstAmt15 = cgstAmt15;
		this.sgstAmt1 = sgstAmt1;
		this.sgstAmt2 = sgstAmt2;
		this.sgstAmt3 = sgstAmt3;
		this.sgstAmt4 = sgstAmt4;
		this.sgstAmt5 = sgstAmt5;
		this.sgstAmt6 = sgstAmt6;
		this.sgstAmt7 = sgstAmt7;
		this.sgstAmt8 = sgstAmt8;
		this.sgstAmt9 = sgstAmt9;
		this.sgstAmt10 = sgstAmt10;
		this.sgstAmt11 = sgstAmt11;
		this.sgstAmt12 = sgstAmt12;
		this.sgstAmt13 = sgstAmt13;
		this.sgstAmt14 = sgstAmt14;
		this.sgstAmt15 = sgstAmt15;
		this.igstAmt1 = igstAmt1;
		this.igstAmt2 = igstAmt2;
		this.igstAmt3 = igstAmt3;
		this.igstAmt4 = igstAmt4;
		this.igstAmt5 = igstAmt5;
		this.igstAmt6 = igstAmt6;
		this.igstAmt7 = igstAmt7;
		this.igstAmt8 = igstAmt8;
		this.igstAmt9 = igstAmt9;
		this.igstAmt10 = igstAmt10;
		this.igstAmt11 = igstAmt11;
		this.igstAmt12 = igstAmt12;
		this.igstAmt13 = igstAmt13;
		this.igstAmt14 = igstAmt14;
		this.igstAmt15 = igstAmt15;
		this.totalBillPay = totalBillPay;
		this.parameterShortName1 = parameterShortName1;
		this.parameterShortName2 = parameterShortName2;
		this.parameterShortName3 = parameterShortName3;
		this.parameterShortName4 = parameterShortName4;
		this.parameterShortName5 = parameterShortName5;
		this.parameterShortName6 = parameterShortName6;
		this.parameterShortName7 = parameterShortName7;
		this.parameterShortName8 = parameterShortName8;
		this.parameterShortName9 = parameterShortName9;
		this.parameterShortName10 = parameterShortName10;
		this.parameterShortName11 = parameterShortName11;
		this.parameterShortName12 = parameterShortName12;
		this.parameterShortName13 = parameterShortName13;
		this.parameterShortName14 = parameterShortName14;
		this.parameterShortName15 = parameterShortName15;
		this.parameterName1 = parameterName1;
		this.parameterName2 = parameterName2;
		this.parameterName3 = parameterName3;
		this.parameterName4 = parameterName4;
		this.parameterName5 = parameterName5;
		this.parameterName6 = parameterName6;
		this.parameterName7 = parameterName7;
		this.parameterName8 = parameterName8;
		this.parameterName9 = parameterName9;
		this.parameterName10 = parameterName10;
		this.parameterName11 = parameterName11;
		this.parameterName12 = parameterName12;
		this.parameterName13 = parameterName13;
		this.parameterName14 = parameterName14;
		this.parameterName15 = parameterName15;
		this.address_1 = address_1;
		this.address_2 = address_2;
		this.address_3 = address_3;
		this.highlightedFootNote = highlightedFootNote;
		this.bottomDesc = bottomDesc;
		this.bankDetail = bankDetail;
		this.authorisedSignatory = authorisedSignatory;
		this.digitalSign = digitalSign;
		this.name = name;
		this.arrears = arrears;
		this.intArrears = intArrears;
		this.totalAmount = totalAmount;
		this.memberCode = memberCode;
		this.societyCode = societyCode;
		this.accountingYear = accountingYear;
		this.rebateAmount = rebateAmount;
		this.area = area;
		this.memberNote = memberNote;
		this.email1 = email1;
		this.email2 = email2;
		this.amountInWords = amountInWords;
		this.parameterList = parameterList;
		this.emailID = emailID;
		this.password = password;
		this.receiptNo = receiptNo;
		this.receiptDate = receiptDate;
		this.selfBank = selfBank;
		this.partyName = partyName;
		this.bankName = bankName;
		this.branch = branch;
		this.amount = amount;
		this.narration = narration;
		this.docNo = docNo;
		this.chequeDate = chequeDate;
		this.letterMatter = letterMatter;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getInvCode() {
		return invCode;
	}
	public void setInvCode(String invCode) {
		this.invCode = invCode;
	}
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public String getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public String getBillDueDate() {
		return billDueDate;
	}
	public void setBillDueDate(String billDueDate) {
		this.billDueDate = billDueDate;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getEstablishmentType() {
		return establishmentType;
	}
	public void setEstablishmentType(String establishmentType) {
		this.establishmentType = establishmentType;
	}
	public String getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}
	public String getBldgNWing() {
		return bldgNWing;
	}
	public void setBldgNWing(String bldgNWing) {
		this.bldgNWing = bldgNWing;
	}
	public String getBillPeriod() {
		return billPeriod;
	}
	public void setBillPeriod(String billPeriod) {
		this.billPeriod = billPeriod;
	}
	public String getAmount1() {
		return amount1;
	}
	public void setAmount1(String amount1) {
		this.amount1 = amount1;
	}
	public String getAmount2() {
		return amount2;
	}
	public void setAmount2(String amount2) {
		this.amount2 = amount2;
	}
	public String getAmount3() {
		return amount3;
	}
	public void setAmount3(String amount3) {
		this.amount3 = amount3;
	}
	public String getAmount4() {
		return amount4;
	}
	public void setAmount4(String amount4) {
		this.amount4 = amount4;
	}
	public String getAmount5() {
		return amount5;
	}
	public void setAmount5(String amount5) {
		this.amount5 = amount5;
	}
	public String getAmount6() {
		return amount6;
	}
	public void setAmount6(String amount6) {
		this.amount6 = amount6;
	}
	public String getAmount7() {
		return amount7;
	}
	public void setAmount7(String amount7) {
		this.amount7 = amount7;
	}
	public String getAmount8() {
		return amount8;
	}
	public void setAmount8(String amount8) {
		this.amount8 = amount8;
	}
	public String getAmount9() {
		return amount9;
	}
	public void setAmount9(String amount9) {
		this.amount9 = amount9;
	}
	public String getAmount10() {
		return amount10;
	}
	public void setAmount10(String amount10) {
		this.amount10 = amount10;
	}
	public String getAmount11() {
		return amount11;
	}
	public void setAmount11(String amount11) {
		this.amount11 = amount11;
	}
	public String getAmount12() {
		return amount12;
	}
	public void setAmount12(String amount12) {
		this.amount12 = amount12;
	}
	public String getAmount13() {
		return amount13;
	}
	public void setAmount13(String amount13) {
		this.amount13 = amount13;
	}
	public String getAmount14() {
		return amount14;
	}
	public void setAmount14(String amount14) {
		this.amount14 = amount14;
	}
	public String getAmount15() {
		return amount15;
	}
	public void setAmount15(String amount15) {
		this.amount15 = amount15;
	}
	public String getCgstAmt1() {
		return cgstAmt1;
	}
	public void setCgstAmt1(String cgstAmt1) {
		this.cgstAmt1 = cgstAmt1;
	}
	public String getCgstAmt2() {
		return cgstAmt2;
	}
	public void setCgstAmt2(String cgstAmt2) {
		this.cgstAmt2 = cgstAmt2;
	}
	public String getCgstAmt3() {
		return cgstAmt3;
	}
	public void setCgstAmt3(String cgstAmt3) {
		this.cgstAmt3 = cgstAmt3;
	}
	public String getCgstAmt4() {
		return cgstAmt4;
	}
	public void setCgstAmt4(String cgstAmt4) {
		this.cgstAmt4 = cgstAmt4;
	}
	public String getCgstAmt5() {
		return cgstAmt5;
	}
	public void setCgstAmt5(String cgstAmt5) {
		this.cgstAmt5 = cgstAmt5;
	}
	public String getCgstAmt6() {
		return cgstAmt6;
	}
	public void setCgstAmt6(String cgstAmt6) {
		this.cgstAmt6 = cgstAmt6;
	}
	public String getCgstAmt7() {
		return cgstAmt7;
	}
	public void setCgstAmt7(String cgstAmt7) {
		this.cgstAmt7 = cgstAmt7;
	}
	public String getCgstAmt8() {
		return cgstAmt8;
	}
	public void setCgstAmt8(String cgstAmt8) {
		this.cgstAmt8 = cgstAmt8;
	}
	public String getCgstAmt9() {
		return cgstAmt9;
	}
	public void setCgstAmt9(String cgstAmt9) {
		this.cgstAmt9 = cgstAmt9;
	}
	public String getCgstAmt10() {
		return cgstAmt10;
	}
	public void setCgstAmt10(String cgstAmt10) {
		this.cgstAmt10 = cgstAmt10;
	}
	public String getCgstAmt11() {
		return cgstAmt11;
	}
	public void setCgstAmt11(String cgstAmt11) {
		this.cgstAmt11 = cgstAmt11;
	}
	public String getCgstAmt12() {
		return cgstAmt12;
	}
	public void setCgstAmt12(String cgstAmt12) {
		this.cgstAmt12 = cgstAmt12;
	}
	public String getCgstAmt13() {
		return cgstAmt13;
	}
	public void setCgstAmt13(String cgstAmt13) {
		this.cgstAmt13 = cgstAmt13;
	}
	public String getCgstAmt14() {
		return cgstAmt14;
	}
	public void setCgstAmt14(String cgstAmt14) {
		this.cgstAmt14 = cgstAmt14;
	}
	public String getCgstAmt15() {
		return cgstAmt15;
	}
	public void setCgstAmt15(String cgstAmt15) {
		this.cgstAmt15 = cgstAmt15;
	}
	public String getSgstAmt1() {
		return sgstAmt1;
	}
	public void setSgstAmt1(String sgstAmt1) {
		this.sgstAmt1 = sgstAmt1;
	}
	public String getSgstAmt2() {
		return sgstAmt2;
	}
	public void setSgstAmt2(String sgstAmt2) {
		this.sgstAmt2 = sgstAmt2;
	}
	public String getSgstAmt3() {
		return sgstAmt3;
	}
	public void setSgstAmt3(String sgstAmt3) {
		this.sgstAmt3 = sgstAmt3;
	}
	public String getSgstAmt4() {
		return sgstAmt4;
	}
	public void setSgstAmt4(String sgstAmt4) {
		this.sgstAmt4 = sgstAmt4;
	}
	public String getSgstAmt5() {
		return sgstAmt5;
	}
	public void setSgstAmt5(String sgstAmt5) {
		this.sgstAmt5 = sgstAmt5;
	}
	public String getSgstAmt6() {
		return sgstAmt6;
	}
	public void setSgstAmt6(String sgstAmt6) {
		this.sgstAmt6 = sgstAmt6;
	}
	public String getSgstAmt7() {
		return sgstAmt7;
	}
	public void setSgstAmt7(String sgstAmt7) {
		this.sgstAmt7 = sgstAmt7;
	}
	public String getSgstAmt8() {
		return sgstAmt8;
	}
	public void setSgstAmt8(String sgstAmt8) {
		this.sgstAmt8 = sgstAmt8;
	}
	public String getSgstAmt9() {
		return sgstAmt9;
	}
	public void setSgstAmt9(String sgstAmt9) {
		this.sgstAmt9 = sgstAmt9;
	}
	public String getSgstAmt10() {
		return sgstAmt10;
	}
	public void setSgstAmt10(String sgstAmt10) {
		this.sgstAmt10 = sgstAmt10;
	}
	public String getSgstAmt11() {
		return sgstAmt11;
	}
	public void setSgstAmt11(String sgstAmt11) {
		this.sgstAmt11 = sgstAmt11;
	}
	public String getSgstAmt12() {
		return sgstAmt12;
	}
	public void setSgstAmt12(String sgstAmt12) {
		this.sgstAmt12 = sgstAmt12;
	}
	public String getSgstAmt13() {
		return sgstAmt13;
	}
	public void setSgstAmt13(String sgstAmt13) {
		this.sgstAmt13 = sgstAmt13;
	}
	public String getSgstAmt14() {
		return sgstAmt14;
	}
	public void setSgstAmt14(String sgstAmt14) {
		this.sgstAmt14 = sgstAmt14;
	}
	public String getSgstAmt15() {
		return sgstAmt15;
	}
	public void setSgstAmt15(String sgstAmt15) {
		this.sgstAmt15 = sgstAmt15;
	}
	public String getIgstAmt1() {
		return igstAmt1;
	}
	public void setIgstAmt1(String igstAmt1) {
		this.igstAmt1 = igstAmt1;
	}
	public String getIgstAmt2() {
		return igstAmt2;
	}
	public void setIgstAmt2(String igstAmt2) {
		this.igstAmt2 = igstAmt2;
	}
	public String getIgstAmt3() {
		return igstAmt3;
	}
	public void setIgstAmt3(String igstAmt3) {
		this.igstAmt3 = igstAmt3;
	}
	public String getIgstAmt4() {
		return igstAmt4;
	}
	public void setIgstAmt4(String igstAmt4) {
		this.igstAmt4 = igstAmt4;
	}
	public String getIgstAmt5() {
		return igstAmt5;
	}
	public void setIgstAmt5(String igstAmt5) {
		this.igstAmt5 = igstAmt5;
	}
	public String getIgstAmt6() {
		return igstAmt6;
	}
	public void setIgstAmt6(String igstAmt6) {
		this.igstAmt6 = igstAmt6;
	}
	public String getIgstAmt7() {
		return igstAmt7;
	}
	public void setIgstAmt7(String igstAmt7) {
		this.igstAmt7 = igstAmt7;
	}
	public String getIgstAmt8() {
		return igstAmt8;
	}
	public void setIgstAmt8(String igstAmt8) {
		this.igstAmt8 = igstAmt8;
	}
	public String getIgstAmt9() {
		return igstAmt9;
	}
	public void setIgstAmt9(String igstAmt9) {
		this.igstAmt9 = igstAmt9;
	}
	public String getIgstAmt10() {
		return igstAmt10;
	}
	public void setIgstAmt10(String igstAmt10) {
		this.igstAmt10 = igstAmt10;
	}
	public String getIgstAmt11() {
		return igstAmt11;
	}
	public void setIgstAmt11(String igstAmt11) {
		this.igstAmt11 = igstAmt11;
	}
	public String getIgstAmt12() {
		return igstAmt12;
	}
	public void setIgstAmt12(String igstAmt12) {
		this.igstAmt12 = igstAmt12;
	}
	public String getIgstAmt13() {
		return igstAmt13;
	}
	public void setIgstAmt13(String igstAmt13) {
		this.igstAmt13 = igstAmt13;
	}
	public String getIgstAmt14() {
		return igstAmt14;
	}
	public void setIgstAmt14(String igstAmt14) {
		this.igstAmt14 = igstAmt14;
	}
	public String getIgstAmt15() {
		return igstAmt15;
	}
	public void setIgstAmt15(String igstAmt15) {
		this.igstAmt15 = igstAmt15;
	}
	public String getTotalBillPay() {
		return totalBillPay;
	}
	public void setTotalBillPay(String totalBillPay) {
		this.totalBillPay = totalBillPay;
	}
	public String getParameterShortName1() {
		return parameterShortName1;
	}
	public void setParameterShortName1(String parameterShortName1) {
		this.parameterShortName1 = parameterShortName1;
	}
	public String getParameterShortName2() {
		return parameterShortName2;
	}
	public void setParameterShortName2(String parameterShortName2) {
		this.parameterShortName2 = parameterShortName2;
	}
	public String getParameterShortName3() {
		return parameterShortName3;
	}
	public void setParameterShortName3(String parameterShortName3) {
		this.parameterShortName3 = parameterShortName3;
	}
	public String getParameterShortName4() {
		return parameterShortName4;
	}
	public void setParameterShortName4(String parameterShortName4) {
		this.parameterShortName4 = parameterShortName4;
	}
	public String getParameterShortName5() {
		return parameterShortName5;
	}
	public void setParameterShortName5(String parameterShortName5) {
		this.parameterShortName5 = parameterShortName5;
	}
	public String getParameterShortName6() {
		return parameterShortName6;
	}
	public void setParameterShortName6(String parameterShortName6) {
		this.parameterShortName6 = parameterShortName6;
	}
	public String getParameterShortName7() {
		return parameterShortName7;
	}
	public void setParameterShortName7(String parameterShortName7) {
		this.parameterShortName7 = parameterShortName7;
	}
	public String getParameterShortName8() {
		return parameterShortName8;
	}
	public void setParameterShortName8(String parameterShortName8) {
		this.parameterShortName8 = parameterShortName8;
	}
	public String getParameterShortName9() {
		return parameterShortName9;
	}
	public void setParameterShortName9(String parameterShortName9) {
		this.parameterShortName9 = parameterShortName9;
	}
	public String getParameterShortName10() {
		return parameterShortName10;
	}
	public void setParameterShortName10(String parameterShortName10) {
		this.parameterShortName10 = parameterShortName10;
	}
	public String getParameterShortName11() {
		return parameterShortName11;
	}
	public void setParameterShortName11(String parameterShortName11) {
		this.parameterShortName11 = parameterShortName11;
	}
	public String getParameterShortName12() {
		return parameterShortName12;
	}
	public void setParameterShortName12(String parameterShortName12) {
		this.parameterShortName12 = parameterShortName12;
	}
	public String getParameterShortName13() {
		return parameterShortName13;
	}
	public void setParameterShortName13(String parameterShortName13) {
		this.parameterShortName13 = parameterShortName13;
	}
	public String getParameterShortName14() {
		return parameterShortName14;
	}
	public void setParameterShortName14(String parameterShortName14) {
		this.parameterShortName14 = parameterShortName14;
	}
	public String getParameterShortName15() {
		return parameterShortName15;
	}
	public void setParameterShortName15(String parameterShortName15) {
		this.parameterShortName15 = parameterShortName15;
	}
	public String getParameterName1() {
		return parameterName1;
	}
	public void setParameterName1(String parameterName1) {
		this.parameterName1 = parameterName1;
	}
	public String getParameterName2() {
		return parameterName2;
	}
	public void setParameterName2(String parameterName2) {
		this.parameterName2 = parameterName2;
	}
	public String getParameterName3() {
		return parameterName3;
	}
	public void setParameterName3(String parameterName3) {
		this.parameterName3 = parameterName3;
	}
	public String getParameterName4() {
		return parameterName4;
	}
	public void setParameterName4(String parameterName4) {
		this.parameterName4 = parameterName4;
	}
	public String getParameterName5() {
		return parameterName5;
	}
	public void setParameterName5(String parameterName5) {
		this.parameterName5 = parameterName5;
	}
	public String getParameterName6() {
		return parameterName6;
	}
	public void setParameterName6(String parameterName6) {
		this.parameterName6 = parameterName6;
	}
	public String getParameterName7() {
		return parameterName7;
	}
	public void setParameterName7(String parameterName7) {
		this.parameterName7 = parameterName7;
	}
	public String getParameterName8() {
		return parameterName8;
	}
	public void setParameterName8(String parameterName8) {
		this.parameterName8 = parameterName8;
	}
	public String getParameterName9() {
		return parameterName9;
	}
	public void setParameterName9(String parameterName9) {
		this.parameterName9 = parameterName9;
	}
	public String getParameterName10() {
		return parameterName10;
	}
	public void setParameterName10(String parameterName10) {
		this.parameterName10 = parameterName10;
	}
	public String getParameterName11() {
		return parameterName11;
	}
	public void setParameterName11(String parameterName11) {
		this.parameterName11 = parameterName11;
	}
	public String getParameterName12() {
		return parameterName12;
	}
	public void setParameterName12(String parameterName12) {
		this.parameterName12 = parameterName12;
	}
	public String getParameterName13() {
		return parameterName13;
	}
	public void setParameterName13(String parameterName13) {
		this.parameterName13 = parameterName13;
	}
	public String getParameterName14() {
		return parameterName14;
	}
	public void setParameterName14(String parameterName14) {
		this.parameterName14 = parameterName14;
	}
	public String getParameterName15() {
		return parameterName15;
	}
	public void setParameterName15(String parameterName15) {
		this.parameterName15 = parameterName15;
	}
	public String getAddress_1() {
		return address_1;
	}
	public void setAddress_1(String address_1) {
		this.address_1 = address_1;
	}
	public String getAddress_2() {
		return address_2;
	}
	public void setAddress_2(String address_2) {
		this.address_2 = address_2;
	}
	public String getAddress_3() {
		return address_3;
	}
	public void setAddress_3(String address_3) {
		this.address_3 = address_3;
	}
	public String getHighlightedFootNote() {
		return highlightedFootNote;
	}
	public void setHighlightedFootNote(String highlightedFootNote) {
		this.highlightedFootNote = highlightedFootNote;
	}
	public String getBottomDesc() {
		return bottomDesc;
	}
	public void setBottomDesc(String bottomDesc) {
		this.bottomDesc = bottomDesc;
	}
	public String getBankDetail() {
		return bankDetail;
	}
	public void setBankDetail(String bankDetail) {
		this.bankDetail = bankDetail;
	}
	public String getAuthorisedSignatory() {
		return authorisedSignatory;
	}
	public void setAuthorisedSignatory(String authorisedSignatory) {
		this.authorisedSignatory = authorisedSignatory;
	}
	public String getDigitalSign() {
		return digitalSign;
	}
	public void setDigitalSign(String digitalSign) {
		this.digitalSign = digitalSign;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArrears() {
		return arrears;
	}
	public void setArrears(String arrears) {
		this.arrears = arrears;
	}
	public String getIntArrears() {
		return intArrears;
	}
	public void setIntArrears(String intArrears) {
		this.intArrears = intArrears;
	}
	public String getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getMemberCode() {
		return memberCode;
	}
	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
	}
	public String getSocietyCode() {
		return societyCode;
	}
	public void setSocietyCode(String societyCode) {
		this.societyCode = societyCode;
	}
	public String getAccountingYear() {
		return accountingYear;
	}
	public void setAccountingYear(String accountingYear) {
		this.accountingYear = accountingYear;
	}
	public String getRebateAmount() {
		return rebateAmount;
	}
	public void setRebateAmount(String rebateAmount) {
		this.rebateAmount = rebateAmount;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getMemberNote() {
		return memberNote;
	}
	public void setMemberNote(String memberNote) {
		this.memberNote = memberNote;
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
	public String getAmountInWords() {
		return amountInWords;
	}
	public void setAmountInWords(String amountInWords) {
		this.amountInWords = amountInWords;
	}
	public List<BillParametersDTO> getParameterList() {
		return parameterList;
	}
	public void setParameterList(List<BillParametersDTO> parameterList) {
		this.parameterList = parameterList;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getReceiptNo() {
		return receiptNo;
	}
	public void setReceiptNo(String receiptNo) {
		this.receiptNo = receiptNo;
	}
	public String getReceiptDate() {
		return receiptDate;
	}
	public void setReceiptDate(String receiptDate) {
		this.receiptDate = receiptDate;
	}
	public String getSelfBank() {
		return selfBank;
	}
	public void setSelfBank(String selfBank) {
		this.selfBank = selfBank;
	}
	public String getPartyName() {
		return partyName;
	}
	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getNarration() {
		return narration;
	}
	public void setNarration(String narration) {
		this.narration = narration;
	}
	public String getDocNo() {
		return docNo;
	}
	public void setDocNo(String docNo) {
		this.docNo = docNo;
	}
	public String getChequeDate() {
		return chequeDate;
	}
	public void setChequeDate(String chequeDate) {
		this.chequeDate = chequeDate;
	}
	public String getLetterMatter() {
		return letterMatter;
	}
	public void setLetterMatter(String letterMatter) {
		this.letterMatter = letterMatter;
	}
	@Override
	public String toString() {
		return "BillRegisterDTO [id=" + id + ", invCode=" + invCode + ", invoiceNo=" + invoiceNo + ", invoiceDate="
				+ invoiceDate + ", billDueDate=" + billDueDate + ", memberName=" + memberName + ", establishmentType="
				+ establishmentType + ", flatNo=" + flatNo + ", bldgNWing=" + bldgNWing + ", billPeriod=" + billPeriod
				+ ", amount1=" + amount1 + ", amount2=" + amount2 + ", amount3=" + amount3 + ", amount4=" + amount4
				+ ", amount5=" + amount5 + ", amount6=" + amount6 + ", amount7=" + amount7 + ", amount8=" + amount8
				+ ", amount9=" + amount9 + ", amount10=" + amount10 + ", amount11=" + amount11 + ", amount12="
				+ amount12 + ", amount13=" + amount13 + ", amount14=" + amount14 + ", amount15=" + amount15
				+ ", cgstAmt1=" + cgstAmt1 + ", cgstAmt2=" + cgstAmt2 + ", cgstAmt3=" + cgstAmt3 + ", cgstAmt4="
				+ cgstAmt4 + ", cgstAmt5=" + cgstAmt5 + ", cgstAmt6=" + cgstAmt6 + ", cgstAmt7=" + cgstAmt7
				+ ", cgstAmt8=" + cgstAmt8 + ", cgstAmt9=" + cgstAmt9 + ", cgstAmt10=" + cgstAmt10 + ", cgstAmt11="
				+ cgstAmt11 + ", cgstAmt12=" + cgstAmt12 + ", cgstAmt13=" + cgstAmt13 + ", cgstAmt14=" + cgstAmt14
				+ ", cgstAmt15=" + cgstAmt15 + ", sgstAmt1=" + sgstAmt1 + ", sgstAmt2=" + sgstAmt2 + ", sgstAmt3="
				+ sgstAmt3 + ", sgstAmt4=" + sgstAmt4 + ", sgstAmt5=" + sgstAmt5 + ", sgstAmt6=" + sgstAmt6
				+ ", sgstAmt7=" + sgstAmt7 + ", sgstAmt8=" + sgstAmt8 + ", sgstAmt9=" + sgstAmt9 + ", sgstAmt10="
				+ sgstAmt10 + ", sgstAmt11=" + sgstAmt11 + ", sgstAmt12=" + sgstAmt12 + ", sgstAmt13=" + sgstAmt13
				+ ", sgstAmt14=" + sgstAmt14 + ", sgstAmt15=" + sgstAmt15 + ", igstAmt1=" + igstAmt1 + ", igstAmt2="
				+ igstAmt2 + ", igstAmt3=" + igstAmt3 + ", igstAmt4=" + igstAmt4 + ", igstAmt5=" + igstAmt5
				+ ", igstAmt6=" + igstAmt6 + ", igstAmt7=" + igstAmt7 + ", igstAmt8=" + igstAmt8 + ", igstAmt9="
				+ igstAmt9 + ", igstAmt10=" + igstAmt10 + ", igstAmt11=" + igstAmt11 + ", igstAmt12=" + igstAmt12
				+ ", igstAmt13=" + igstAmt13 + ", igstAmt14=" + igstAmt14 + ", igstAmt15=" + igstAmt15
				+ ", totalBillPay=" + totalBillPay + ", parameterShortName1=" + parameterShortName1
				+ ", parameterShortName2=" + parameterShortName2 + ", parameterShortName3=" + parameterShortName3
				+ ", parameterShortName4=" + parameterShortName4 + ", parameterShortName5=" + parameterShortName5
				+ ", parameterShortName6=" + parameterShortName6 + ", parameterShortName7=" + parameterShortName7
				+ ", parameterShortName8=" + parameterShortName8 + ", parameterShortName9=" + parameterShortName9
				+ ", parameterShortName10=" + parameterShortName10 + ", parameterShortName11=" + parameterShortName11
				+ ", parameterShortName12=" + parameterShortName12 + ", parameterShortName13=" + parameterShortName13
				+ ", parameterShortName14=" + parameterShortName14 + ", parameterShortName15=" + parameterShortName15
				+ ", parameterName1=" + parameterName1 + ", parameterName2=" + parameterName2 + ", parameterName3="
				+ parameterName3 + ", parameterName4=" + parameterName4 + ", parameterName5=" + parameterName5
				+ ", parameterName6=" + parameterName6 + ", parameterName7=" + parameterName7 + ", parameterName8="
				+ parameterName8 + ", parameterName9=" + parameterName9 + ", parameterName10=" + parameterName10
				+ ", parameterName11=" + parameterName11 + ", parameterName12=" + parameterName12 + ", parameterName13="
				+ parameterName13 + ", parameterName14=" + parameterName14 + ", parameterName15=" + parameterName15
				+ ", address_1=" + address_1 + ", address_2=" + address_2 + ", address_3=" + address_3
				+ ", highlightedFootNote=" + highlightedFootNote + ", bottomDesc=" + bottomDesc + ", bankDetail="
				+ bankDetail + ", authorisedSignatory=" + authorisedSignatory + ", digitalSign=" + digitalSign
				+ ", name=" + name + ", arrears=" + arrears + ", intArrears=" + intArrears + ", totalAmount="
				+ totalAmount + ", memberCode=" + memberCode + ", societyCode=" + societyCode + ", accountingYear="
				+ accountingYear + ", rebateAmount=" + rebateAmount + ", area=" + area + ", memberNote=" + memberNote
				+ ", email1=" + email1 + ", email2=" + email2 + ", amountInWords=" + amountInWords + ", parameterList="
				+ parameterList + ", emailID=" + emailID + ", password=" + password + ", receiptNo=" + receiptNo
				+ ", receiptDate=" + receiptDate + ", selfBank=" + selfBank + ", partyName=" + partyName + ", bankName="
				+ bankName + ", branch=" + branch + ", amount=" + amount + ", narration=" + narration + ", docNo="
				+ docNo + ", chequeDate=" + chequeDate + ", letterMatter=" + letterMatter + "]";
	}
		}