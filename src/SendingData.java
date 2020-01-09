import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendingData {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Launching the Browser");
		
		//Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Arpita");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("Mitesh");
		WebElement login = driver.findElement(By.id("loginbutton"));
		login.click();
		
		
	}

}
