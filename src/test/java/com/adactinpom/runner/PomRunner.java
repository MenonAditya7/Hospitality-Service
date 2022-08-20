package com.adactinpom.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature",
						glue = "com\\adactinpom\\stepdefinition")
	
	public class PomRunner {
		
		public static WebDriver driver;
		
		@BeforeClass
		public static void set() {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\itmaint\\eclipse-workspace\\Cucumber\\Driver\\Newdriver\\chromedriver.exe");
            driver= new ChromeDriver();
            
}
}