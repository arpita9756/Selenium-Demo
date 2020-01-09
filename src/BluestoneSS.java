import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneSS {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		Thread.sleep(2000);
		
		WebElement ring = driver.findElement(By.xpath("//ul[@class='wh-main-menu']/li[2]"));
		Thread.sleep(2000);
		String name = ring.getText();
		ScreenShot.screenshot(driver,name);
		Actions a = new Actions(driver);
		a.moveToElement(ring).build().perform();
		
		
		WebElement diamondRing = driver.findElement(By.xpath("//a[contains(.,'Diamond Rings')]"));
		diamondRing.click();
		String name1 = diamondRing.getText();
		ScreenShot.screenshot(driver,name1);
		
		WebElement price = driver.findElement(By.xpath("//span[contains(.,'Price')]/parent::section[@class='block']"));
		String name2 = price.getText();
		ScreenShot.screenshot(driver,name2);
		a.moveToElement(price).build().perform();
		System.out.println(price.getText());
		
	}

}
