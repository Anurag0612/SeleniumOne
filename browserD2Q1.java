package com.selenium.a1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class browserD2Q1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\apadiyar\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.setBinary("C:\\Users\\apadiyar\\Downloads\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
		WebElement xs = driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[1]"));
		
			System.out.println(xs.isEnabled()?"Enabled":"Not Enabled");
			System.out.println(xs.isSelected()?"Selected":"Not Selected");
			
			driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[4]"));
			driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[5]"));
			driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[6]"));
		
			WebElement xs1 = driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/div/input[1]"));
			System.out.println(xs1.isSelected()?"Selected":"Not Selected");
			
			WebElement xs2 = driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/div/input[3]"));
			System.out.println(xs2.isSelected()?"Selected":"Not Selected");
			
			//driver.close();
}}