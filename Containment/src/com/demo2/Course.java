package com.demo2;

public class Course {

	private int cid;
	private String cname;
	private float courseFees;

	public Course() {

	}

	public Course(int cid, String cname, float courseFees) {
		this.cid = cid;
		this.cname = cname;
		this.courseFees = courseFees;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public float getCourseFees() {
		return courseFees;
	}

	public void setCourseFees(float courseFees) {
		this.courseFees = courseFees;
	}

	public String toString() {
		return "Course:" + cid + "  " + cname + " " + courseFees;
	}

}