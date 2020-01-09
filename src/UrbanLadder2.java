import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class UrbanLadder2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		List<WebElement> items = driver.findElements(By.xpath("//ul[@class='topnav bodytext']"));
		Actions a = new Actions(driver);
		Thread.sleep(10000);
		for(WebElement menu : items)
		{
			System.out.println(menu.getText());
			a.moveToElement(menu).build().perform();
			Thread.sleep(10000);
		}
		
		

	}

}
