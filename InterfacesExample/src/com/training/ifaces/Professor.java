package com.training.ifaces;

public class Professor implements Conditional {
	
	private int id;
	private String qualification;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	/**
	 * @param id
	 * @param qualification
	 */
	public Professor(int id, String qualification) {
		super();
		this.id = id;
		this.qualification = qualification;
	}

	/**
	 * 
	 */
	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean test() {
		// TODO Auto-generated method stub
		return this.qualification.equalsIgnoreCase("mca");
	}

}
