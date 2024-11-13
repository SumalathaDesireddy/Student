package com.model;

public class Employee {
	
	private String emName;
	private double salary;
	
	public Employee() {
		
	}
	
	public Employee(String emName, double salary) {
		super();
		this.emName = emName;
		this.salary = salary;
	}

	public String getEmName() {
		return emName;
	}

	public void setEmName(String emName) {
		this.emName = emName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
