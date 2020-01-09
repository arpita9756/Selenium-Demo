import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendingData2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.get("https://www.gmail.com");
		//Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys("malaviyaarpita@gmail.com");
		WebElement next1 = driver.findElement(By.id("identifierNext"));
		next1.click();
		
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("password", Keys.ENTER);
	}

}
