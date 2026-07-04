package com.beans;

public class Student {
	private int rollNo;
	private String name;
	private String course;

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	public void display()
	{
		System.out.println("Id: " +rollNo);
		System.out.println("Name: " +name);
		System.out.println("Course: " +course);
	}

}
