import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Bluestone8Testng 
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
		
		WebElement metal = driver.findElement(By.xpath("//span[text()='Metal']"));
		Actions a = new Actions(driver);
		a.moveToElement(metal).build().perform();
		
		WebElement platinum = driver.findElement(By.xpath("//span[text()=' Platinum ']"));
		platinum.click();
		WebElement totalPlatinum = driver.findElement(By.xpath("//span[@class='total-designs']"));
		Reporter.log(totalPlatinum.getText(),true);
		
		driver.close();
}
}