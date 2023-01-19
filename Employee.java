package com.ef;

public class Employee {
	private int id;
	private String name;
	private String department;
	private int salary;
	private ShippingAddress address;
	
	
	public Employee() {
	System.out.println("Default constructor of employee class is calling.");
	}
	
	public Employee(int id, String name, String department, int salary,ShippingAddress address) {
		System.out.println("Parameterized constructor of employee class is calling.");
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.address = address;
	}

	public void getEmployeeInfo() {
		System.out.println("Id = "+this.id+" Name = "+this.name+" Department = "+this.department+" Salary = "+this.salary);	
	}
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
