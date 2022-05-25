package com.department.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long departmentId;
	private String departmentName;
	private int totalNumerofEmployee;

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public int getTotalNumerofEmployee() {
		return totalNumerofEmployee;
	}

	public void setTotalNumerofEmployee(int totalNumerofEmployee) {
		this.totalNumerofEmployee = totalNumerofEmployee;
	}

	

	public Department(Long departmentId, String departmentName, int totalNumerofEmployee) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.totalNumerofEmployee = totalNumerofEmployee;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Department() {

	}

}
