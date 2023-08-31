package NewSelenium.Sel.Assessment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HospitalLogin {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.smart-hospital.in/site/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div[2]/a[2]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/form/button")).click();
		driver.findElement(By.xpath("//*[@id=\"sibe-box\"]/ul[2]/li[8]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div[1]/div/a[1]")).click();
		 driver.findElement(By.xpath("//input[@id='title']")).sendKeys("Entering Title here");

		
		WebElement element = driver.findElement(By.xpath("/html/body"));
		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();
		action.sendKeys("Entering The correct Data").perform();
		Thread.sleep(3000);
		
		WebElement noticedate = driver.findElement(By.xpath("//input[@id=\"date\"]"));
		WebElement publishdate = driver.findElement(By.xpath("//input[@id=\"publish_date\"]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].setAttribute('value','08/10/2023') ", noticedate);
		js.executeScript("arguments[0].setAttribute('value','10/11/2023') ", publishdate);
		
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div/div[3]/div/button")).click();
		
		WebElement msg = driver.findElement(By.xpath("//*[@id=\"form1\"]/div/div[2]/div/div[1]"));
		String msgprint = msg.getText();
		System.out.println(msgprint);

		if(msgprint.equalsIgnoreCase("Record Saved Successfully")) {
			System.out.println(msgprint +" is correct message");
		}
		
	}

}
