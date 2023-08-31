package NewSelenium.Sel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertsNotification {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		ChromeOptions co = new ChromeOptions();
		driver.get("https://demo.guru99.com/test/delete_customer.php\r\n");
		WebElement textboxel = driver.findElement(By.xpath("//input[@name=\"cusid\"]"));
		textboxel.sendKeys("301");
		Thread.sleep(3333);
		driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
		Thread.sleep(3000);
		
		//1st Alert
		Alert a1 = driver.switchTo().alert();
		a1.accept();
		Thread.sleep(3000);
		//2nd Alert 
		Alert a2 = driver.switchTo().alert();
		String str = a2.getText();
		a2.accept();
		System.out.println(str);
		
	}

}
