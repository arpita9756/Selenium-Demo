import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		Thread.sleep(2000);
		
		WebElement ring = driver.findElement(By.xpath("//ul[@class='wh-main-menu']/li[2]"));
		Actions a = new Actions(driver);
		a.moveToElement(ring).build().perform();
		
		driver.findElement(By.xpath("//a[contains(.,'Diamond Rings')]")).click();
		WebElement price = driver.findElement(By.xpath("//span[contains(.,'Price')]/parent::section[@class='block']"));
		a.moveToElement(price).build().perform();
		System.out.println(price.getText());
		

	}

}
