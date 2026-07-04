package com.beans;

public class Doctor {

	private String name;
	private String speclization;

	public Doctor() {

	}

	public Doctor(String name, String speclization) {
		super();
		this.name = name;
		this.speclization = speclization;
	}

	@Override
	public String toString() {
		return "Doctor [name=" + name + ", speclization=" + speclization + "]";
	}

}
