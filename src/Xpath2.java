import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement text = driver.findElement(By.xpath("//td[@id='headerContainer']"));
		System.out.println(text.getText());
		driver.findElement(By.xpath("//td[@valign='middle']/input[@type='text']")).sendKeys(text.getText());
		//parent and child tags.
		
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(text.getText());
		
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(2000);
		
		WebElement errmsg = driver.findElement(By.xpath("//div[@id='ServerSideErrorMessage']"));
		System.out.println(errmsg.getText());
		

	}

}
