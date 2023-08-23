package com.selenium.a1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser1 {

	public static void main(String[] args) {
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
		driver.get("https://www.google.com");
	}

}
