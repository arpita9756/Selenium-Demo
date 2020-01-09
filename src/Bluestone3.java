import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone3 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		Thread.sleep(2000);
		
		WebElement search= driver.findElement(By.id("search_query_top_elastic_search"));
		search.sendKeys("ring",Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> rings = driver.findElements(By.xpath("//ul[@class='product-grid search-box-result']"));
		for (WebElement listRings : rings) {
			System.out.println(listRings.getText());
			System.out.println(listRings.getSize());
		}
		
	}

}
