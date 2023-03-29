package com.maplogical2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Student {

	int id;
	String name;
	int age;

	public Student() {

	}

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int hashcode() {
		return Objects.hash(id,name,age);
	}
	
	public boolean equals(Object o)
	{
		if(this==o)
			return true;
		if(this.getClass()!=o.getClass())
			return false;
		Student st = (Student)o;
		
		if(this.id!=st.id)
			return false;
		else if(this.name==null)
			return false;
		else if(st.name==null)
			return false;
		else if(!this.name.equals(st.name))
			return false;
		else if(this.age!=st.age)
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}

public class HashmapStudent{
	
	public static void searchStudent(HashMap<Student,String> map)
	{
		String name="Adinath";
		Student s = null;
		for(Map.Entry<Student, String> en:map.entrySet())
		{
		
		}
	}
	
	public static void main(String args[]) {
		HashMap<Student,String> smap= new HashMap<>();
		
		smap.put(new Student(201,"Pritish",23),"Btech");
		smap.put(new Student(203,"Adinath",22),"BCA");
		smap.put(new Student(208,"Saurabh",23),"MCA");
		smap.put(new Student(401,"Tejas",24),"BSC");
		smap.put(new Student(209,"Gaurav",26),"MSC");
		
		searchStudent(smap);
		
	}
	
}
