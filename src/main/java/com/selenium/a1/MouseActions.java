package com.selenium.a1;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		/*
		 * driver.get("http://www.browserstack.com/");
		 * driver.manage().window().maximize(); 
		 * WebElement hover =
		 * driver.findElement(By.xpath("//button[@id='product-menu-toggle']"));
		 * action.moveToElement(hover).perform(); WebElement rightcl =
		 * driver.findElement(By.
		 * xpath("//button[@class='developers-dropdown-toggle dropdown-toggle']"));
		 * action.contextClick(rightcl).perform(); WebElement doublecl =
		 * driver.findElement(By.linkText("Pricing"));
		 * action.doubleClick(doublecl).perform();
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 * driver.close();
		 */
		
		
		/*
		 * driver.get("https://demoqa.com/droppable/");
		 * driver.manage().window().maximize(); JavascriptExecutor js =
		 * (JavascriptExecutor) driver; js.executeScript("window.scrollBy(0,250)", "");
		 * WebElement srcelement = driver.findElement(By.id("draggable")); WebElement
		 * destelement = driver.findElement(By.id("droppable"));
		 * //action.clickAndHold(srcelement).release(destelement).build().perform();
		 * //OR action.dragAndDrop(srcelement, destelement).build().perform();
		 */
		
		///KeyBoard Actions
		driver.get("http://www.google.com/");
		WebElement text = driver.findElement(By.name("q"));
		action.keyDown(Keys.SHIFT);
		action.sendKeys("hello").build().perform();
		action.keyUp(Keys.SHIFT);
		action.sendKeys("samsung").build().perform();
		
	}

}
