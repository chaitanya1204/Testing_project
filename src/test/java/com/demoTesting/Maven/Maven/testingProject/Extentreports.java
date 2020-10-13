package com.demoTesting.Maven.Maven.testingProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreports {
	
	//ExtentReports  //ExtentSparkReports //ExtentTest
	
	
	ExtentReports extent;
	
	
	@BeforeTest
	public void config() {
		
		extent = new ExtentReports();
		
		String path = System.getProperty("user.dir")+"\\Reports\\index.html";
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		
		reporter.config().setReportName("Automation Training");
		
		reporter.config().setDocumentTitle("My First Extent Report");
		
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Tester", "Chaitanya");
		
	}
	
	
	@Test
	public void demo() {
		
		ExtentTest test = extent.createTest("Initial Demo");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		extent.flush();
		
		
	}
	
	
	
	
	

	

}
