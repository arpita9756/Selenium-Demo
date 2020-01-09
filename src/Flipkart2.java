import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("iphone");
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='col-12-12 _1PBbw8']/li"));
		for (WebElement lists : list) 
		{
			System.out.println(lists.getText());
		}
		
		
	}

}
