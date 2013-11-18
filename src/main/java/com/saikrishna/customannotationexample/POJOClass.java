package com.saikrishna.customannotationexample;

public class POJOClass 
{
	//@CustomAnnotation(value2 = "")
	private int id;
	
	//@CustomAnnotation(value1="nameGivenVal1", value2 = "nameGivenVal2")
	private String name;
	
	@CustomAnnotation(value2 = "salaryGivenVal2")
	private float salary;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
}
