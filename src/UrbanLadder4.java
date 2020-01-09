import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UrbanLadder4 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		
		List<WebElement> items = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		
		for(WebElement menus: items){
			System.err.println(menus.getText());
			String name = menus.getText();
			a.moveToElement(menus).build().perform();
			Thread.sleep(2000);
			
			List<WebElement> submenu=driver.findElements(By.xpath("//span[contains(.,'"+ name + "')]/parent::li/descendant::ul[@class='taxonslist']/li"));
			for(WebElement subitem: submenu)
			{
				System.out.println(subitem.getText());
				
			}
			
		}
		

	}

}
