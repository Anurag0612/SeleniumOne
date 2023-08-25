package com.selenium.a1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SyncTask2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\apadiyar\\Downloads\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions co=new ChromeOptions();
		co.setBinary("C:\\Users\\apadiyar\\Downloads\\chrome-win64\\chrome.exe");
        WebDriver driver= new ChromeDriver(co);
        
        long starttime = System.currentTimeMillis();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin",Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123",Keys.ENTER);
        WebDriverWait web = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement webwl =driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span"));
        web.until(ExpectedConditions.elementToBeClickable(webwl));
        webwl.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys("Admin",Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
        long endtime = System.currentTimeMillis();
        System.out.println(((endtime-starttime)/1000)+" Seconds..");
        
        
	
     
	}

}
