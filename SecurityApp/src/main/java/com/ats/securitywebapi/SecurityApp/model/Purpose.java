package com.ats.securitywebapi.SecurityApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "m_purpose")
public class Purpose {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="purpose_id")
	private int purposeId;

	@Column(name="purpose_heading")
	private String purposeHeading;
	
	@Column(name="purpose_type")
	private String purposeType;

	@Column(name="description")
	private String description;
	
	@Column(name="remark")
	private String remark;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="notification_l4")
	private String notificationL4;
	
	@Column(name="pass_duration")
	private String passDuration;
		
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

	public int getPurposeId() {
		return purposeId;
	}

	public void setPurposeId(int purposeId) {
		this.purposeId = purposeId;
	}

	public String getPurposeHeading() {
		return purposeHeading;
	}

	public void setPurposeHeading(String purposeHeading) {
		this.purposeHeading = purposeHeading;
	}

	public String getPurposeType() {
		return purposeType;
	}

	public void setPurposeType(String purposeType) {
		this.purposeType = purposeType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getNotificationL4() {
		return notificationL4;
	}

	public void setNotificationL4(String notificationL4) {
		this.notificationL4 = notificationL4;
	}

	public String getPassDuration() {
		return passDuration;
	}

	public void setPassDuration(String passDuration) {
		this.passDuration = passDuration;
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
		return "Purpose [purposeId=" + purposeId + ", purposeHeading=" + purposeHeading + ", purposeType=" + purposeType
				+ ", description=" + description + ", remark=" + remark + ", userId=" + userId + ", notificationL4="
				+ notificationL4 + ", passDuration=" + passDuration + ", delStatus=" + delStatus + ", isUsed=" + isUsed
				+ ", exInt1=" + exInt1 + ", exInt2=" + exInt2 + ", exInt3=" + exInt3 + ", exVar1=" + exVar1
				+ ", exVar2=" + exVar2 + ", exVar3=" + exVar3 + ", msg=" + msg + ", isError=" + isError + "]";
	}

	
	
}
