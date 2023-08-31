package NewSelenium.Sel;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableCommand {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		ChromeOptions co = new ChromeOptions();
		driver.get("https://omayo.blogspot.com/");

		//
		List<WebElement>element =  driver.findElements(By.xpath("//table[@id='table1']//td"));
		for(WebElement xyz: element) {
		System.out.println(xyz.getText());
		}
		
		//Printing 3rd column only
		List<WebElement>elements =  driver.findElements(By.xpath("//table[@id='table1']//tr//td[3]"));
		for(WebElement xyz: elements) {
		System.out.println(xyz.getText());
		}
		//OR
		/*
		 * List<WebElement>rows =
		 * driver.findElements(By.xpath("//table[@id='table1']//tbody//tr")); for(int
		 * i=0;i<rows.size();i++) { WebElement num =
		 * driver.findElement(By.xpath("table[@id='table1']//tr["+(i+1)+"]//td[3]"));
		 * System.out.println(num.getText()); }
		 */
		 
	
	}

}
