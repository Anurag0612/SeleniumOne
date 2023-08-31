package NewSelenium.Sel;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ClothStore {
	public static void main(String[] args) {

		        WebDriverManager.chromedriver().setup();
		        WebDriver driver=new ChromeDriver();
		        driver.get("https://j2store.net/free/");
		        driver.manage().window().maximize();
		       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		        WebElement clothing=driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a"));
		        clothing.click();

		        List<WebElement> li=new ArrayList(driver.findElements(By.className("product-title")));
		        List<String> sortedli=new ArrayList();
		        for(WebElement s:li)
		        {
		            //System.out.println(s.getText());
		            sortedli.add(s.getText());
		        }

		        Collections.sort(sortedli);
		        for(String s1:sortedli)
		        {
		            System.out.println(s1);
		        }
		 }
}


