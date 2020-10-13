package com.demoTesting.Maven.Maven.testingProject;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		
		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Tree");
		
		a.add("Water");
		
		a.add("Water");
		
		System.out.println(a);
		
		a.add(0, "Ball");
		
		System.out.println(a);
		
		a.remove("Water");
		
		System.out.println(a);
		
		System.out.println(a.get(2));
		
		System.out.println(a.contains("Bat"));
		
		System.out.println(a.indexOf("Tree"));
		
		System.out.println(a.isEmpty());
		
		

	}

}
