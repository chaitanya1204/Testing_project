package com.demoTesting.Maven.Maven.testingProject;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameters {
	
	
	
	@Test
	@Parameters("Browser")
	public void hyd(String name) {
		
		System.out.println(name);
	}
	
	@Test
	public void vizag() {
		
		System.out.println("");
	}
	
	
	@Test
	public void bglr() {
		
		System.out.println("");
	}
	
	
	@Test
	public void vij() {
		
		System.out.println("");
	}
	
	
	

}
