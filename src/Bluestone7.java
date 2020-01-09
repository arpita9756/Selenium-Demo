import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestone7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='hp-gms-banner']")).click();
		WebElement amount = driver.findElement(By.name("amount"));
		amount.sendKeys("10000");
		
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("malaviyaarpita12@gmail.com");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//div[@class='form-submit text-center auto-filled']/input[@type='submit']")).click();
		String title1 = driver.getTitle();
		Thread.sleep(2000);
		
		
		
		driver.findElement(By.name("_eventId_savePersonalAddressDetails")).click();
		String title2 = driver.getTitle();
		
		
		if(title1.equals(title2))
		{
			System.out.println("Fill the required fields");
		}
		
		driver.close();

	}

}
