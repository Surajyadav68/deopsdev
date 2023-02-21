package com.suninfotech.admin.dto;

public class ParameterSetupDTO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String societycode;
	private String address1;
	private String address2;
	private String address3;
	private String highlightedfootnote;
	private String bottomdesc;
	private String emailID;
	private String password;
	private String BankDetail;

	private String regCreditmonths;
	private String regCreditdays;
	private String regInttype;
	private String regIntrate;
	private String regPenalty;
	private String regRebaterate;
	private String regRebateamt;
	private String CGST;
	private String SGST;
	private String IGST;
	private String TaxAmt;
	private String regRebatedays;
	private String authorisedsignatory;
	private String digitalSign;

	private String billfrequency;
	private String lastinvoiceno;
	private String yeardays;
	private String accountingyear;
	private String parametershortname1;
	private String parametername;
	private String ratepersqft1;
	private String flatamount1;
	private String cb1;
	private String parametershortname2;
	private String parametername2;
	private String ratepersqft2;
	private String flatamount2;
	private String cb2;
	private String parametershortname3;
	private String parametername3;
	private String ratepersqft3;
	private String flatamount3;
	private String cb3;
	private String parametershortname4;
	private String parametername4;
	private String ratepersqft4;
	private String flatamount4;
	private String cb4;
	private String parametershortname5;
	private String parametername5;
	private String ratepersqft5;
	private String flatamount5;
	private String cb5;
	private String parametershortname6;
	private String parametername6;
	private String ratepersqft6;
	private String flatamount6;
	private String cb6;
	private String parametershortname7;
	private String parametername7;
	private String ratepersqft7;
	private String flatamount7;
	private String cb7;
	private String parametershortname8;
	private String parametername8;
	private String ratepersqft8;
	private String flatamount8;
	private String cb8;
	private String parametershortname9;
	private String parametername9;
	private String ratepersqft9;
	private String flatamount9;
	private String cb9;
	private String parametershortname10;
	private String parametername10;
	private String ratepersqft10;
	private String flatamount10;
	private String cb10;
	private String parametershortname11;
	private String parametername11;
	private String ratepersqft11;
	private String flatamount11;
	private String cb11;
	private String parametershortname12;
	private String parametername12;
	private String ratepersqft12;
	private String flatamount12;
	private String cb12;
	private String parametershortname13;
	private String parametername13;
	private String ratepersqft13;
	private String flatamount13;
	private String cb13;
	private String parametershortname14;
	private String parametername14;
	private String ratepersqft14;
	private String flatamount14;
	private String cb14;
	private String parametershortname15;
	private String parametername15;
	private String ratepersqft15;
	private String flatamount15;

	private String IntOnCreditPeriod;
	private String IntOnOPBal;

	private int LastReceiptNo;

	public ParameterSetupDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ParameterSetupDTO(String id, String societycode, String address1, String address2, String address3,
			String highlightedfootnote, String bottomdesc, String emailID, String password, String bankDetail,
			String regCreditmonths, String regCreditdays, String regInttype, String regIntrate, String regPenalty,
			String regRebaterate, String regRebateamt, String cGST, String sGST, String iGST, String taxAmt,
			String regRebatedays, String authorisedsignatory, String digitalSign, String billfrequency,
			String lastinvoiceno, String yeardays, String accountingyear, String parametershortname1,
			String parametername, String ratepersqft1, String flatamount1, String cb1, String parametershortname2,
			String parametername2, String ratepersqft2, String flatamount2, String cb2, String parametershortname3,
			String parametername3, String ratepersqft3, String flatamount3, String cb3, String parametershortname4,
			String parametername4, String ratepersqft4, String flatamount4, String cb4, String parametershortname5,
			String parametername5, String ratepersqft5, String flatamount5, String cb5, String parametershortname6,
			String parametername6, String ratepersqft6, String flatamount6, String cb6, String parametershortname7,
			String parametername7, String ratepersqft7, String flatamount7, String cb7, String parametershortname8,
			String parametername8, String ratepersqft8, String flatamount8, String cb8, String parametershortname9,
			String parametername9, String ratepersqft9, String flatamount9, String cb9, String parametershortname10,
			String parametername10, String ratepersqft10, String flatamount10, String cb10, String parametershortname11,
			String parametername11, String ratepersqft11, String flatamount11, String cb11, String parametershortname12,
			String parametername12, String ratepersqft12, String flatamount12, String cb12, String parametershortname13,
			String parametername13, String ratepersqft13, String flatamount13, String cb13, String parametershortname14,
			String parametername14, String ratepersqft14, String flatamount14, String cb14, String parametershortname15,
			String parametername15, String ratepersqft15, String flatamount15, String intOnCreditPeriod,
			String intOnOPBal, int lastReceiptNo) {
		super();
		this.id = id;
		this.societycode = societycode;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.highlightedfootnote = highlightedfootnote;
		this.bottomdesc = bottomdesc;
		this.emailID = emailID;
		this.password = password;
		BankDetail = bankDetail;
		this.regCreditmonths = regCreditmonths;
		this.regCreditdays = regCreditdays;
		this.regInttype = regInttype;
		this.regIntrate = regIntrate;
		this.regPenalty = regPenalty;
		this.regRebaterate = regRebaterate;
		this.regRebateamt = regRebateamt;
		CGST = cGST;
		SGST = sGST;
		IGST = iGST;
		TaxAmt = taxAmt;
		this.regRebatedays = regRebatedays;
		this.authorisedsignatory = authorisedsignatory;
		this.digitalSign = digitalSign;
		this.billfrequency = billfrequency;
		this.lastinvoiceno = lastinvoiceno;
		this.yeardays = yeardays;
		this.accountingyear = accountingyear;
		this.parametershortname1 = parametershortname1;
		this.parametername = parametername;
		this.ratepersqft1 = ratepersqft1;
		this.flatamount1 = flatamount1;
		this.cb1 = cb1;
		this.parametershortname2 = parametershortname2;
		this.parametername2 = parametername2;
		this.ratepersqft2 = ratepersqft2;
		this.flatamount2 = flatamount2;
		this.cb2 = cb2;
		this.parametershortname3 = parametershortname3;
		this.parametername3 = parametername3;
		this.ratepersqft3 = ratepersqft3;
		this.flatamount3 = flatamount3;
		this.cb3 = cb3;
		this.parametershortname4 = parametershortname4;
		this.parametername4 = parametername4;
		this.ratepersqft4 = ratepersqft4;
		this.flatamount4 = flatamount4;
		this.cb4 = cb4;
		this.parametershortname5 = parametershortname5;
		this.parametername5 = parametername5;
		this.ratepersqft5 = ratepersqft5;
		this.flatamount5 = flatamount5;
		this.cb5 = cb5;
		this.parametershortname6 = parametershortname6;
		this.parametername6 = parametername6;
		this.ratepersqft6 = ratepersqft6;
		this.flatamount6 = flatamount6;
		this.cb6 = cb6;
		this.parametershortname7 = parametershortname7;
		this.parametername7 = parametername7;
		this.ratepersqft7 = ratepersqft7;
		this.flatamount7 = flatamount7;
		this.cb7 = cb7;
		this.parametershortname8 = parametershortname8;
		this.parametername8 = parametername8;
		this.ratepersqft8 = ratepersqft8;
		this.flatamount8 = flatamount8;
		this.cb8 = cb8;
		this.parametershortname9 = parametershortname9;
		this.parametername9 = parametername9;
		this.ratepersqft9 = ratepersqft9;
		this.flatamount9 = flatamount9;
		this.cb9 = cb9;
		this.parametershortname10 = parametershortname10;
		this.parametername10 = parametername10;
		this.ratepersqft10 = ratepersqft10;
		this.flatamount10 = flatamount10;
		this.cb10 = cb10;
		this.parametershortname11 = parametershortname11;
		this.parametername11 = parametername11;
		this.ratepersqft11 = ratepersqft11;
		this.flatamount11 = flatamount11;
		this.cb11 = cb11;
		this.parametershortname12 = parametershortname12;
		this.parametername12 = parametername12;
		this.ratepersqft12 = ratepersqft12;
		this.flatamount12 = flatamount12;
		this.cb12 = cb12;
		this.parametershortname13 = parametershortname13;
		this.parametername13 = parametername13;
		this.ratepersqft13 = ratepersqft13;
		this.flatamount13 = flatamount13;
		this.cb13 = cb13;
		this.parametershortname14 = parametershortname14;
		this.parametername14 = parametername14;
		this.ratepersqft14 = ratepersqft14;
		this.flatamount14 = flatamount14;
		this.cb14 = cb14;
		this.parametershortname15 = parametershortname15;
		this.parametername15 = parametername15;
		this.ratepersqft15 = ratepersqft15;
		this.flatamount15 = flatamount15;
		IntOnCreditPeriod = intOnCreditPeriod;
		IntOnOPBal = intOnOPBal;
		LastReceiptNo = lastReceiptNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSocietycode() {
		return societycode;
	}

	public void setSocietycode(String societycode) {
		this.societycode = societycode;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getHighlightedfootnote() {
		return highlightedfootnote;
	}

	public void setHighlightedfootnote(String highlightedfootnote) {
		this.highlightedfootnote = highlightedfootnote;
	}

	public String getBottomdesc() {
		return bottomdesc;
	}

	public void setBottomdesc(String bottomdesc) {
		this.bottomdesc = bottomdesc;
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

	public String getBankDetail() {
		return BankDetail;
	}

	public void setBankDetail(String bankDetail) {
		BankDetail = bankDetail;
	}

	public String getRegCreditmonths() {
		return regCreditmonths;
	}

	public void setRegCreditmonths(String regCreditmonths) {
		this.regCreditmonths = regCreditmonths;
	}

	public String getRegCreditdays() {
		return regCreditdays;
	}

	public void setRegCreditdays(String regCreditdays) {
		this.regCreditdays = regCreditdays;
	}

	public String getRegInttype() {
		return regInttype;
	}

	public void setRegInttype(String regInttype) {
		this.regInttype = regInttype;
	}

	public String getRegIntrate() {
		return regIntrate;
	}

	public void setRegIntrate(String regIntrate) {
		this.regIntrate = regIntrate;
	}

	public String getRegPenalty() {
		return regPenalty;
	}

	public void setRegPenalty(String regPenalty) {
		this.regPenalty = regPenalty;
	}

	public String getRegRebaterate() {
		return regRebaterate;
	}

	public void setRegRebaterate(String regRebaterate) {
		this.regRebaterate = regRebaterate;
	}

	public String getRegRebateamt() {
		return regRebateamt;
	}

	public void setRegRebateamt(String regRebateamt) {
		this.regRebateamt = regRebateamt;
	}

	public String getCGST() {
		return CGST;
	}

	public void setCGST(String cGST) {
		CGST = cGST;
	}

	public String getSGST() {
		return SGST;
	}

	public void setSGST(String sGST) {
		SGST = sGST;
	}

	public String getIGST() {
		return IGST;
	}

	public void setIGST(String iGST) {
		IGST = iGST;
	}

	public String getTaxAmt() {
		return TaxAmt;
	}

	public void setTaxAmt(String taxAmt) {
		TaxAmt = taxAmt;
	}

	public String getRegRebatedays() {
		return regRebatedays;
	}

	public void setRegRebatedays(String regRebatedays) {
		this.regRebatedays = regRebatedays;
	}

	public String getAuthorisedsignatory() {
		return authorisedsignatory;
	}

	public void setAuthorisedsignatory(String authorisedsignatory) {
		this.authorisedsignatory = authorisedsignatory;
	}

	public String getDigitalSign() {
		return digitalSign;
	}

	public void setDigitalSign(String digitalSign) {
		this.digitalSign = digitalSign;
	}

	public String getBillfrequency() {
		return billfrequency;
	}

	public void setBillfrequency(String billfrequency) {
		this.billfrequency = billfrequency;
	}

	public String getLastinvoiceno() {
		return lastinvoiceno;
	}

	public void setLastinvoiceno(String lastinvoiceno) {
		this.lastinvoiceno = lastinvoiceno;
	}

	public String getYeardays() {
		return yeardays;
	}

	public void setYeardays(String yeardays) {
		this.yeardays = yeardays;
	}

	public String getAccountingyear() {
		return accountingyear;
	}

	public void setAccountingyear(String accountingyear) {
		this.accountingyear = accountingyear;
	}

	public String getParametershortname1() {
		return parametershortname1;
	}

	public void setParametershortname1(String parametershortname1) {
		this.parametershortname1 = parametershortname1;
	}

	public String getParametername() {
		return parametername;
	}

	public void setParametername(String parametername) {
		this.parametername = parametername;
	}

	public String getRatepersqft1() {
		return ratepersqft1;
	}

	public void setRatepersqft1(String ratepersqft1) {
		this.ratepersqft1 = ratepersqft1;
	}

	public String getFlatamount1() {
		return flatamount1;
	}

	public void setFlatamount1(String flatamount1) {
		this.flatamount1 = flatamount1;
	}

	public String getCb1() {
		return cb1;
	}

	public void setCb1(String cb1) {
		this.cb1 = cb1;
	}

	public String getParametershortname2() {
		return parametershortname2;
	}

	public void setParametershortname2(String parametershortname2) {
		this.parametershortname2 = parametershortname2;
	}

	public String getParametername2() {
		return parametername2;
	}

	public void setParametername2(String parametername2) {
		this.parametername2 = parametername2;
	}

	public String getRatepersqft2() {
		return ratepersqft2;
	}

	public void setRatepersqft2(String ratepersqft2) {
		this.ratepersqft2 = ratepersqft2;
	}

	public String getFlatamount2() {
		return flatamount2;
	}

	public void setFlatamount2(String flatamount2) {
		this.flatamount2 = flatamount2;
	}

	public String getCb2() {
		return cb2;
	}

	public void setCb2(String cb2) {
		this.cb2 = cb2;
	}

	public String getParametershortname3() {
		return parametershortname3;
	}

	public void setParametershortname3(String parametershortname3) {
		this.parametershortname3 = parametershortname3;
	}

	public String getParametername3() {
		return parametername3;
	}

	public void setParametername3(String parametername3) {
		this.parametername3 = parametername3;
	}

	public String getRatepersqft3() {
		return ratepersqft3;
	}

	public void setRatepersqft3(String ratepersqft3) {
		this.ratepersqft3 = ratepersqft3;
	}

	public String getFlatamount3() {
		return flatamount3;
	}

	public void setFlatamount3(String flatamount3) {
		this.flatamount3 = flatamount3;
	}

	public String getCb3() {
		return cb3;
	}

	public void setCb3(String cb3) {
		this.cb3 = cb3;
	}

	public String getParametershortname4() {
		return parametershortname4;
	}

	public void setParametershortname4(String parametershortname4) {
		this.parametershortname4 = parametershortname4;
	}

	public String getParametername4() {
		return parametername4;
	}

	public void setParametername4(String parametername4) {
		this.parametername4 = parametername4;
	}

	public String getRatepersqft4() {
		return ratepersqft4;
	}

	public void setRatepersqft4(String ratepersqft4) {
		this.ratepersqft4 = ratepersqft4;
	}

	public String getFlatamount4() {
		return flatamount4;
	}

	public void setFlatamount4(String flatamount4) {
		this.flatamount4 = flatamount4;
	}

	public String getCb4() {
		return cb4;
	}

	public void setCb4(String cb4) {
		this.cb4 = cb4;
	}

	public String getParametershortname5() {
		return parametershortname5;
	}

	public void setParametershortname5(String parametershortname5) {
		this.parametershortname5 = parametershortname5;
	}

	public String getParametername5() {
		return parametername5;
	}

	public void setParametername5(String parametername5) {
		this.parametername5 = parametername5;
	}

	public String getRatepersqft5() {
		return ratepersqft5;
	}

	public void setRatepersqft5(String ratepersqft5) {
		this.ratepersqft5 = ratepersqft5;
	}

	public String getFlatamount5() {
		return flatamount5;
	}

	public void setFlatamount5(String flatamount5) {
		this.flatamount5 = flatamount5;
	}

	public String getCb5() {
		return cb5;
	}

	public void setCb5(String cb5) {
		this.cb5 = cb5;
	}

	public String getParametershortname6() {
		return parametershortname6;
	}

	public void setParametershortname6(String parametershortname6) {
		this.parametershortname6 = parametershortname6;
	}

	public String getParametername6() {
		return parametername6;
	}

	public void setParametername6(String parametername6) {
		this.parametername6 = parametername6;
	}

	public String getRatepersqft6() {
		return ratepersqft6;
	}

	public void setRatepersqft6(String ratepersqft6) {
		this.ratepersqft6 = ratepersqft6;
	}

	public String getFlatamount6() {
		return flatamount6;
	}

	public void setFlatamount6(String flatamount6) {
		this.flatamount6 = flatamount6;
	}

	public String getCb6() {
		return cb6;
	}

	public void setCb6(String cb6) {
		this.cb6 = cb6;
	}

	public String getParametershortname7() {
		return parametershortname7;
	}

	public void setParametershortname7(String parametershortname7) {
		this.parametershortname7 = parametershortname7;
	}

	public String getParametername7() {
		return parametername7;
	}

	public void setParametername7(String parametername7) {
		this.parametername7 = parametername7;
	}

	public String getRatepersqft7() {
		return ratepersqft7;
	}

	public void setRatepersqft7(String ratepersqft7) {
		this.ratepersqft7 = ratepersqft7;
	}

	public String getFlatamount7() {
		return flatamount7;
	}

	public void setFlatamount7(String flatamount7) {
		this.flatamount7 = flatamount7;
	}

	public String getCb7() {
		return cb7;
	}

	public void setCb7(String cb7) {
		this.cb7 = cb7;
	}

	public String getParametershortname8() {
		return parametershortname8;
	}

	public void setParametershortname8(String parametershortname8) {
		this.parametershortname8 = parametershortname8;
	}

	public String getParametername8() {
		return parametername8;
	}

	public void setParametername8(String parametername8) {
		this.parametername8 = parametername8;
	}

	public String getRatepersqft8() {
		return ratepersqft8;
	}

	public void setRatepersqft8(String ratepersqft8) {
		this.ratepersqft8 = ratepersqft8;
	}

	public String getFlatamount8() {
		return flatamount8;
	}

	public void setFlatamount8(String flatamount8) {
		this.flatamount8 = flatamount8;
	}

	public String getCb8() {
		return cb8;
	}

	public void setCb8(String cb8) {
		this.cb8 = cb8;
	}

	public String getParametershortname9() {
		return parametershortname9;
	}

	public void setParametershortname9(String parametershortname9) {
		this.parametershortname9 = parametershortname9;
	}

	public String getParametername9() {
		return parametername9;
	}

	public void setParametername9(String parametername9) {
		this.parametername9 = parametername9;
	}

	public String getRatepersqft9() {
		return ratepersqft9;
	}

	public void setRatepersqft9(String ratepersqft9) {
		this.ratepersqft9 = ratepersqft9;
	}

	public String getFlatamount9() {
		return flatamount9;
	}

	public void setFlatamount9(String flatamount9) {
		this.flatamount9 = flatamount9;
	}

	public String getCb9() {
		return cb9;
	}

	public void setCb9(String cb9) {
		this.cb9 = cb9;
	}

	public String getParametershortname10() {
		return parametershortname10;
	}

	public void setParametershortname10(String parametershortname10) {
		this.parametershortname10 = parametershortname10;
	}

	public String getParametername10() {
		return parametername10;
	}

	public void setParametername10(String parametername10) {
		this.parametername10 = parametername10;
	}

	public String getRatepersqft10() {
		return ratepersqft10;
	}

	public void setRatepersqft10(String ratepersqft10) {
		this.ratepersqft10 = ratepersqft10;
	}

	public String getFlatamount10() {
		return flatamount10;
	}

	public void setFlatamount10(String flatamount10) {
		this.flatamount10 = flatamount10;
	}

	public String getCb10() {
		return cb10;
	}

	public void setCb10(String cb10) {
		this.cb10 = cb10;
	}

	public String getParametershortname11() {
		return parametershortname11;
	}

	public void setParametershortname11(String parametershortname11) {
		this.parametershortname11 = parametershortname11;
	}

	public String getParametername11() {
		return parametername11;
	}

	public void setParametername11(String parametername11) {
		this.parametername11 = parametername11;
	}

	public String getRatepersqft11() {
		return ratepersqft11;
	}

	public void setRatepersqft11(String ratepersqft11) {
		this.ratepersqft11 = ratepersqft11;
	}

	public String getFlatamount11() {
		return flatamount11;
	}

	public void setFlatamount11(String flatamount11) {
		this.flatamount11 = flatamount11;
	}

	public String getCb11() {
		return cb11;
	}

	public void setCb11(String cb11) {
		this.cb11 = cb11;
	}

	public String getParametershortname12() {
		return parametershortname12;
	}

	public void setParametershortname12(String parametershortname12) {
		this.parametershortname12 = parametershortname12;
	}

	public String getParametername12() {
		return parametername12;
	}

	public void setParametername12(String parametername12) {
		this.parametername12 = parametername12;
	}

	public String getRatepersqft12() {
		return ratepersqft12;
	}

	public void setRatepersqft12(String ratepersqft12) {
		this.ratepersqft12 = ratepersqft12;
	}

	public String getFlatamount12() {
		return flatamount12;
	}

	public void setFlatamount12(String flatamount12) {
		this.flatamount12 = flatamount12;
	}

	public String getCb12() {
		return cb12;
	}

	public void setCb12(String cb12) {
		this.cb12 = cb12;
	}

	public String getParametershortname13() {
		return parametershortname13;
	}

	public void setParametershortname13(String parametershortname13) {
		this.parametershortname13 = parametershortname13;
	}

	public String getParametername13() {
		return parametername13;
	}

	public void setParametername13(String parametername13) {
		this.parametername13 = parametername13;
	}

	public String getRatepersqft13() {
		return ratepersqft13;
	}

	public void setRatepersqft13(String ratepersqft13) {
		this.ratepersqft13 = ratepersqft13;
	}

	public String getFlatamount13() {
		return flatamount13;
	}

	public void setFlatamount13(String flatamount13) {
		this.flatamount13 = flatamount13;
	}

	public String getCb13() {
		return cb13;
	}

	public void setCb13(String cb13) {
		this.cb13 = cb13;
	}

	public String getParametershortname14() {
		return parametershortname14;
	}

	public void setParametershortname14(String parametershortname14) {
		this.parametershortname14 = parametershortname14;
	}

	public String getParametername14() {
		return parametername14;
	}

	public void setParametername14(String parametername14) {
		this.parametername14 = parametername14;
	}

	public String getRatepersqft14() {
		return ratepersqft14;
	}

	public void setRatepersqft14(String ratepersqft14) {
		this.ratepersqft14 = ratepersqft14;
	}

	public String getFlatamount14() {
		return flatamount14;
	}

	public void setFlatamount14(String flatamount14) {
		this.flatamount14 = flatamount14;
	}

	public String getCb14() {
		return cb14;
	}

	public void setCb14(String cb14) {
		this.cb14 = cb14;
	}

	public String getParametershortname15() {
		return parametershortname15;
	}

	public void setParametershortname15(String parametershortname15) {
		this.parametershortname15 = parametershortname15;
	}

	public String getParametername15() {
		return parametername15;
	}

	public void setParametername15(String parametername15) {
		this.parametername15 = parametername15;
	}

	public String getRatepersqft15() {
		return ratepersqft15;
	}

	public void setRatepersqft15(String ratepersqft15) {
		this.ratepersqft15 = ratepersqft15;
	}

	public String getFlatamount15() {
		return flatamount15;
	}

	public void setFlatamount15(String flatamount15) {
		this.flatamount15 = flatamount15;
	}

	public String getIntOnCreditPeriod() {
		return IntOnCreditPeriod;
	}

	public void setIntOnCreditPeriod(String intOnCreditPeriod) {
		IntOnCreditPeriod = intOnCreditPeriod;
	}

	public String getIntOnOPBal() {
		return IntOnOPBal;
	}

	public void setIntOnOPBal(String intOnOPBal) {
		IntOnOPBal = intOnOPBal;
	}

	public int getLastReceiptNo() {
		return LastReceiptNo;
	}

	public void setLastReceiptNo(int lastReceiptNo) {
		LastReceiptNo = lastReceiptNo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "ParameterSetupDTO [id=" + id + ", societycode=" + societycode + ", address1=" + address1 + ", address2="
				+ address2 + ", address3=" + address3 + ", highlightedfootnote=" + highlightedfootnote + ", bottomdesc="
				+ bottomdesc + ", emailID=" + emailID + ", password=" + password + ", BankDetail=" + BankDetail
				+ ", regCreditmonths=" + regCreditmonths + ", regCreditdays=" + regCreditdays + ", regInttype="
				+ regInttype + ", regIntrate=" + regIntrate + ", regPenalty=" + regPenalty + ", regRebaterate="
				+ regRebaterate + ", regRebateamt=" + regRebateamt + ", CGST=" + CGST + ", SGST=" + SGST + ", IGST="
				+ IGST + ", TaxAmt=" + TaxAmt + ", regRebatedays=" + regRebatedays + ", authorisedsignatory="
				+ authorisedsignatory + ", digitalSign=" + digitalSign + ", billfrequency=" + billfrequency
				+ ", lastinvoiceno=" + lastinvoiceno + ", yeardays=" + yeardays + ", accountingyear=" + accountingyear
				+ ", parametershortname1=" + parametershortname1 + ", parametername=" + parametername
				+ ", ratepersqft1=" + ratepersqft1 + ", flatamount1=" + flatamount1 + ", cb1=" + cb1
				+ ", parametershortname2=" + parametershortname2 + ", parametername2=" + parametername2
				+ ", ratepersqft2=" + ratepersqft2 + ", flatamount2=" + flatamount2 + ", cb2=" + cb2
				+ ", parametershortname3=" + parametershortname3 + ", parametername3=" + parametername3
				+ ", ratepersqft3=" + ratepersqft3 + ", flatamount3=" + flatamount3 + ", cb3=" + cb3
				+ ", parametershortname4=" + parametershortname4 + ", parametername4=" + parametername4
				+ ", ratepersqft4=" + ratepersqft4 + ", flatamount4=" + flatamount4 + ", cb4=" + cb4
				+ ", parametershortname5=" + parametershortname5 + ", parametername5=" + parametername5
				+ ", ratepersqft5=" + ratepersqft5 + ", flatamount5=" + flatamount5 + ", cb5=" + cb5
				+ ", parametershortname6=" + parametershortname6 + ", parametername6=" + parametername6
				+ ", ratepersqft6=" + ratepersqft6 + ", flatamount6=" + flatamount6 + ", cb6=" + cb6
				+ ", parametershortname7=" + parametershortname7 + ", parametername7=" + parametername7
				+ ", ratepersqft7=" + ratepersqft7 + ", flatamount7=" + flatamount7 + ", cb7=" + cb7
				+ ", parametershortname8=" + parametershortname8 + ", parametername8=" + parametername8
				+ ", ratepersqft8=" + ratepersqft8 + ", flatamount8=" + flatamount8 + ", cb8=" + cb8
				+ ", parametershortname9=" + parametershortname9 + ", parametername9=" + parametername9
				+ ", ratepersqft9=" + ratepersqft9 + ", flatamount9=" + flatamount9 + ", cb9=" + cb9
				+ ", parametershortname10=" + parametershortname10 + ", parametername10=" + parametername10
				+ ", ratepersqft10=" + ratepersqft10 + ", flatamount10=" + flatamount10 + ", cb10=" + cb10
				+ ", parametershortname11=" + parametershortname11 + ", parametername11=" + parametername11
				+ ", ratepersqft11=" + ratepersqft11 + ", flatamount11=" + flatamount11 + ", cb11=" + cb11
				+ ", parametershortname12=" + parametershortname12 + ", parametername12=" + parametername12
				+ ", ratepersqft12=" + ratepersqft12 + ", flatamount12=" + flatamount12 + ", cb12=" + cb12
				+ ", parametershortname13=" + parametershortname13 + ", parametername13=" + parametername13
				+ ", ratepersqft13=" + ratepersqft13 + ", flatamount13=" + flatamount13 + ", cb13=" + cb13
				+ ", parametershortname14=" + parametershortname14 + ", parametername14=" + parametername14
				+ ", ratepersqft14=" + ratepersqft14 + ", flatamount14=" + flatamount14 + ", cb14=" + cb14
				+ ", parametershortname15=" + parametershortname15 + ", parametername15=" + parametername15
				+ ", ratepersqft15=" + ratepersqft15 + ", flatamount15=" + flatamount15 + ", IntOnCreditPeriod="
				+ IntOnCreditPeriod + ", IntOnOPBal=" + IntOnOPBal + ", LastReceiptNo=" + LastReceiptNo + "]";
	}
}
	