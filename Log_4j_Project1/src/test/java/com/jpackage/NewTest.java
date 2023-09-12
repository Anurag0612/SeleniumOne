package com.jpackage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class NewTest {
	WebDriver driver;
	  @Test
	  public void f() {
		  driver = new ChromeDriver();
		  driver.get("https://www.google.com");
		  Logger logger = LogManager.getLogger(NewTest.class);
		  
		//used multiple predefined methods in logger class - logger levels

		  logger.error("This is an error");
		  logger.warn("This is a warning");
		  logger.fatal("This is a fatal");
	  }
}
