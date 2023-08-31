package NewSelenium.Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dates {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		ChromeOptions co = new ChromeOptions();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		WebElement from = driver.findElement(By.id("source"));
		from.sendKeys("Pune");
		WebElement to = driver.findElement(By.id("destination"));
		to.sendKeys("Indore");
		
		WebElement date = driver.findElement(By.xpath("//input[@id=\"datepicker1\"]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','30/10/23')",date);

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"frmFinal\"]/div/div[5]/a")).sendKeys(Keys.ENTER);
	}
	
}
