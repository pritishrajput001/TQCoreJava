package com.custommap2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EmployeeDepartmentHashMap {

	public static void createDepartmentNameEmployeeMap(ArrayList<Employee> el) {
		HashMap<Department,ArrayList<String>> deptmap = new HashMap<>();
		
		Iterator <Employee> itr = el.iterator();
		
		ArrayList<String> deptlist;
		
		while(itr.hasNext())
		{
			Employee e=itr.next();
			if(!deptmap.containsKey(e.getDepartment()))
			{
				deptlist=new ArrayList<>();
			}
			else
			{
				deptlist=deptmap.get(e.getDepartment());			
			}
			deptlist.add(e.getName());
			deptmap.put(e.getDepartment(), deptlist);			
		}
		for(Map.Entry<Department, ArrayList<String>> en:deptmap.entrySet())
		{
			System.out.println(en.getKey());
			
		}
		System.out.println("---------------------------------");
	}
	
	public static void countEmployeeDepartment(ArrayList<Employee> et) {
		HashMap<Department,Integer> deptmap=new HashMap<>();
		
		Iterator<Employee> itr=et.iterator();
		int count;
		while(itr.hasNext()) {
		count=1;
		Employee e =itr.next();
		if(!deptmap.containsKey(e.getDepartment()))
		{
			deptmap.put(e.getDepartment(),count);
		}
		else {
			count=deptmap.get(e.getDepartment());
			deptmap.put(e.getDepartment(), count+1);
		}
		}
		for(Map.Entry<Department, Integer> en:deptmap.entrySet())
		{
			System.out.println(en.getKey().getDname()+" "+en.getValue());
			
		}
		
	}

	public static void main(String args[]) {
		ArrayList<Employee> emp = new ArrayList<>();
		
		emp.add(new Employee(101,"Pritish",84299f,new Department(11,"HR")));
		emp.add(new Employee(102,"Shivam",87634f,new Department(32,"SALES")));
		emp.add(new Employee(103,"Shubham",87458f,new Department(11,"HR")));
		emp.add(new Employee(104,"Nikhil",76345f,new Department(66,"BUSINESS")));
		emp.add(new Employee(105,"Sanket",87634f,new Department(11,"HR")));
		emp.add(new Employee(106,"Chetan",97349f,new Department(66,"BUSINESS")));
		emp.add(new Employee(107,"Raj",86345f,new Department(21,"MARKETING")));
		
		createDepartmentNameEmployeeMap(emp);
		countEmployeeDepartment(emp);
				
	}

}
