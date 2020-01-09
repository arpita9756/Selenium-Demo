import java.util.List;

import org.apache.poi.ss.formula.functions.Count;
import org.apache.xmlbeans.impl.xb.xsdschema.LengthDocument;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Bluestone6Testng {
	
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
		Thread.sleep(2000);
	
		
		WebElement price = driver.findElement(By.xpath("//span[text()='Price']"));
		Actions a = new Actions(driver);
		a.moveToElement(price).build().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='prcs-dlh']")).click();
		Thread.sleep(2000);
		
		WebElement totalCount = driver.findElement(By.xpath("//span[@class='total-designs']"));
		Reporter.log(totalCount.getText(),true);
		
	
		driver.close();
		}
		
	}

