	package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class2 {

	public static WebDriver driver;

	public static WebDriver getBrowser(String browsername) {
		try {
			if (browsername.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + ("\\Driver\\chromedriver.exe"));
				driver = new ChromeDriver();

			} else if (browsername.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.driver",
						"C:\\Users\\itmaint\\eclipse-workspace\\Seleniuma\\Drivers\\chromedriver.exe");
				driver = new InternetExplorerDriver();
			} else {
				System.out.println("Invalid Browser");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;
	}

	// quit
	public static void quit() {
		try {
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// u r l
	public static void getUrl(String Url) {
		try {
			driver.get(Url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//title
	public static void tlt() {
		String title = driver.getTitle();
		System.out.println("title");

	}

//send keys
	public static void sendKeys(WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

//click
	public static void click_Button(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//double click
	public static void dbleClick(WebElement element) {
		Actions db = new Actions(driver);
		db.doubleClick(element);
	}

//right click
	public static void rgtClick() {
		Actions rt = new Actions(driver);
		rt.contextClick();
	}

//drag drop
	public static void dragDrop(WebElement element, String Options, String value) {
		Select s = new Select(element);
		if (Options.equalsIgnoreCase("byIndex")) {
			int parseInt = Integer.parseInt(value);
			s.selectByIndex(parseInt);

		} else if (Options.equalsIgnoreCase("byValue")) {
			s.selectByValue(value);
		} else if (Options.equalsIgnoreCase("byVisibleText")) {
			s.selectByVisibleText(value);
		} else {
			System.out.println("invalid statement");
		}
	}

//alerts
	public static void alertSwtich(String alertOptions) {
		if (alertOptions.equalsIgnoreCase("ok")) {
			driver.switchTo().alert().accept();
		} else if (alertOptions.equalsIgnoreCase("cancel")) {
			driver.switchTo().alert().dismiss();
		} else {
			System.out.println("invalid statement");
		}
	}

	public static void prompt(String alertpromp) {
		Alert move = driver.switchTo().alert();
		move.sendKeys(alertpromp);
		move.accept();
	}

//move to element
	public static void action(WebElement c) {
		Actions ac = new Actions(driver);
		ac.moveToElement(c).build().perform();
	}

//right click
//public static void Rightclick(WebElement x){
	// Actions cs = new Actions(driver);
	// cs.moveToElement(x).build().perform();
	// }
//robot
	public static void robot() throws AWTException {
		try {
			Robot rc = new Robot();
			rc.keyPress(KeyEvent.VK_DOWN);
			rc.keyRelease(KeyEvent.VK_DOWN);
			rc.keyPress(KeyEvent.VK_DOWN);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

//navigate
	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public static void navigateBack() {
		driver.navigate().back();
	}

	public static void navigateFoward() {
		driver.navigate().forward();
	}

	public static void navigateRefresh() {
		driver.navigate().refresh();
	}

//frame
	public static void singleFrame(String f1) {
		driver.switchTo().frame(f1);
	}

	public static void nestedFrame(String f1, String f2) {
		driver.switchTo().frame(f1);
		driver.switchTo().frame(f2);
	}

//scroll down/up
	public static void scrollDown(WebElement Element) {
		JavascriptExecutor ds = (JavascriptExecutor) driver;
		ds.executeScript("arguments[0].scrollIntoView()", Element);

	}

	public static void scrollUp(WebElement Element) {
		JavascriptExecutor us = (JavascriptExecutor) driver;
		us.executeScript("arguments[0].scrollIntoView()", Element);
	}

//screenshot
	public static void tkeScrenshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;

		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		File drcfile = new File("C:\\Users\\itmaint\\eclipse-workspace\\Seleniuma\\ScreenShot\\Anything\\png");

		FileUtils.copyDirectory(srcfile, drcfile);

	}
}
