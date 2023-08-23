package com.selenium.a1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browseerq1 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver(); 
		driver.get("https://flipkart.com");
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(title.length());
		String title1 = driver.getCurrentUrl();
		System.out.println(title1);
		String pg = driver.getPageSource();
		System.out.println(pg);
		System.out.println(pg.length());
		driver.close();
	}

}
