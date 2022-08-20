package com.Adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Scenario {

	public  WebDriver driver;
	
	
		

    	@FindBy(id = "location")
		private WebElement ht ;
		
		@FindBy(id = "hotels")
		private WebElement rc;
		
		@FindBy(id = "room_type")
		private WebElement re;
		
		@FindBy(id = "room_nos")
		private WebElement ss;
		 
		@FindBy(name = "datepick_in")
		private WebElement sa;
		
		@FindBy(id = "datepick_out")
		private WebElement vd;
		
		
		@FindBy(id = "adult_room")
		private WebElement wc;
		 
		@FindBy(id = "child_room")
		private WebElement cc;
		
		@FindBy(id = "Submit")
		private WebElement bb;
		
		
		

		public Hotel_Scenario(WebDriver driver2) {
			this.driver = driver2;
			PageFactory.initElements(driver2, this);
		}

	

		public WebElement getHt() {
			return ht;
		}

		public WebElement getRc() {
			return rc;
		}

		public WebElement getRe() {
			return re;
		}

		public WebElement getSs() {
			return ss;
		}

		public WebElement getSa() {
			return sa;
		}

		public WebElement getVd() {
			return vd;
		}

		public WebElement getWc() {
			return wc;
		}

		public WebElement getCc() {
			return cc;
		}

		public WebElement getBb() {
			return bb;
		}
	
}
