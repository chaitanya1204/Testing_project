package com.demoTesting.Maven.Maven.testingProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class property {
	
	public static void main(String[] args) throws IOException {
		
		Properties pro = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Public\\Downloads\\Eclips workspace\\Maven.testingProject\\data.properties");
		
		pro.load(fis);		
		
		System.out.println(pro.getProperty("browser"));
		
		System.out.println(pro.getProperty("URL"));
		
		pro.setProperty("browser", "firefox");
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Public\\\\Downloads\\Eclips workspace\\Maven.testingProject\\data.properties");
		
		pro.store(fos, null);
		
		
		
		
		
		
	}

}
