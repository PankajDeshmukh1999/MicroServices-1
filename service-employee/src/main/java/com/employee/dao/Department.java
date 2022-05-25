package com.employee.dao;

public class Department {

	private Long departmentId;
	private String departmentName;
	private int totalNumerofEmployee;

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
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

	public Department() {

	}

}
