import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestone6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='hp-gms-banner']")).click();
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		WebElement amount = driver.findElement(By.name("amount"));
		amount.sendKeys("5000");
		
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("malaviyaarpita4@gmail.com");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//div[@class='form-submit text-center auto-filled']/input[@type='submit']")).click();
		String title2 = driver.getTitle();
		System.out.println(title2);
		Thread.sleep(2000);
		
		if(title1!=title2)
		{
			System.out.println("Reflected in next page");
		}
		
		
		driver.close();

	}

}
