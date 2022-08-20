package com.Adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotelbooked_Scenario {

	public  WebDriver driver;
	
	@FindBy(id = "first_name")
	private WebElement fname ;
	

	@FindBy(id = "last_name")
	private WebElement lname;
	
	@FindBy(id = "address")
	private WebElement add;
	
	@FindBy(id = "cc_num")
	private WebElement cn;
	 
	@FindBy(name = "cc_type")
	private WebElement ct;
	
	@FindBy(id = "cc_exp_month")
	private WebElement cm;
	
	
	@FindBy(id = "cc_exp_year")
	private WebElement ey;
	 
	@FindBy(id = "cc_cvv")
	private WebElement ccv;
	
	@FindBy(id = "book_now")
	private WebElement bn;
	

	
	
	public Hotelbooked_Scenario(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getCn() {
		return cn;
	}

	public WebElement getCt() {
		return ct;
	}

	public WebElement getCm() {
		return cm;
	}

	public WebElement getEy() {
		return ey;
	}

	public WebElement getCcv() {
		return ccv;
	}

	public WebElement getBn() {
		return bn;
	}
	
}
