import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleHindi {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");

		WebElement hindi = driver.findElement(By.xpath("//a[contains(.,'हिन्दी')]"));
		String hindi1 = hindi.getText();
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys(hindi1);
		
		List<WebElement> fetch = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		for (WebElement lists : fetch) 
		{
			System.out.println(lists.getText());
			
		}
	}

}
