import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Bluestone1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		Thread.sleep(2000);
		
		WebElement jewellery = driver.findElement(By.xpath("//a[contains(.,'All Jewellery')]"));
		Actions a = new Actions(driver);
		a.moveToElement(jewellery).build().perform();
		System.out.println(jewellery.getText());
		
		/*
		 WebElement kadas = driver.findElement(By.xpath("//a[@href='https://www.bluestone.com/jewellery/bangles-men.html']"));
		System.out.println(kadas.getText());
		a.moveToElement(kadas).build().perform();
		kadas.click();
		*/
		
		WebElement ring = driver.findElement(By.xpath("//li[@class='menuparent repb']/a[@href='https://www.bluestone.com/jewellery/rings.html']"));
		ring.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/a[@id='pid_41483']")).click();
		
		String parentwindow = driver.getWindowHandle();
		Set<String> childwindow = driver.getWindowHandles();
		
		for(String child_window : childwindow)
		{
			driver.switchTo().window(child_window);
		}
		
		driver.findElement(By.id("buy-now")).click();
		WebElement err	= driver.findElement(By.xpath("//div[@class='formErrorContent']"));
		System.out.println(err.getText());
		
		
		driver.findElement(By.xpath("//div[@class='select-size']")).click();
		driver.findElement(By.xpath("//ul[@id='sizeDropdown']/li[2]")).click();
		driver.findElement(By.id("buy-now")).click();
		
		
		
		
		

	}

}
