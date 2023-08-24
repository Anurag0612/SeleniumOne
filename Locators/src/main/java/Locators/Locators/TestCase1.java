package Locators.Locators;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

public class TestCase1 { 

	    public static void main(String[] args) throws Exception {

	                //chrome browser setup
			System.setProperty("webdriver.chrome.driver","C:\\Users\\apadiyar\\Downloads\\chromedriver-win64\\chromedriver.exe");
			
	                ChromeOptions co=new ChromeOptions();
	                
	                co.setBinary("C:\\\\Users\\\\apadiyar\\\\Downloads\\\\chrome-win64\\\\chrome.exe");

	                // chrome driver obj
	                WebDriver d= new ChromeDriver(co);

	                //maximize the window
	                d.manage().window().maximize();


	                d.get("https://www.redbus.in/");
	                d.findElement(By.tagName("html")).sendKeys(Keys.ESCAPE);
	                d.findElement(By.xpath("//*[@id=\"rail_tickets_vertical\"]")).click();
	                Thread.sleep(3000);
	               d.findElement(By.xpath("//*[@id=\"src\"]")).sendKeys("Mumbai - All Stations");

	                Thread.sleep(3000);
	                d.findElement(By.xpath("//*[@id=\"root\"]/section[1]/div[2]/div[3]/div/div/div/div/div[1]")).click();

	                Thread.sleep(3000);
	                d.findElement(By.xpath("//*[@id=\"dst\"]")).sendKeys("Pune Jn");

	                Thread.sleep(3000);
	                d.findElement(By.xpath("//*[@id=\"root\"]/section[1]/div[2]/div[3]/div/div/div/div/div[1]")).click();
	                d.findElement(By.xpath("//*[@id=\"root\"]/section[1]/div[2]/div[3]/div/form/button")).click();

	                Thread.sleep(5000);
	                d.quit();                
	    }	 

	}


