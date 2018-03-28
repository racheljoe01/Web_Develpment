package com.qa.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverTest {

	private static WebDriver driver;

	@Before
	public void setup() {
		//System.setProperty("webdriver.chrome.driver", "C:/development/web_driver/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void testGoogleSearch() throws InterruptedException {
		// Optional, if not specified, WebDriver will search your path for chromedriver.
		try {
			driver.get("https://www.justgiving.com");
			driver.manage().window().fullscreen();
			
			Thread.sleep(5000); // Let the user actually see something!
			WebElement signIn = driver.findElement(By.xpath("//*[@id=\"register-link\"]"));
			signIn.click();  //login first because login is an object and click is a method within the webElement class. so it's always object.method
			
			WebElement emailAddress = driver.findElement(By.xpath("//*[@id=\"email0\"]"));
			emailAddress.sendKeys("racheljoe01@yahoo.co.uk");
			
			WebElement firstName = driver.findElement(By.xpath("//*[@id=\"first-name\"]"));
			firstName.sendKeys("Rachel");
			
			WebElement lastName = driver.findElement(By.xpath("//*[@id=\"last-name\"]"));
			lastName.sendKeys("Joseph");
			
			WebElement password = driver.findElement(By.xpath("//*[@id=\"password1\"]"));
			password.sendKeys("kirstyisthebest");
			
			WebElement signUp = driver.findElement(By.name("Sign Up"));
			signUp.click();
		
		} finally {
	  }		
	}

	@After
	public void tearDown() {
		driver.quit();
	}

}
