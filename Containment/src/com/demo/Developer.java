package com.demo;

public class Developer {
	int id;
	String skill;
	int experience;

	Developer(int id, String skill, int experience) {
		this.id = id;
		this.skill = skill;
		this.experience = experience;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String toString() {
		return "Developer id is" + id + " his skill is" + skill + " and having experience of " + experience + " years";
	}

}
