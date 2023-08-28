package com.selenium.a1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser2 {

	public static void main(String[] args) throws Exception {

		//setting up driver 
		WebDriverManager.edgedriver().setup();
		//creating driver object (driver is mapped with edge browser)
		WebDriver driver = new EdgeDriver();  //edge driver constructor
		
		//Get Commands
		driver.get("https://www.google.com");
		//to maximize screen
		//driver.manage().window().maximize();
		//driver.get("https://cps.com");
		//to reverse back
		//driver.navigate().back();
		//Take 3 seconds
		//Thread.sleep(3000);
		//driver.navigate().forward();
		//driver.navigate().refresh();
		
		//Title Commands
		String title = driver.getTitle();
		System.out.println(title);
		
		String title1 = driver.getCurrentUrl();
		System.out.println(title1);
		
		String pg = driver.getPageSource();
		System.out.println(pg.length());
		//Closes currently using tab
		//driver.close();
		//Closes all using tab(closes whole window)
		//driver.quit();
		
		 
		//To get current tab Id output   7806915264105FC441B427F343FB5CA3
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		
		Set<String> handles = driver.getWindowHandles(); //retrieves as group elements all Ids
		for(String h: handles) {
			System.out.println(driver.switchTo().window(h));
			System.out.println(driver.getTitle());
		}
		//Search google in search box
		//driver.findElement(By.name("q")).sendKeys("google");
		//click google search
		//driver.findElement(By.className("gNO89b")).submit();
		//using enter button
		driver.findElement(By.name("q")).sendKeys("google",Keys.ENTER);
		//search for bing in another tab
		//driver.switchTo().newWindow(WindowType.TAB);
		//driver.get("https://www.google.com");
		//driver.findElement(By.name("q")).sendKeys("bing",Keys.ENTER);
		//search for fire fox on another tab
		//driver.switchTo().newWindow(WindowType.TAB);
	//	driver.get("https://www.google.com");
	//	driver.findElement(By.name("q")).sendKeys("firefox",Keys.ENTER);
		//driver.quit();
	//	driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com");

		//By storing in an web element object we can use it 
		//WebElement element = driver.findElement(By.name("q"));
		//element.sendKeys("Indore",Keys.ENTER);
		//opens gmail
		WebElement email = driver.findElement(By.partialLinkText("Gm"));
		//email.click();
		//to check weather it is enabled or not
		boolean enablegmail = email.isEnabled();
		System.out.println(enablegmail);
		
		//by id we can get values of it
		WebElement idget = driver.findElement(By.id("APjFqb"));
		System.out.println(idget.getAttribute("id"));
		System.out.println(idget.getAttribute("maxlength"));
		
	// using x path (Relative x path)
	//	WebElement x path = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		//xpath.sendKeys("Hello Indore",Keys.ENTER);
		
		
		//Absolute x path (Full x path)
		WebElement xpath1 = driver.findElement(By.xpath("//textarea[starts-with(@id,'A')]"));
		xpath1.sendKeys("Hello",Keys.ENTER);
		//System.out.println(xpath1.getAttribute("maxlength"));
		//System.out.println(xpath1.getAttribute("id"));
	}

}
