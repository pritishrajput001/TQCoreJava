package com.treemap;

public class Customer implements Comparable<Customer> {
	private int cusId;
	private String name;
	private long number;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int cusId, String name, long number) {
		super();
		this.cusId = cusId;
		this.name = name;
		this.number = number;
	}

	public int getCusId() {
		return cusId;
	}

	public void setCusId(int cusId) {
		this.cusId = cusId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Customer [cusId=" + cusId + ", name=" + name + ", number=" + number + "]";
	}

	@Override
	public int compareTo(Customer o) {

		if (this.cusId < o.cusId)
			return -1;
		else if (this.cusId > o.cusId)
			return 1;
		else
			return 0;
	}

}
