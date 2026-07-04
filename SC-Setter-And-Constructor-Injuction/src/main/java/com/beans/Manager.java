package com.beans;

public class Manager {

	private String name;
	private String department;

	public Manager(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Manager [name=" + name + ", department=" + department + "]";
	}

}
