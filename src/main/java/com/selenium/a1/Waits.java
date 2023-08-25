package com.selenium.a1;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class Waits {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\apadiyar\\Downloads\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions co=new ChromeOptions();
		co.setBinary("C:\\Users\\apadiyar\\Downloads\\chrome-win64\\chrome.exe");
        WebDriver d= new ChromeDriver(co);
        
        //Implicit
        long starttime = System.currentTimeMillis();
        d.get("http://www.omayo.blogspot.com/"); 
        d.findElement(By.className("dropbtn")).click();
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        long endtime = System.currentTimeMillis();
        System.out.println(((endtime-starttime)/1000.0)+" seconds..");
        d.findElement(By.linkText("Facebook")).click();
        
//Explicit
      //  WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(20));
      //  d.manage().window().maximize();
      //  d.get("http://www.omayo.blogspot.com/"); 
       // WebElement webe = d.findElement(By.id("timerbutton"));
       // wait.until(ExpectedConditons.elementToBeClickable(webe));
      //  webe.click();
        
//FluentWait
        d.manage().window().maximize();
        d.get("http://www.omayo.blogspot.com/"); 
        
        Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(d)
       	.withTimeout(Duration.ofSeconds(15))
       	.pollingEvery(Duration.ofSeconds(3))
       	.ignoring(NoSuchElementException.class);

        WebElement foo = fluentWait.until(new Function<WebDriver, WebElement>(){
        	public WebElement apply(WebDriver driver) {
        		return driver.findElement(By.id("foo"));
        	}
        });
            
        
        
	}

}

