package com.beans;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;

	public Employee() {
		super();
	}

	public Employee(int employeeId, String employeeName, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	
	public void display()
	{
		System.out.println("Employee ID:" +this.employeeId);
		System.out.println("Employee Name:" +this.employeeName);
		System.out.println("Employee Salary:" +this.employeeSalary);
	}

}
