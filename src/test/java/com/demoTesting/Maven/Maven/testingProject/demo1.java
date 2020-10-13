package com.demoTesting.Maven.Maven.testingProject;

import org.junit.Assert;
import org.testng.annotations.Test;

public class demo1 {
	
	@Test
	public void hai() {
		
		System.out.println("i m demo hai");
		
		
	}

	@Test(groups = {"smoke"})
	public void hello() {
	
	System.out.println("i m demo hello");
	
	
}

	@Test(groups = {"smoke"})
	public void bye() {
	
	System.out.println("i m demo bye");
	
	
}

}
