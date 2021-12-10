package com.demo.inheritance;


public class Employee {
	private int employeeId;
	private String employeeName;
	private String designation;
	private double salary;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/**
	 * @param employeeId
	 * @param employeeName
	 * @param designation
	 * @param salary
	 */
	public Employee(int employeeId, String employeeName, String designation, double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.designation = designation;
		this.salary = salary;
	}
	/**
	 * 
	 */
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {		// TODO Auto-generated method stub		
		return this.employeeId+","+ this.employeeName+","+this.designation;
	}
	
//	public String twoString() {
//		return this.employeeId+","+ this.employeeName+","+this.designation;
//	}

}
