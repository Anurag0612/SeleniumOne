package NewSelenium.Sel.Assessment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		ChromeOptions co = new ChromeOptions();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		username.sendKeys("Admin",Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		password.sendKeys("admin123",Keys.ENTER);
		WebElement profile = driver.findElement(By.xpath("//span[@class=\"oxd-userdropdown-tab\"]"));
		profile.click();
		Thread.sleep(3000);
		WebElement logout = driver.findElement(By.linkText("Logout"));
		logout.click();
		
		String s = driver.getCurrentUrl();
		if(s.equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")) {
			System.out.println("Correct URL: https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}
		else {
			System.out.println("Check Your URL ");
		}
		
	}

}
