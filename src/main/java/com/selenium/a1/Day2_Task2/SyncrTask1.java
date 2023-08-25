package com.selenium.a1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SyncrTask1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\apadiyar\\Downloads\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions co=new ChromeOptions();
		co.setBinary("C:\\Users\\apadiyar\\Downloads\\chrome-win64\\chrome.exe");
        WebDriver driver= new ChromeDriver(co);
     
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin",Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123",Keys.ENTER);
   //     driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
	}

}
