package com.demo;

public class Driver {
	double licenseNo;
	String name;
	int experience;

	public Driver(double licenseNo) {
		this.licenseNo = licenseNo;

	}

	public Driver(double licenseno, String name, int experience) {
		this.licenseNo = licenseNo;
		this.name = name;

	}

	public double getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(double licenseNo) {
		this.licenseNo = licenseNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

}
