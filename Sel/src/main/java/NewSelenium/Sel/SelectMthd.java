package NewSelenium.Sel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectMthd {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		ChromeOptions co = new ChromeOptions();
		/*
		 * driver.get("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=24");
		 *  driver.manage().window().maximize(); 
		 *  Thread.sleep(3000); 
		 *  Select s = new Select(driver.findElement(By.xpath("//*[@id=\"input-sort\"]")));
		 * List<WebElement> l1 = s.getOptions(); 
		 * for(WebElement element: l1) {
		 * System.out.println(element.getText());
		 *  } 
		 * List<String> l2 = new ArrayList<>();
		 * 
		 * for(int i=0;i<l1.size();i++) { l2.add(l1.get(i).getText()); }
		 * //s.selectByIndex(2);
		 *  //s.selectByValue("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=24&sort=p.price&order=ASC"); 
		 *  s.selectByVisibleText("Rating (Lowest)");
		 * 
		 * Collections.sort(l2); 
		 * System.out.println("---------Sorted----------");
		 * 
		 * for(String sorted: l2) 
		 * System.out.println(sorted);
		 * 
		 * 
		 * driver.close();
		 */

		
		WebElement d = driver.findElement(By.xpath("//select[@name=\"selenium_commands\"]"));
		Select s1 = new Select(d);
		s1.selectByIndex(2);
		Thread.sleep(3000);
		s1.selectByIndex(3);
		
		List<WebElement> l1= new ArrayList<WebElement>();
		l1=s1.getAllSelectedOptions();
		for(WebElement element: l1 ) {
			System.out.println(element.getText());
		}
		
		s1.deselectAll();
	}

}
