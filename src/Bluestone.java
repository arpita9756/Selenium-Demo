import java.awt.Window;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		Thread.sleep(2000);
		WebElement search= driver.findElement(By.id("search_query_top_elastic_search"));
		search.sendKeys("kadas",Keys.ENTER);
		
		driver.findElement(By.xpath("//div[@class='p-image']/descendant::a[@id='pid_8967']")).click();
		Thread.sleep(2000);
		
		String parentwindow = driver.getWindowHandle();
		Set<String> childwindow = driver.getWindowHandles();
		
		for(String child_window : childwindow)
		{
			driver.switchTo().window(child_window);
		}
		
		driver.findElement(By.xpath("//span[@class='icon-ion-android-arrow-dropdown']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@id='sizeDropdown']/li[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='buy-now']")).click();
		
		
		
		

	}

}
