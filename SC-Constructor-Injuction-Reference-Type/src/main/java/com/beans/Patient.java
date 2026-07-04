package com.beans;

public class Patient {

	private String name;
	private int age;
	private Doctor doctor;

	public Patient() {

	}

	public Patient(String name, int age, Doctor doctor) {
		super();
		this.name = name;
		this.age = age;
		this.doctor = doctor;
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + ", age=" + age + ", doctor=" + doctor + "]";
	}

}
