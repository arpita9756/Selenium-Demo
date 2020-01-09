import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		List<WebElement> menus = driver.findElements(By.xpath("//ul[@class='_114Zhd']/li"));
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		
		
		for(WebElement items:menus)
		{
			System.err.println(items.getText());
			String name = items.getText();
			
			a.moveToElement(items).build().perform();
			Thread.sleep(2000);
			
			List<WebElement> submenus = driver.findElements(By.xpath("//span[contains(.,'" +name+ "')]/parent::li/descendant::ul[@class='QPOmNK']/li"));
			for(WebElement subitems : submenus)
			System.out.println(subitems.getText());
			Thread.sleep(2000);
			
		}
		
	}

}
