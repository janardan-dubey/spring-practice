package com.beans;

public class ToyProperties {

	private int toyId;
	private String toyBrand;
	private MotorProperties mp;

	public int getToyId() {
		return toyId;
	}

	public void setToyId(int toyId) {
		this.toyId = toyId;
	}

	public String getToyBrand() {
		return toyBrand;
	}

	public void setToyBrand(String toyBrand) {
		this.toyBrand = toyBrand;
	}

	public MotorProperties getMp() {
		return mp;
	}

	public void setMp(MotorProperties mp) {
		this.mp = mp;
	}

	@Override
	public String toString() {
		return "ToyProperties [toyId=" + toyId + ", toyBrand=" + toyBrand + ", mp=" + mp + "]";
	}

	public void display()
	{
		System.out.println("Toy id: " +toyId);
		System.out.println("Toy brand: " +toyBrand);
		System.out.println("Motor Type: " +mp);
	}
}
