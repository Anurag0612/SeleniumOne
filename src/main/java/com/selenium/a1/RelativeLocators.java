package com.selenium.a1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocators {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		ChromeOptions co = new ChromeOptions();
		
		driver.get(
		  "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		  
		  WebElement lab = driver.findElement(By.xpath("//*[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--gutters oxd-sheet--gray-lighten-2 orangehrm-demo-credentials']")); WebElement below =
		  driver.findElement(RelativeLocator.with(By.tagName("input")).below(lab));
		  below.sendKeys("Admin");
		  
		  WebElement above =driver.findElement(RelativeLocator.with(By.name("password")).above(By.tagName("button")));
		  above.sendKeys("admin123");
		  
		  driver.findElement(By.tagName("button")).click();  
		 
		
			/*
			 * driver.get("https://www.softwaretestingmaterial.com/");
			 * driver.manage().window().maximize();
			 * 
			 * WebElement toRightof = driver.findElement(RelativeLocator.with(By.
			 * xpath("//img[@class='wp-image-19485 ezlazyloaded']")).toRightOf(By.
			 * xpath("//img[@class='wp-image-19488 ezlazyloaded']"))); toRightof.click();
			 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			 * 
			 * WebElement left = driver.findElement(By.xpath(
			 * "//*[@id=\"kt-layout-id_ce6aeb-d9\"]/div/div[2]/div/figure/a/img"));
			 * WebElement toLeftof =
			 * driver.findElement(RelativeLocator.with(By.tagName("img")).toLeftOf(left));
			 * toLeftof.click();
			 */
		 
	}
	

}
