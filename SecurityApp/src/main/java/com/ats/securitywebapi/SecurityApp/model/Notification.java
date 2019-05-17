package com.ats.securitywebapi.SecurityApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "t_notification")
public class Notification {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="notification_id")
	private int notificationId;

	@Column(name="gatepass_visitor_id")
	private int gatepassVisitorId;
	
	@Column(name="emp_id")
	private int empId;
	
	@Column(name="emp_name")
	private String empName;
	
	@Column(name="gatepass_type")
	private int gatepassType;
	
	@Column(name="purpose_type")
	private int purposeType;
	
	@Column(name="purpose_id")
	private int purposeId;
	
	@Column(name="request_accepted_time")
	private String requestAcceptedTime;
	
	@Column(name="time_difference_request")
	private int timeDifferenceRequest;
	
	@Column(name="status")
	private int status;	
			
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

	public int getNotificationId() {
		return notificationId;
	}

	public void setNotificationId(int notificationId) {
		this.notificationId = notificationId;
	}

	public int getGatepassVisitorId() {
		return gatepassVisitorId;
	}

	public void setGatepassVisitorId(int gatepassVisitorId) {
		this.gatepassVisitorId = gatepassVisitorId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getGatepassType() {
		return gatepassType;
	}

	public void setGatepassType(int gatepassType) {
		this.gatepassType = gatepassType;
	}

	public int getPurposeType() {
		return purposeType;
	}

	public void setPurposeType(int purposeType) {
		this.purposeType = purposeType;
	}

	public int getPurposeId() {
		return purposeId;
	}

	public void setPurposeId(int purposeId) {
		this.purposeId = purposeId;
	}

	public String getRequestAcceptedTime() {
		return requestAcceptedTime;
	}

	public void setRequestAcceptedTime(String requestAcceptedTime) {
		this.requestAcceptedTime = requestAcceptedTime;
	}

	public int getTimeDifferenceRequest() {
		return timeDifferenceRequest;
	}

	public void setTimeDifferenceRequest(int timeDifferenceRequest) {
		this.timeDifferenceRequest = timeDifferenceRequest;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
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
		return "Notification [notificationId=" + notificationId + ", gatepassVisitorId=" + gatepassVisitorId
				+ ", empId=" + empId + ", empName=" + empName + ", gatepassType=" + gatepassType + ", purposeType="
				+ purposeType + ", purposeId=" + purposeId + ", requestAcceptedTime=" + requestAcceptedTime
				+ ", timeDifferenceRequest=" + timeDifferenceRequest + ", status=" + status + ", delStatus=" + delStatus
				+ ", isUsed=" + isUsed + ", exInt1=" + exInt1 + ", exInt2=" + exInt2 + ", exInt3=" + exInt3
				+ ", exVar1=" + exVar1 + ", exVar2=" + exVar2 + ", exVar3=" + exVar3 + ", msg=" + msg + ", isError="
				+ isError + "]";
	}
	
	

}
