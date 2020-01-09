import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBack {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.dev");
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.id("gsc-i-id1"));
		ele.sendKeys("TESTNG",Keys.ENTER);
		Thread.sleep(2000);
		driver.navigate().back();
		ele.sendKeys("Java",Keys.ENTER);

	}

}
