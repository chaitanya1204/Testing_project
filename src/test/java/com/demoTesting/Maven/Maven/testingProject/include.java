package com.demoTesting.Maven.Maven.testingProject;

import org.testng.annotations.Test;

public class include {
	
	
	@Test
	public void test1() {
		
		System.out.println("i m in test1");
	}
	
	@Test(groups = {"smoke"})
	public void test2() {
		
		System.out.println("i m in test2");
	}
	
	@Test(groups = {"smoke"})
	public void test3() {
		
		System.out.println("i m in test3");
	}
	
	@Test
	public void test4() {
		
		System.out.println("i m in test4");
	}
	
	
	
	
	

}
