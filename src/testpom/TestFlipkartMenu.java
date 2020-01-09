package testpom;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import pom.FlipkartHome;
import pom.FlipkartMenu;

public class TestFlipkartMenu {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		FlipkartMenu fh = new FlipkartMenu(driver);
		Thread.sleep(2000);
		
		fh.clickPopup();
		Thread.sleep(3000);
		
		fh.mouseOverElec(driver);
		Thread.sleep(2000);
		
		fh.realMe();
		Thread.sleep(3000);
		
		fh.realMe1();
		Thread.sleep(3000);
		
		
		Set<String> parent = driver.getWindowHandles();
		for (String child : parent) 
		{
			driver.switchTo().window(child);
		}
		
		
		fh.addToCart();
		
		
		
		

	}
}
