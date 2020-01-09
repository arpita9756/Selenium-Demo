import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.omg.PortableServer.THREAD_POLICY_ID;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rbotdemo1 {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		WebElement java = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		java.sendKeys("java",Keys.ENTER);
		Thread.sleep(2000);
		
		WebElement java1 = driver.findElement(By.xpath("//div[@class='kno-ecr-pt PZPZlf gsmt']/span[contains(.,'Java')]"));
		Actions a = new Actions(driver);
		a.doubleClick(java1).perform();
		String s1 = driver.getTitle();
		System.out.println(s1);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String s2 = driver.getTitle();
		System.out.println(s2);
		if(s1.equals(s2))
		{
			System.out.println("Matched successfully");
		}
		else
		{
			System.out.println("Not matched successfully");
		}
		
		
		
		
	}

}
