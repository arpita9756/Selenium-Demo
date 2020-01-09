import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Bluestone7Testng 
{
	@Test
	public void bluestone() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("//input[@name='search_query']"));
		search.sendKeys("Rings",Keys.ENTER);
		Thread.sleep(5000);
	
		WebElement delivery = driver.findElement(By.xpath("//span[text()='Delivery Time']/parent::span[@class='title style-fill i-right']"));
		Actions a = new Actions(driver);
		a.moveToElement(delivery).build().perform();
		Thread.sleep(2000);
		
		WebElement nextDay = driver.findElement(By.xpath("//span[text()=' Next Day Delivery ']"));
		nextDay.click();
		Thread.sleep(2000);
		WebElement totalCount = driver.findElement(By.xpath("//span[@class='total-designs']"));
		Reporter.log(totalCount.getText(),true);
		driver.close();
		
	}
	
}
