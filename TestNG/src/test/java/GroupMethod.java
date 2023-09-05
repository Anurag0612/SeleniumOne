import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GroupMethod {
	WebDriver driver;
  @Test(groups = {"group3","group1"})
  public void f() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com");
  }
  
  @Test(groups = {"group2"})
  public void f1() {
	  WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.get("https://www.flipkart.com");
  }
  
  @Test(groups = {"group1","group2"})
  public void f2() {
	  WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.get("https://www.amazon.com");
  }
  @Test(groups = {"group3"})
  public void f3() {
	  WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.get("https://www.demoblaze.com");
  }
}
