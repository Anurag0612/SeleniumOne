import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dependsonmethods {
	WebDriver driver;
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com");
  }
  
  
  @Test(dependsOnMethods= {"f","f2"})
  public void f1() {
	  WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.get("https://www.flipkart.com");
  }
  
  @Test(dependsOnMethods= {"f"})
  public void f2() {
	  WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.get("https://www.flkart.com");
  }
}
