package com.mycompany.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRIMARY_SKILL")
public class EmpPrimarySkill {


	@Id
	@Column(name = "EMP_ID")
	private int empId;

	@Column(name = "PRIMARY_SKILL") 
	private String primarySkill;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getPrimarySkill() {
		return primarySkill;
	}

	public void setPrimarySkill(String primarySkill) {
		this.primarySkill = primarySkill;
	}

	public EmpPrimarySkill(int empId, String primarySkill) {
		super();
		this.empId = empId;
		this.primarySkill = primarySkill;
	}

	public EmpPrimarySkill() {
	}
	
	
}
