package com.selenium.a1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser1 {

	public static void main(String[] args) throws InterruptedException {
		//Browser Setup
		//WebDriverManager.chromedriver().setup();
		//Cross Policy commands only for Chrome to take permission
		
		//driver setup
		System.setProperty("webdriver.chrome.driver","C:\\Users\\apadiyar\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		//Browser Setup
		co.setBinary("C:\\Users\\apadiyar\\Downloads\\chrome-win64\\chrome.exe");
		//co.addArguments("--remote-allow-origins=*");
		//Object creation for chrome driver
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.tagName("body")).sendKeys(Keys.ESCAPE);
		driver.findElement(By.name("q")).sendKeys("Mobile",Keys.ENTER);
		Thread.sleep(3000);
		WebElement samsung = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[3]/div[2]/div[1]/div[2]/div/label/div[1]"));
		samsung.click();
		Thread.sleep(3000);
		//driver.findElement(By.className("_3879cV")).click();
		
		List<WebElement> data =  driver.findElements(By.className("_4rR01T"));
		for(WebElement element :data) {
			System.out.println(element.getText());
		}
		
	}

}
