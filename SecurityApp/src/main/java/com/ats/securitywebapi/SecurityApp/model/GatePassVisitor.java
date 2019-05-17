package com.ats.securitywebapi.SecurityApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "t_gatepass_visitor")
public class GatePassVisitor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="gatepass_visitor_id")
	private int gatepassVisitorId;

	@Column(name="visit_date_in")
	private String visitDateIn;
	
	@Column(name="Security_id_in")
	private int SecurityIdIn;
	
	@Column(name="person_name")
	private String personName;
	
	@Column(name="person_photo")
	private String personPhoto;
	
	@Column(name="mobile_no")
	private String mobileNo;
	
	@Column(name="id_proof")
	private String idProof;
	
	@Column(name="id_proof1")
	private String idProof1;
	
	@Column(name="purpose_id")
	private int purposeId;
	
	@Column(name="visit_purpose_text")
	private String visitPurposeText;
	
	@Column(name="purpose_remark")
	private String purposeRemark;
	
	@Column(name="emp_ids")
	private String empIds;
	
	@Column(name="emp_name")
	private String empName;
	
	@Column(name="gate_id")
	private String gateId;
	
	@Column(name="gate_passtype")
	private String gatePasstype;
	
	@Column(name="visit_status ")
	private int visitStatus ;
	
	@Column(name="visit_type")
	private String visitType;
	
	@Column(name="in_time")
	private String inTime;
	
	@Column(name="visit_card_id")
	private int visitCardId;
	
	@Column(name="visit_card_no")
	private String visitCardNo;
	
	@Column(name="take_mobile")
	private String takeMobile;
	
	@Column(name="meeting_discussion")
	private String meetingDiscussion;
	
	@Column(name="upload_photo")
	private String uploadPhoto;
	
	@Column(name="other_photo")
	private String otherPhoto;
	
	@Column(name="visit_out_time")
	private String visitOutTime;
	
	@Column(name="total_time_difference")
	private float totalTimeDifference;
	
	@Column(name="security_id_out")
	private String securityIdOut;
	
	@Column(name="visit_date_out")
	private int visitDateOut;
	
	@Column(name="user_sign_image")
	private String userSignImage;
			
	@Column(name="del_status")
	private int delStatus;
	
	@Column(name="is_used")
	private int isUsed;
	
	@Column(name="ex_int1")
	private Integer exInt1;
	
	@Column(name="ex_int2")
	private Integer exInt2;
	
	@Column(name="ex_int3")
	private Integer exInt3;
	
	@Column(name="ex_var1")
	private String exVar1;
	
	@Column(name="ex_var2")
	private String exVar2;
	
	@Column(name="ex_var3")
	private String exVar3;
	
	@Transient
	private String msg;
	
	@Transient
	private boolean isError;

	public int getGatepassVisitorId() {
		return gatepassVisitorId;
	}

	public void setGatepassVisitorId(int gatepassVisitorId) {
		this.gatepassVisitorId = gatepassVisitorId;
	}

	public String getVisitDateIn() {
		return visitDateIn;
	}

	public void setVisitDateIn(String visitDateIn) {
		this.visitDateIn = visitDateIn;
	}

	public int getSecurityIdIn() {
		return SecurityIdIn;
	}

	public void setSecurityIdIn(int securityIdIn) {
		SecurityIdIn = securityIdIn;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonPhoto() {
		return personPhoto;
	}

	public void setPersonPhoto(String personPhoto) {
		this.personPhoto = personPhoto;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getIdProof() {
		return idProof;
	}

	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}

	public String getIdProof1() {
		return idProof1;
	}

	public void setIdProof1(String idProof1) {
		this.idProof1 = idProof1;
	}

	public int getPurposeId() {
		return purposeId;
	}

	public void setPurposeId(int purposeId) {
		this.purposeId = purposeId;
	}

	public String getVisitPurposeText() {
		return visitPurposeText;
	}

	public void setVisitPurposeText(String visitPurposeText) {
		this.visitPurposeText = visitPurposeText;
	}

	public String getPurposeRemark() {
		return purposeRemark;
	}

	public void setPurposeRemark(String purposeRemark) {
		this.purposeRemark = purposeRemark;
	}

	public String getEmpIds() {
		return empIds;
	}

	public void setEmpIds(String empIds) {
		this.empIds = empIds;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getGateId() {
		return gateId;
	}

	public void setGateId(String gateId) {
		this.gateId = gateId;
	}

	public String getGatePasstype() {
		return gatePasstype;
	}

	public void setGatePasstype(String gatePasstype) {
		this.gatePasstype = gatePasstype;
	}

	public int getVisitStatus() {
		return visitStatus;
	}

	public void setVisitStatus(int visitStatus) {
		this.visitStatus = visitStatus;
	}

	public String getVisitType() {
		return visitType;
	}

	public void setVisitType(String visitType) {
		this.visitType = visitType;
	}

	public String getInTime() {
		return inTime;
	}

	public void setInTime(String inTime) {
		this.inTime = inTime;
	}

	public int getVisitCardId() {
		return visitCardId;
	}

	public void setVisitCardId(int visitCardId) {
		this.visitCardId = visitCardId;
	}

	public String getVisitCardNo() {
		return visitCardNo;
	}

	public void setVisitCardNo(String visitCardNo) {
		this.visitCardNo = visitCardNo;
	}

	public String getTakeMobile() {
		return takeMobile;
	}

	public void setTakeMobile(String takeMobile) {
		this.takeMobile = takeMobile;
	}

	public String getMeetingDiscussion() {
		return meetingDiscussion;
	}

	public void setMeetingDiscussion(String meetingDiscussion) {
		this.meetingDiscussion = meetingDiscussion;
	}

	public String getUploadPhoto() {
		return uploadPhoto;
	}

	public void setUploadPhoto(String uploadPhoto) {
		this.uploadPhoto = uploadPhoto;
	}

	public String getOtherPhoto() {
		return otherPhoto;
	}

	public void setOtherPhoto(String otherPhoto) {
		this.otherPhoto = otherPhoto;
	}

	public String getVisitOutTime() {
		return visitOutTime;
	}

	public void setVisitOutTime(String visitOutTime) {
		this.visitOutTime = visitOutTime;
	}

	public float getTotalTimeDifference() {
		return totalTimeDifference;
	}

	public void setTotalTimeDifference(float totalTimeDifference) {
		this.totalTimeDifference = totalTimeDifference;
	}

	public String getSecurityIdOut() {
		return securityIdOut;
	}

	public void setSecurityIdOut(String securityIdOut) {
		this.securityIdOut = securityIdOut;
	}

	public int getVisitDateOut() {
		return visitDateOut;
	}

	public void setVisitDateOut(int visitDateOut) {
		this.visitDateOut = visitDateOut;
	}

	public String getUserSignImage() {
		return userSignImage;
	}

	public void setUserSignImage(String userSignImage) {
		this.userSignImage = userSignImage;
	}

	public int getDelStatus() {
		return delStatus;
	}

	public void setDelStatus(int delStatus) {
		this.delStatus = delStatus;
	}

	public int getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(int isUsed) {
		this.isUsed = isUsed;
	}

	public Integer getExInt1() {
		return exInt1;
	}

	public void setExInt1(Integer exInt1) {
		this.exInt1 = exInt1;
	}

	public Integer getExInt2() {
		return exInt2;
	}

	public void setExInt2(Integer exInt2) {
		this.exInt2 = exInt2;
	}

	public Integer getExInt3() {
		return exInt3;
	}

	public void setExInt3(Integer exInt3) {
		this.exInt3 = exInt3;
	}

	public String getExVar1() {
		return exVar1;
	}

	public void setExVar1(String exVar1) {
		this.exVar1 = exVar1;
	}

	public String getExVar2() {
		return exVar2;
	}

	public void setExVar2(String exVar2) {
		this.exVar2 = exVar2;
	}

	public String getExVar3() {
		return exVar3;
	}

	public void setExVar3(String exVar3) {
		this.exVar3 = exVar3;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public boolean isError() {
		return isError;
	}

	public void setError(boolean isError) {
		this.isError = isError;
	}

	@Override
	public String toString() {
		return "GatePassVisitor [gatepassVisitorId=" + gatepassVisitorId + ", visitDateIn=" + visitDateIn
				+ ", SecurityIdIn=" + SecurityIdIn + ", personName=" + personName + ", personPhoto=" + personPhoto
				+ ", mobileNo=" + mobileNo + ", idProof=" + idProof + ", idProof1=" + idProof1 + ", purposeId="
				+ purposeId + ", visitPurposeText=" + visitPurposeText + ", purposeRemark=" + purposeRemark
				+ ", empIds=" + empIds + ", empName=" + empName + ", gateId=" + gateId + ", gatePasstype="
				+ gatePasstype + ", visitStatus=" + visitStatus + ", visitType=" + visitType + ", inTime=" + inTime
				+ ", visitCardId=" + visitCardId + ", visitCardNo=" + visitCardNo + ", takeMobile=" + takeMobile
				+ ", meetingDiscussion=" + meetingDiscussion + ", uploadPhoto=" + uploadPhoto + ", otherPhoto="
				+ otherPhoto + ", visitOutTime=" + visitOutTime + ", totalTimeDifference=" + totalTimeDifference
				+ ", securityIdOut=" + securityIdOut + ", visitDateOut=" + visitDateOut + ", userSignImage="
				+ userSignImage + ", delStatus=" + delStatus + ", isUsed=" + isUsed + ", exInt1=" + exInt1 + ", exInt2="
				+ exInt2 + ", exInt3=" + exInt3 + ", exVar1=" + exVar1 + ", exVar2=" + exVar2 + ", exVar3=" + exVar3
				+ ", msg=" + msg + ", isError=" + isError + "]";
	}
	
	
}
