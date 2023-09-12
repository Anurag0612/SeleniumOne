import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {
	WebDriver driver;
  @Test
  public void f() {
	 driver = new ChromeDriver();
	 driver.get("https://www.google.com");
  }
  @Test
  public void f1() {
	 driver = new ChromeDriver();
	 driver.get("https://www.flipkart.com");
  }
  
 @BeforeTest
 public void a() {
	 System.out.println("Before test of 1");
 }
 @BeforeClass
 public void x() {
	  System.out.println("Before class of 1");
 }
}

