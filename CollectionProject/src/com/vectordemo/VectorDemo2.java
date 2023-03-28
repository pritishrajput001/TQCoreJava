package com.vectordemo;

import java.util.Vector;

public class VectorDemo2 {

	public static void main(String[] args) {

	      Vector<String> names= new Vector<>(4,2);
	      System.out.println(names.size()); // number of elements
	      System.out.println(names.capacity());
	      
	      names.add("Vaishanvi");
	      names.add("Sagar");
	      names.add("Rahul");
	      names.add("Rohan");
	      
	      System.out.println(names.size()); // number of elements
	      System.out.println(names.capacity());
	      
	      names.add("Omkar");
	      System.out.println("////////////////////////");
	      
	      names.setSize(10);
	     
	      names.ensureCapacity(20);
	      
	      
	      System.out.println(names.size()); // number of elements
	      System.out.println(names.capacity());// increment by 2
	      
	      System.out.println(names);
	      
	      
	    
	      
	      
	      
	      
	      
	      
	      

		}

	}

