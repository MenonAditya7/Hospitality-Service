package com.Adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login_Scenario {
	public  	WebDriver driver;
	
	
	@FindBy(id = "username")
	private WebElement login;
	
	

	@FindBy(name = "password")
	private WebElement pass;
	
	@FindBy(id = "login")
     private WebElement lg;
	
		
	public Login_Scenario(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLg() {
		return lg;
	}
	
	


	
}

