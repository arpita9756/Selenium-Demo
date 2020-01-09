

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbanLadder {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		//single elements
		WebElement sale = driver.findElement(By.xpath("//span[contains(., 'Sale')]"));
		System.out.println(sale.getText());
		
		WebElement decor = driver.findElement(By.xpath("//li/span[contains(.,'Decor')]"));
		System.out.println(decor.getText());
		
		WebElement living = driver.findElement(By.xpath("//li/span[contains(.,'Living')]"));
		System.out.println(living.getText());
		
		//multiple elements
		List<WebElement> items = driver.findElements(By.xpath("//ul[@class='topnav bodytext']"));
		for(WebElement menu : items)
		{
			System.out.println(menu.getText());
		}
		
	/*List<WebElement> listeofsale = driver.findElements(By.xpath("//span[contains(.,'Sale')/parent::li/descendant::ul[@class='taxonslist']/li"));
	for(WebElement menu1 : listeofsale)
	{
		System.out.println(menu1.getText());
	}
	*/
		
		//patent-descendant
				//(//input[@type="text"]/parent::td/parent::tr/parent::tbody/descendant::input[@type="password"]
	}

}
