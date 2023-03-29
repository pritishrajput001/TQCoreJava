package com.test4;

public class Author {
	public int aid;
	public String aname;
	public String address;

	public Author() {

	}

	public Author(int aid, String aname, String address) {
		this.aid = aid;
		this.aname = aname;
		this.address = address;
	}

	public int getId() {
		return aid;
	}

	public void setId(int aid) {
		this.aid = aid;
	}

	public String getName() {
		return aname;
	}

	public void setName(String aname) {
		this.aname = aname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return " " + aid + " " + aname + " Address: " + address + "]";
	}

}
