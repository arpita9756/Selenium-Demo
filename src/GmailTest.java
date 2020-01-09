import java.awt.Button;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTest {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://iqgenie.org");
		Thread.sleep(2000);
		driver.findElement(By.id("userIcon")).click();
		Thread.sleep(5000);
		WebElement button = driver.findElement(By.xpath("//a[contains(.,'Sign up with Google')]"));
		button.click();
		Thread.sleep(3000);
		
		
		Set<String> childwindow = driver.getWindowHandles();
		
		for(String child_window : childwindow)
		{
			driver.switchTo().window(child_window);
			
		}
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
