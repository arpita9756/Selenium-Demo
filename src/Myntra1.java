import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com");
		Thread.sleep(2000);
		
		List<WebElement> menus = driver.findElements(By.xpath("//div[@class='desktop-navLinks']/div"));
		Actions a = new Actions(driver);
		
		for(WebElement items: menus)
		{
			System.err.println(items.getText());
			a.moveToElement(items).build().perform();
			String name = items.getText();
			String caps = name.substring(0,1)+name.substring(1).toLowerCase();
			
			Thread.sleep(2000);
			
			List<WebElement> submenus = driver.findElements(By.xpath("//a[contains(.,'"+caps+"')]/parent::div[@class='desktop-navLink']/descendant::ul[@class='desktop-navBlock']/li"));
			for(WebElement subitems : submenus)
			{
				System.out.println(subitems.getText());
				//System.out.println("hi");
				a.moveToElement(subitems).build().perform();
				Thread.sleep(2000);
			}
		}
		
	}

}
