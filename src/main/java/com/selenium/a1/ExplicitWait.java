package com.selenium.a1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String[] args) {
		
		  WebDriverManager.chromedriver().setup();
	        ChromeDriver driver=new ChromeDriver();
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
	        wait.until(ExpectedConditions.elementToBeClickable(By.name("username"))).sendKeys("Admin");
	        wait.until(ExpectedConditions.elementToBeClickable(By.name("password"))).sendKeys("admin123");
	        wait.until(ExpectedConditions.elementToBeClickable(By.tagName("submit"))).click();
	        wait.until(ExpectedConditions.alertIsPresent());
	        wait.until(ExpectedConditions.urlToBe("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"));
	        

	        

	    
		
	}

}
