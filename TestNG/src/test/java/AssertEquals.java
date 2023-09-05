import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertEquals {
	WebDriver driver ;
  @Test (priority=2)
  public void f() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  
	  driver.get("https://www.google.com");
	 driver.findElement(By.name("q")).sendKeys("Hello",Keys.ENTER);
	 // Assert.assertEquals(driver.getTitle(), "Hell0 - Google Search");
	 // Assert.assertNotEquals(driver.getTitle(),"Gle Search");
	  
  }
  
  @Test(priority=1)
  public void f1() {
	  WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.get("https://www.flipkart.com");
  }
  
  
}
