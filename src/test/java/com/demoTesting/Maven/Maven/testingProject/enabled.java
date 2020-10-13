package com.demoTesting.Maven.Maven.testingProject;

import org.testng.annotations.Test;

public class enabled {
	
	
	@Test
	public void carloan() {
		
		System.out.println("i m in carloan");
		
		
	}
	
	
	@Test
	public void bikeloan() {
		
		System.out.println("i m in bikeloan");
		
		
	}

	
	@Test
	public void houseloan() {
		
		System.out.println("i m in houseloan");
	
	
}

	@Test(enabled = true)
	public void personalloan() {
		
		System.out.println("i m in personalloan");
	
	
}

}
