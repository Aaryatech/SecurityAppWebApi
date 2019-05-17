package com.ats.securitywebapi.SecurityApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "t_employee_accsories")
public class EmployeeAccesories {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="emp_accsories_id")
	private int empAccsoriesId;

	@Column(name="emp_id")
	private int emp_id;
	
	@Column(name="production_access_id")
	private int productionAccessId;
	
	@Column(name="accomatation_value")
	private String accomatationValue;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="consumable_code")
	private String consumableCode;
	
	@Column(name="upload_photo")
	private String uploadPhoto;
			
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

	public int getEmpAccsoriesId() {
		return empAccsoriesId;
	}

	public void setEmpAccsoriesId(int empAccsoriesId) {
		this.empAccsoriesId = empAccsoriesId;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public int getProductionAccessId() {
		return productionAccessId;
	}

	public void setProductionAccessId(int productionAccessId) {
		this.productionAccessId = productionAccessId;
	}

	public String getAccomatationValue() {
		return accomatationValue;
	}

	public void setAccomatationValue(String accomatationValue) {
		this.accomatationValue = accomatationValue;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getConsumableCode() {
		return consumableCode;
	}

	public void setConsumableCode(String consumableCode) {
		this.consumableCode = consumableCode;
	}

	public String getUploadPhoto() {
		return uploadPhoto;
	}

	public void setUploadPhoto(String uploadPhoto) {
		this.uploadPhoto = uploadPhoto;
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
		return "EmployeeAccesories [empAccsoriesId=" + empAccsoriesId + ", emp_id=" + emp_id + ", productionAccessId="
				+ productionAccessId + ", accomatationValue=" + accomatationValue + ", quantity=" + quantity
				+ ", consumableCode=" + consumableCode + ", uploadPhoto=" + uploadPhoto + ", delStatus=" + delStatus
				+ ", isUsed=" + isUsed + ", exInt1=" + exInt1 + ", exInt2=" + exInt2 + ", exInt3=" + exInt3
				+ ", exVar1=" + exVar1 + ", exVar2=" + exVar2 + ", exVar3=" + exVar3 + ", msg=" + msg + ", isError="
				+ isError + "]";
	}

	
}
