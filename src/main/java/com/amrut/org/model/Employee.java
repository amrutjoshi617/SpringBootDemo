package com.amrut.org.model;

import java.util.Date;

public class Employee {

	private String empId;
	private String fName;
	private String lName;
	private String designation;
	private Date dateOfJoining;
	private Long salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String empId, String fName, String lName, String designation, Date dateOfJoining, Long salary) {
		super();
		this.empId = empId;
		this.fName = fName;
		this.lName = lName;
		this.designation = designation;
		this.dateOfJoining = dateOfJoining;
		this.salary = salary;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", fName=" + fName + ", lName=" + lName + ", designation=" + designation
				+ ", dateOfJoining=" + dateOfJoining + ", salary=" + salary + "]";
	}
	
	
	
}
