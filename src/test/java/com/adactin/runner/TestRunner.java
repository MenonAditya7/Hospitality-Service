package com.adactin.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base.Base_Class2;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature",
					glue = "com\\adactin\\stepdefintion")		
		


public class TestRunner {

	public static WebDriver driver;
	
	@BeforeClass
	public static void set() {
		driver=Base_Class2.getBrowser("Chrome");
		
	}
	
}			






