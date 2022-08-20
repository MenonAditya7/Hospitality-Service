package com.adactinpom.stepdefinition;
//import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Adactin.pom.Hotel_Scenario;
import com.Adactin.pom.Hotelbooked_Scenario;
import com.Adactin.pom.Login_Scenario;
import com.Adactin.pom.Selection_Scenario;
//import com.adactin.runner.TestRunner;
import com.adactinpom.runner.PomRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TeststepDefinition {

public static WebDriver driver = PomRunner.driver;
	
	Login_Scenario io = new Login_Scenario(driver);
	
	Hotel_Scenario sr = new Hotel_Scenario(driver);
	
	Hotelbooked_Scenario eo = new Hotelbooked_Scenario(driver);
	
	Selection_Scenario ca = new Selection_Scenario(driver);
			
	@Given("The system is ready to work")
	public void the_system_is_ready_to_work() {
	 
	}

	@When("User launches the application")
	public void user_launches_the_application() {
		 driver.get("https://www.google.com/");
	}

	@When("User maximizes the screen")
	public void user_maximizes_the_screen() {
	   driver.manage().window().maximize();
	}

	@Then("The application is launched")
	public void the_application_is_launched() {
	   driver.get("https://adactinhotelapp.com/");
	}

	@When("User enters the Login ID and password")
	public void user_enters_the_login_id_and_password() {
		io.getLogin().sendKeys("Adityamenon");
		io.getPass().sendKeys("aditya19996");
	}

	@Then("Clicks the login button")
	public void clicks_the_login_button() {
     io.getLg().click();
	  
	}

	@Then("User in Home page")
	public void user_in_home_page() {
	   
	}

	@Given("To search hotels")
	public void to_search_hotels() {
	  	
	    	
	}

	@When("User selects hotel location")
	public void user_selects_hotel_location() {
		  WebElement ht = sr.getHt();
		    Select st = new Select(ht);
		    	st.selectByIndex(3);
	}

	@When("User selects the hotel")
	public void user_selects_the_hotel() {
	    WebElement rc = sr.getRc();
	    Select se = new Select(rc);
	    		se.selectByIndex(2);
	}

	@Then("User selects the room type")
	public void user_selects_the_room_type() {
	   WebElement re = sr.getRe();
	   Select sd = new Select(re);
	   sd.selectByIndex(3);
	}

	@Then("User selects number of rooms")
	public void user_selects_number_of_rooms() {
	 WebElement ss = sr.getSs();
	 Select sx = new Select(ss);
	 sx.selectByIndex(1);
	}

	@Then("User enters check in date")
	public void user_enters_check_in_date() {
	sr.getSa().sendKeys("17/12/2021");
	
	
	}

	@Then("User enter check out date")
	public void user_enter_check_out_date() {
		sr.getVd().sendKeys("20/12/2021");
	   
	}

	@Then("User selects adults per room")
	public void user_selects_adults_per_room() {
	   WebElement wc = sr.getWc();
	   Select et = new Select(wc);
	   et.selectByIndex(2);
	}

	@Then("User selects children per room")
	public void user_selects_children_per_room() {
		WebElement cc = sr.getCc();
		Select wt = new Select(cc);
		wt.selectByIndex(1);
	  
	}

	@Then("User click on search button")
	public void user_click_on_search_button() {
		sr.getBb().click();
	  
	}

	@Given("User clicks on the selected radio button")
	public void user_clicks_on_the_selected_radio_button() {
	   ca.getRadio().click();
	}

	@Then("User will click on the continue button")
	public void user_will_click_on_the_continue_button() {
	   ca.getCon().click();
	}

	@Given("User enters the person details for booking")
	public void user_enters_the_person_details_for_booking() {
	    
	}

	@When("User enter the First name")
	public void user_enter_the_first_name() {
	   eo.getFname().sendKeys("Aditya");
	}

	@When("User enter the Last name")
	public void user_enter_the_last_name() {
	  eo.getLname().sendKeys("Menon");
	  
	}

	@Then("User enter the Biling address")
	public void user_enter_the_biling_address() {
		eo.getAdd().sendKeys("234/22 mrc nagar chennai");
	 
	}

	@Then("User enter the Card number")
	public void user_enter_the_card_number() {
		eo.getCn().sendKeys("22223333444455556666");
	   
	}

	@Then("User enter the Card type")
	public void user_enter_the_card_type() {
	 WebElement ct = eo.getCt();
	 Select wq = new Select(ct);
	 wq.selectByIndex(2);
	}

	@Then("User enter the Card expiry date")
	public void user_enter_the_card_expiry_date() {
	   WebElement cm = eo.getCm();
	   Select qw = new Select(cm);
	   qw.selectByIndex(4);
	   WebElement ey = eo.getEy();
	   Select we = new Select(ey);
	   we.selectByIndex(12);
	}

	@Then("User enter the Card CVV number")
	public void user_enter_the_card_cvv_number() {
		eo.getCcv().sendKeys("345");
	   
	}

	@Then("User click on book now buttton")
	public void user_click_on_book_now_buttton() {
	   eo.getBn().click();
	}

	@Given("User verify the booking details")
	public void user_verify_the_booking_details() {
	  
	}

	@Then("User clicks the logout button")
	public void user_clicks_the_logout_button() {
	   
	}
}