import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethodTestng
{
	WebDriver driver;
	
	@BeforeMethod
	public void beforeM()
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void demo()
	{
		driver.findElement(By.name("q")).sendKeys("Java",Keys.ENTER);
		Reporter.log("Hi",true);
	}
	
	@Test
	public void demo1()
	{
		driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
		Reporter.log("Hello",true);
	}
	
	@AfterMethod
	public void afterM()
	{
		driver.close();
	}
	
}
