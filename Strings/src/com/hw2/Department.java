package com.hw2;

public class Department {
	private int depIds;
	private String deptName;

	public Department() {
		super();

	}

	public Department(int depIds, String deptName) {
		super();
		this.depIds = depIds;
		this.deptName = deptName;
	}

	public int getDepIds() {
		return depIds;
	}

	public void setDepIds(int depIds) {
		this.depIds = depIds;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Department [depIds=" + depIds + ", deptName=" + deptName + "]";
	}

}
