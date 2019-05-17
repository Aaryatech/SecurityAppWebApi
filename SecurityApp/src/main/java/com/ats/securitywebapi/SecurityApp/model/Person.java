package com.ats.securitywebapi.SecurityApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table(name = "t_person")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;

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
	
	@Column(name="visit_purpose")
	private String visitPurpose;
	
	@Column(name="person_name_to_meet")
	private String personNameToMeet;
	
	@Column(name="department")
	private String department;
	
	@Column(name="gate_id")
	private int gateId;
	
	@Column(name="visit_type")
	private int visitType;
	
	@Column(name="visit_status")
	private int visitStatus;
	
	@Column(name="visit_notification")
	private String visitNotification;
	
	@Column(name="remark")
	private String remark;
	
	@Column(name="visit_card_id")
	private int visitCardId;
	
	@Column(name="visit_card_no")
	private String visitCardNo;
	
	@Column(name="take_mobile")
	private String takeMobile;
	
	@Column(name="submit_mobile")
	private int submitMobile;
	
	@Column(name="meeting_discussion")
	private String meetingDiscussion;
	
	@Column(name="upload_photo")
	private String uploadPhoto;
	
	@Column(name="gate_pass_status")
	private int gatePassStatus;
	
	@Column(name="collect_visit_id")
	private int collectVisitId;	
	
	@Column(name="mobile_status")
	private int mobileStatus;	
			
	@Column(name="visit_date_time")
	private String visitDateTime;
	
	@Column(name="del_status")
	private int delStatus;
	
	@Column(name="is_used")
	private int isUsed;
	
	@Column(name="ex_int1")
	private int exInt1;
	
	@Column(name="ex_int2")
	private int exInt2;
	
	@Column(name="ex_int3")
	private int exInt3;
	
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getVisitPurpose() {
		return visitPurpose;
	}

	public void setVisitPurpose(String visitPurpose) {
		this.visitPurpose = visitPurpose;
	}

	public String getPersonNameToMeet() {
		return personNameToMeet;
	}

	public void setPersonNameToMeet(String personNameToMeet) {
		this.personNameToMeet = personNameToMeet;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getGateId() {
		return gateId;
	}

	public void setGateId(int gateId) {
		this.gateId = gateId;
	}

	public int getVisitType() {
		return visitType;
	}

	public void setVisitType(int visitType) {
		this.visitType = visitType;
	}

	public int getVisitStatus() {
		return visitStatus;
	}

	public void setVisitStatus(int visitStatus) {
		this.visitStatus = visitStatus;
	}

	public String getVisitNotification() {
		return visitNotification;
	}

	public void setVisitNotification(String visitNotification) {
		this.visitNotification = visitNotification;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	public int getSubmitMobile() {
		return submitMobile;
	}

	public void setSubmitMobile(int submitMobile) {
		this.submitMobile = submitMobile;
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

	public int getGatePassStatus() {
		return gatePassStatus;
	}

	public void setGatePassStatus(int gatePassStatus) {
		this.gatePassStatus = gatePassStatus;
	}

	public int getCollectVisitId() {
		return collectVisitId;
	}

	public void setCollectVisitId(int collectVisitId) {
		this.collectVisitId = collectVisitId;
	}

	public int getMobileStatus() {
		return mobileStatus;
	}

	public void setMobileStatus(int mobileStatus) {
		this.mobileStatus = mobileStatus;
	}

	public String getVisitDateTime() {
		return visitDateTime;
	}

	public void setVisitDateTime(String visitDateTime) {
		this.visitDateTime = visitDateTime;
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

	public int getExInt1() {
		return exInt1;
	}

	public void setExInt1(int exInt1) {
		this.exInt1 = exInt1;
	}

	public int getExInt2() {
		return exInt2;
	}

	public void setExInt2(int exInt2) {
		this.exInt2 = exInt2;
	}

	public int getExInt3() {
		return exInt3;
	}

	public void setExInt3(int exInt3) {
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
		return "Person [id=" + id + ", personName=" + personName + ", personPhoto=" + personPhoto + ", mobileNo="
				+ mobileNo + ", idProof=" + idProof + ", idProof1=" + idProof1 + ", visitPurpose=" + visitPurpose
				+ ", personNameToMeet=" + personNameToMeet + ", department=" + department + ", gateId=" + gateId
				+ ", visitType=" + visitType + ", visitStatus=" + visitStatus + ", visitNotification="
				+ visitNotification + ", remark=" + remark + ", visitCardId=" + visitCardId + ", visitCardNo="
				+ visitCardNo + ", takeMobile=" + takeMobile + ", submitMobile=" + submitMobile + ", meetingDiscussion="
				+ meetingDiscussion + ", uploadPhoto=" + uploadPhoto + ", gatePassStatus=" + gatePassStatus
				+ ", collectVisitId=" + collectVisitId + ", mobileStatus=" + mobileStatus + ", visitDateTime="
				+ visitDateTime + ", delStatus=" + delStatus + ", isUsed=" + isUsed + ", exInt1=" + exInt1 + ", exInt2="
				+ exInt2 + ", exInt3=" + exInt3 + ", exVar1=" + exVar1 + ", exVar2=" + exVar2 + ", exVar3=" + exVar3
				+ ", msg=" + msg + ", isError=" + isError + "]";
	}

	
}
