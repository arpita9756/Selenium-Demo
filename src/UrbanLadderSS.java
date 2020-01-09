import java.io.IOException;
import java.util.List;
import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UrbanLadderSS {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		List<WebElement> items = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		Actions a=new Actions(driver);
		Thread.sleep(10000);
		for(WebElement menus: items)
		{
			System.out.println(menus.getText());
			String name = menus.getText(); //to get the text and name the screenshots as per that
			a.moveToElement(menus).build().perform();
			Thread.sleep(3000);
			ScreenShot.screenshot(driver,name);//To take screenshot method from ScreenShot.java
			}
		}
		
		

	}


