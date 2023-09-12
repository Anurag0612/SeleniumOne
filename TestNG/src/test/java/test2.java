import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test2 {
  WebDriver driver;
  @Test
  public void f() {

	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.amazon.com");  
  }
  
 
  @BeforeMethod
  public void beforemethod() {
  WebDriverManager.chromedriver().setup();
  System.out.println("Before method of 1");
}
  @AfterMethod
  public void aftermethod() {
	  System.out.println("After Method of 2");
	  driver.quit();
  }
  
  @AfterTest
  public void afterTest() {
	  System.out.println("After Class of 2");
	  driver.quit();
  }
  @BeforeTest
  public void b() {
	  System.out.println("Before test of 2");
  }
  
  @BeforeClass
  public void xz() {
	  System.out.println("Before class of 2");
  }
}