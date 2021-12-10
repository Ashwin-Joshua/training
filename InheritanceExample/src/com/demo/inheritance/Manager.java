package com.demo.inheritance;

public class Manager extends Employee{
	
	private String[] skillSet;

	/**
	 * @param employeeId
	 * @param employeeName
	 * @param designation
	 * @param salary
	 * @param skillSet
	 */
	public Manager(int employeeId, String employeeName, String designation, double salary, String[] skillSet) {
		super(employeeId, employeeName, designation, salary);
		this.skillSet = skillSet;
	}

	/**
	 * 
	 */
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String[] getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(String[] skillSet) {
		this.skillSet = skillSet;
	}
	
	public String hello() {
		return "hi";
	}

}
