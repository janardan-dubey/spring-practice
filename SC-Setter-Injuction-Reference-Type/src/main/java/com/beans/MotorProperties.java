package com.beans;

public class MotorProperties {
	private int motorId;
	private String motorType;

	public int getMotorId() {
		return motorId;
	}

	public void setMotorId(int motorId) {
		this.motorId = motorId;
	}

	public String getMotorType() {
		return motorType;
	}

	public void setMotorType(String motorType) {
		this.motorType = motorType;
	}

	@Override
	public String toString() {
		return "MotorProperties [motorId=" + motorId + ", motorType=" + motorType + "]";
	}

	public void display()
	{
		System.out.println("motorId: " +motorId);
		System.out.println("motorType: " +motorType);
	}
}
