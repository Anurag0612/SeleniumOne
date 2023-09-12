package log4J;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login1 {
	WebDriver driver;
  @Test
  public void f() {
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com");
	  Logger logger = LogManager.getLogger(Login1.class);
	  
	//used multiple predefined methods in logger class - logger levels

	  logger.error("This is an error");
	  logger.warn("This is a warning");
	  logger.fatal("This is a fatal");
  }
}
