import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendingData3 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		String title1 = driver.getTitle();
		System.out.println(title1);
		//System.out.println(driver.getCurrentUrl());
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("admin");
		
		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys("manager");
		

		
		WebElement next = driver.findElement(By.id("loginButton"));
		next.click();
		Thread.sleep(2000);
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		
		if(title1!=title2)  // (or) (!title.equals(title2));
		{
			System.out.println("Logged in successfully");
			driver.findElement(By.id("logoutLink")).click();
		}
		String logout = driver.getTitle();
		System.out.println(logout);
		
		if(title1.equals(logout))
		{
			System.out.println("Logged out successfully..");
		}
		
		
		
		

	}

}