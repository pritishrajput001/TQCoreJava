package com.lengthy2;

public class Item {

	private int id;
	private String iname;

	public Item() {

	}

	public Item(int id, String iname) {
		super();
		this.id = id;
		this.iname = iname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIname() {
		return iname;
	}

	public void setIname(String iname) {
		this.iname = iname;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", iname=" + iname + "]";
	}

}
