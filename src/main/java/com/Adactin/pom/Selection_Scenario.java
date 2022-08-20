package com.Adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selection_Scenario {
	public static WebDriver driver;
	
	@FindBy(id = "radiobutton_0")
	private WebElement radio;
	
	@FindBy(name = "continue")
	private WebElement con;
	


	public Selection_Scenario(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}



	public WebElement getRadio() {
		return radio;
	}



	public WebElement getCon() {
		return con;
	}
	
	

}




	



	






	


