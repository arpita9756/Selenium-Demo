package testpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.SeleniumDev;

public class TestSeleniumDev {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.dev");
		Thread.sleep(5000);
		
		SeleniumDev sd = new SeleniumDev(driver);
		Thread.sleep(5000);
		
		sd.searchBox("testng");
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		sd.searchBox("java");
		
	}

}
