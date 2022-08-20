package com.adactin.stepdefintion;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.TestRunner;

import io.cucumber.java.en.*;

public class TestStepdefinition {
	
	 WebDriver driver = TestRunner.driver;
	@Given("The system is ready to work")
	public void the_system_is_ready_to_work() {
	System.out.println("Browser launch");
	}

	@When("User launches the application")
 public void user_launches_the_application() {
	driver.get("https://www.google.com/");
driver.get("https://adactinhotelapp.com/");
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
	  WebElement login = driver.findElement(By.id("username"));
	  login.sendKeys("Adityamenon");
	  WebElement pass = driver.findElement(By.name("password"));
	  pass.sendKeys("aditya19996");
	}

	@Then("Clicks the login button")
	public void clicks_the_login_button() {
	  WebElement lg = driver.findElement(By.id("login"));
	  lg.click();
	}

	@Then("User in Home page")
	public void user_in_home_page() {
		System.out.println("Home page");
	 	}

	@Given("To search hotels")
	public void to_search_hotels() {
	   System.out.println("To Search Hotel");
	   
	}

	@When("User selects hotel location")
	public void user_selects_hotel_location() {
		WebElement ht = driver.findElement(By.id("location"));
	  Select hl = new Select(ht);
	  hl.selectByIndex(1);
	}

	@When("User selects the hotel")
	public void user_selects_the_hotel() {
	   WebElement rr = driver.findElement(By.id("hotels"));
	   Select rc = new Select(rr);
	   rc.selectByIndex(3);
	}

	@Then("User selects the room type")
public void user_selects_the_room_type() {
		WebElement re = driver.findElement(By.id("room_type"));
	   Select rw = new Select(re);
	   rw.selectByIndex(3);
	}

@Then("User selects number of rooms")
	public void user_selects_number_of_rooms() {
	  WebElement ss = driver.findElement(By.id("room_nos"));
	  Select sw = new Select(ss);
	  sw.selectByIndex(1);
	}

	@Then("User enters check in date")
	public void user_enters_check_in_date() {
		WebElement sa = driver.findElement(By.name("datepick_in"));
	    sa.sendKeys("10/12/2021");
	}

	@Then("User enter check out date")
	public void user_enter_check_out_date() {
		WebElement vd = driver.findElement(By.id("datepick_out"));
		vd.sendKeys("12/12/2021");
	  
}

	@Then("User selects adults per room")
	public void user_selects_adults_per_room() {
  WebElement wc = driver.findElement(By.id(("adult_room")));
  Select no = new Select(wc);
	  no.selectByIndex(1);
	}

	@Then("User selects children per room")
	public void user_selects_children_per_room() {
		WebElement cc = driver.findElement(By.id("child_room"));
		Select cq = new Select(cc);
   
}

	@Then("User click on search button")
	public void user_click_on_search_button() {
		WebElement bb = driver.findElement(By.id("Submit"));
		bb.click();
  
	}

	@Given("User clicks on the selected radio button")
	public void user_clicks_on_the_selected_radio_button() {
	  WebElement rt = driver.findElement(By.id("radiobutton_0"));
  rt.click();
	}
//
@Then("User will click on the continue button")
	public void user_will_click_on_the_continue_button() {
	  WebElement fo = driver.findElement(By.id("continue"));
	  fo.click();

	}

	@Given("User enters the person details for booking")
	public void user_enters_the_person_details_for_booking() {
	   System.out.println("Book the hotel");
	}

	@When("User enter the First name")
	public void user_enter_the_first_name() {
		WebElement gt = driver.findElement(By.id("first_name"));
	gt.sendKeys("xyzbbs");
	}
	@When("User enter the Last name")
public void user_enter_the_last_name() {
		WebElement gb = driver.findElement(By.id("last_name"));
		gb.sendKeys("abcde");
	}

	@Then("User enter the Biling address")
	public void user_enter_the_biling_address() {
		WebElement be = driver.findElement(By.id("address"));
		be.sendKeys("22/10 zxsdrty chennai");
	   
	}

	@Then("User enter the Card number")
	public void user_enter_the_card_number() {
		WebElement cv = driver.findElement(By.id("cc_num"));
 cv.sendKeys("22223333444455555");
	}

	@Then("User enter the Card type")
	public void user_enter_the_card_type() {
		WebElement ct = driver.findElement(By.id("cc_type"));
	Select ru = new Select(ct);
		ru.selectByIndex(3);
	    
	}

	@Then("User enter the Card expiry date")
	public void user_enter_the_card_expiry_date() {
		WebElement dd = driver.findElement(By.id("cc_exp_month"));
		Select ii = new Select(dd);
		ii.selectByIndex(11);
		WebElement uu = driver.findElement(By.id("cc_exp_year"));
		Select zz = new Select(uu);
		zz.selectByIndex(12);
	    
	}

	@Then("User enter the Card CVV number")
	public void user_enter_the_card_cvv_number() {
		WebElement fd = driver.findElement(By.id("cc_cvv"));
		fd.sendKeys("345");
	
	}

	@Then("User click on book now buttton")
	public void user_click_on_book_now_buttton() {
		WebElement cx = driver.findElement(By.name("book_now"));
	cx.click();
	   
	}

	@Given("User verify the booking details")
	public void user_verify_the_booking_details() {
		System.out.println("Verified details");
	    
	}

	@Then("User clicks the logout button")
	public void user_clicks_the_logout_button() {
	  WebElement cm = driver.findElement(By.className("reg_button"));
		
		cm.click();
		
	}


	
	
	}