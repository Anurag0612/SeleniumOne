package Locators.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestCase2 {

	    public static void main(String[] args) throws Exception {

	        //chrome browser setup
			System.setProperty("webdriver.chrome.driver","C:\\Users\\apadiyar\\Downloads\\chromedriver-win64\\chromedriver.exe");
	        ChromeOptions co=new ChromeOptions();
			co.setBinary("C:\\Users\\apadiyar\\Downloads\\chrome-win64\\chrome.exe");

	        // chrome driver obj
	        WebDriver d= new ChromeDriver(co);

	        //maximize the window
	        d.manage().window().maximize();
	        d.get("https://www.redbus.in/");
	        d.findElement(By.xpath("//*[@id=\"homeV2-root\"]/div[3]/div[2]/div/div[2]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("7089911400");
	        d.findElement(By.xpath("//*[@id=\"homeV2-root\"]/div[3]/div[2]/div/div[2]/div[2]/div[1]/div[1]/button")).click();

	    }	 

	}

