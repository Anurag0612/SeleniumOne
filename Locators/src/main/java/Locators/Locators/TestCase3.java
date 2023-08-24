package Locators.Locators;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestCase3 {


	    public static void main(String[] args) throws Exception {
	        //chrome browser setup
			System.setProperty("webdriver.chrome.driver","C:\\Users\\apadiyar\\Downloads\\chromedriver-win64\\chromedriver.exe");
	        ChromeOptions co=new ChromeOptions();
	        co.addArguments("\"--disable-notifications\"");
			co.setBinary("C:\\Users\\apadiyar\\Downloads\\chrome-win64\\chrome.exe");
	        // chrome driver obj
	        WebDriver d= new ChromeDriver(co);

	        d.manage().window().maximize();

	        d.get("https://www.redbus.in/");
	        //d.findElement(By.tagName("html")).sendKeys(Keys.ESCAPE);

	        d.findElement(By.id("bus_tickets_vertical")).click();
	        Thread.sleep(3000);


	        d.findElement(By.xpath("//*[@id=\"src\"]")).sendKeys("Mumbai");
	        Thread.sleep(3000);
	        d.findElement(By.xpath("//*[@id=\"homeV2-root\"]/div[1]/div[1]/div/div[1]/div/div[1]/ul/li[1]")).click();
	        Thread.sleep(3000);

	        d.findElement(By.xpath("//*[@id=\"dest\"]")).sendKeys("Pune Jn");
	        Thread.sleep(3000);
	        d.findElement(By.xpath("//*[@id=\"homeV2-root\"]/div[1]/div[1]/div/div[3]/div[1]/ul/li[1]")).click();

	        d.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/div[2]/div/div/div[3]/div[5]/span/div[4]/span")).click();
	        d.findElement(By.xpath("//*[@id=\"search_button\"]")).click();

	 

	        

	        List<WebElement> data1 =  d.findElements(By.className("travels lh-24 f-bold d-color"));
	        for(WebElement element :data1){
	                System.out.println(element.getText());
	       }
	    }

	 

	}
