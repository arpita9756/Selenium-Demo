package testpom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.FlipkartHome;

public class TestFlipkartHome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		FlipkartHome fh = new FlipkartHome(driver);
		Thread.sleep(2000);
		
		fh.clickPopup();
		Thread.sleep(3000);
		fh.searchTxt("Iphone");
		Thread.sleep(2000);
		fh.clickB();
		Thread.sleep(3000);

		driver.navigate().back();
		Thread.sleep(2000);

		fh.searchTxt("Nike");
		fh.clickB();

	}

}
