package com.lengthy2;

import java.util.Objects;

public class Supplier {

	private int regNo;
	private String sname;

	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Supplier(int regNo, String sname) {
		super();
		this.regNo = regNo;
		this.sname = sname;
	}

	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int hashCode() {
		return Objects.hash(regNo, sname);

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		Supplier other = (Supplier) obj;
		return regNo == other.regNo && Objects.equals(sname, other.sname);
	}

	@Override
	public String toString() {
		return "Supplier [regNo=" + regNo + ", sname=" + sname + "]";
	}

}
