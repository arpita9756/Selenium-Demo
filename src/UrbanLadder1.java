import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UrbanLadder1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		List<WebElement> items = driver.findElements(By.xpath("//ul[@class='_114Zhd']/li"));
		Actions a = new Actions(driver);
		
		for(WebElement menus: items)
		{
			System.out.println(menus.getText());
			a.moveToElement(menus).build().perform();
			Thread.sleep(2000);
		}
		
		
		

	}

}
