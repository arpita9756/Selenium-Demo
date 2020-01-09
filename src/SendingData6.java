import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendingData6 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("admin");
		
		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys("manager");
		WebElement next = driver.findElement(By.id("loginButton"));
		next.click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("container_tasks")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
	}

}
