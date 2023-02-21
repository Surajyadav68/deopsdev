package com.suninfotech.admin.dto;

import java.io.Serializable;

public class MemberDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String id,membercode, societycode, membername, joiningdate, leavingdate;
	public String establishmenttype, billingType, flatno, memberNote, bldgnwing, accountingyear;
	public String NomineeDate, NomineeName, MeetingDate, RevocationDate, NomineeRemark;
	public String AllotmentDate, Folio, CertificateNo, TransferDate, TransferToFolio, Transferee, ShareRemark;

	public String area, mainarrears, intarrears, supparrears, suppintarrears, disputedamt;
	public String creditamt, totaloutstanding;
	public String amount1 , amount2, amount3, amount4 , amount5 , amount6, amount7;
	public String amount8, amount9, amount10 , amount11 , amount12, amount13;
	public String amount14 , amount15 , rebateamount ;
	public String ShareNos,ShareValue;
	public MemberDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MemberDTO(String id, String membercode, String societycode, String membername, String joiningdate,
			String leavingdate, String establishmenttype, String billingType, String flatno, String memberNote,
			String bldgnwing, String accountingyear, String nomineeDate, String nomineeName, String meetingDate,
			String revocationDate, String nomineeRemark, String allotmentDate, String folio, String certificateNo,
			String transferDate, String transferToFolio, String transferee, String shareRemark, String area,
			String mainarrears, String intarrears, String supparrears, String suppintarrears, String disputedamt,
			String creditamt, String totaloutstanding, String amount1, String amount2, String amount3, String amount4,
			String amount5, String amount6, String amount7, String amount8, String amount9, String amount10,
			String amount11, String amount12, String amount13, String amount14, String amount15, String rebateamount,
			String shareNos, String shareValue) {
		super();
		this.id = id;
		this.membercode = membercode;
		this.societycode = societycode;
		this.membername = membername;
		this.joiningdate = joiningdate;
		this.leavingdate = leavingdate;
		this.establishmenttype = establishmenttype;
		this.billingType = billingType;
		this.flatno = flatno;
		this.memberNote = memberNote;
		this.bldgnwing = bldgnwing;
		this.accountingyear = accountingyear;
		NomineeDate = nomineeDate;
		NomineeName = nomineeName;
		MeetingDate = meetingDate;
		RevocationDate = revocationDate;
		NomineeRemark = nomineeRemark;
		AllotmentDate = allotmentDate;
		Folio = folio;
		CertificateNo = certificateNo;
		TransferDate = transferDate;
		TransferToFolio = transferToFolio;
		Transferee = transferee;
		ShareRemark = shareRemark;
		this.area = area;
		this.mainarrears = mainarrears;
		this.intarrears = intarrears;
		this.supparrears = supparrears;
		this.suppintarrears = suppintarrears;
		this.disputedamt = disputedamt;
		this.creditamt = creditamt;
		this.totaloutstanding = totaloutstanding;
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
		this.rebateamount = rebateamount;
		ShareNos = shareNos;
		ShareValue = shareValue;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMembercode() {
		return membercode;
	}
	public void setMembercode(String membercode) {
		this.membercode = membercode;
	}
	public String getSocietycode() {
		return societycode;
	}
	public void setSocietycode(String societycode) {
		this.societycode = societycode;
	}
	public String getMembername() {
		return membername;
	}
	public void setMembername(String membername) {
		this.membername = membername;
	}
	public String getJoiningdate() {
		return joiningdate;
	}
	public void setJoiningdate(String joiningdate) {
		this.joiningdate = joiningdate;
	}
	public String getLeavingdate() {
		return leavingdate;
	}
	public void setLeavingdate(String leavingdate) {
		this.leavingdate = leavingdate;
	}
	public String getEstablishmenttype() {
		return establishmenttype;
	}
	public void setEstablishmenttype(String establishmenttype) {
		this.establishmenttype = establishmenttype;
	}
	public String getBillingType() {
		return billingType;
	}
	public void setBillingType(String billingType) {
		this.billingType = billingType;
	}
	public String getFlatno() {
		return flatno;
	}
	public void setFlatno(String flatno) {
		this.flatno = flatno;
	}
	public String getMemberNote() {
		return memberNote;
	}
	public void setMemberNote(String memberNote) {
		this.memberNote = memberNote;
	}
	public String getBldgnwing() {
		return bldgnwing;
	}
	public void setBldgnwing(String bldgnwing) {
		this.bldgnwing = bldgnwing;
	}
	public String getAccountingyear() {
		return accountingyear;
	}
	public void setAccountingyear(String accountingyear) {
		this.accountingyear = accountingyear;
	}
	public String getNomineeDate() {
		return NomineeDate;
	}
	public void setNomineeDate(String nomineeDate) {
		NomineeDate = nomineeDate;
	}
	public String getNomineeName() {
		return NomineeName;
	}
	public void setNomineeName(String nomineeName) {
		NomineeName = nomineeName;
	}
	public String getMeetingDate() {
		return MeetingDate;
	}
	public void setMeetingDate(String meetingDate) {
		MeetingDate = meetingDate;
	}
	public String getRevocationDate() {
		return RevocationDate;
	}
	public void setRevocationDate(String revocationDate) {
		RevocationDate = revocationDate;
	}
	public String getNomineeRemark() {
		return NomineeRemark;
	}
	public void setNomineeRemark(String nomineeRemark) {
		NomineeRemark = nomineeRemark;
	}
	public String getAllotmentDate() {
		return AllotmentDate;
	}
	public void setAllotmentDate(String allotmentDate) {
		AllotmentDate = allotmentDate;
	}
	public String getFolio() {
		return Folio;
	}
	public void setFolio(String folio) {
		Folio = folio;
	}
	public String getCertificateNo() {
		return CertificateNo;
	}
	public void setCertificateNo(String certificateNo) {
		CertificateNo = certificateNo;
	}
	public String getTransferDate() {
		return TransferDate;
	}
	public void setTransferDate(String transferDate) {
		TransferDate = transferDate;
	}
	public String getTransferToFolio() {
		return TransferToFolio;
	}
	public void setTransferToFolio(String transferToFolio) {
		TransferToFolio = transferToFolio;
	}
	public String getTransferee() {
		return Transferee;
	}
	public void setTransferee(String transferee) {
		Transferee = transferee;
	}
	public String getShareRemark() {
		return ShareRemark;
	}
	public void setShareRemark(String shareRemark) {
		ShareRemark = shareRemark;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getMainarrears() {
		return mainarrears;
	}
	public void setMainarrears(String mainarrears) {
		this.mainarrears = mainarrears;
	}
	public String getIntarrears() {
		return intarrears;
	}
	public void setIntarrears(String intarrears) {
		this.intarrears = intarrears;
	}
	public String getSupparrears() {
		return supparrears;
	}
	public void setSupparrears(String supparrears) {
		this.supparrears = supparrears;
	}
	public String getSuppintarrears() {
		return suppintarrears;
	}
	public void setSuppintarrears(String suppintarrears) {
		this.suppintarrears = suppintarrears;
	}
	public String getDisputedamt() {
		return disputedamt;
	}
	public void setDisputedamt(String disputedamt) {
		this.disputedamt = disputedamt;
	}
	public String getCreditamt() {
		return creditamt;
	}
	public void setCreditamt(String creditamt) {
		this.creditamt = creditamt;
	}
	public String getTotaloutstanding() {
		return totaloutstanding;
	}
	public void setTotaloutstanding(String totaloutstanding) {
		this.totaloutstanding = totaloutstanding;
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
	public String getRebateamount() {
		return rebateamount;
	}
	public void setRebateamount(String rebateamount) {
		this.rebateamount = rebateamount;
	}
	public String getShareNos() {
		return ShareNos;
	}
	public void setShareNos(String shareNos) {
		ShareNos = shareNos;
	}
	public String getShareValue() {
		return ShareValue;
	}
	public void setShareValue(String shareValue) {
		ShareValue = shareValue;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", membercode=" + membercode + ", societycode=" + societycode + ", membername="
				+ membername + ", joiningdate=" + joiningdate + ", leavingdate=" + leavingdate + ", establishmenttype="
				+ establishmenttype + ", billingType=" + billingType + ", flatno=" + flatno + ", memberNote="
				+ memberNote + ", bldgnwing=" + bldgnwing + ", accountingyear=" + accountingyear + ", NomineeDate="
				+ NomineeDate + ", NomineeName=" + NomineeName + ", MeetingDate=" + MeetingDate + ", RevocationDate="
				+ RevocationDate + ", NomineeRemark=" + NomineeRemark + ", AllotmentDate=" + AllotmentDate + ", Folio="
				+ Folio + ", CertificateNo=" + CertificateNo + ", TransferDate=" + TransferDate + ", TransferToFolio="
				+ TransferToFolio + ", Transferee=" + Transferee + ", ShareRemark=" + ShareRemark + ", area=" + area
				+ ", mainarrears=" + mainarrears + ", intarrears=" + intarrears + ", supparrears=" + supparrears
				+ ", suppintarrears=" + suppintarrears + ", disputedamt=" + disputedamt + ", creditamt=" + creditamt
				+ ", totaloutstanding=" + totaloutstanding + ", amount1=" + amount1 + ", amount2=" + amount2
				+ ", amount3=" + amount3 + ", amount4=" + amount4 + ", amount5=" + amount5 + ", amount6=" + amount6
				+ ", amount7=" + amount7 + ", amount8=" + amount8 + ", amount9=" + amount9 + ", amount10=" + amount10
				+ ", amount11=" + amount11 + ", amount12=" + amount12 + ", amount13=" + amount13 + ", amount14="
				+ amount14 + ", amount15=" + amount15 + ", rebateamount=" + rebateamount + ", ShareNos=" + ShareNos
				+ ", ShareValue=" + ShareValue + "]";
	}
}
