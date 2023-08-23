package com.selenium.a1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browserq2 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver(); 
		driver.get("https://demoqa.com");
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.close();

	}

}
