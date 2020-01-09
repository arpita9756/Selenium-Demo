import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderGmail
{
	@DataProvider
	public String[][] getData()
	{
		String data[][] = new String[3][2];
		data[0][0]="malaviyaarpita@gmail.com";
		data[0][1]="A";
		
		data[1][0]="malaviyaarpita@gmail.com";
		data[1][1]="B";
		
		data[2][0]="malaviyaarpita@gmail.com";
		data[2][1]="C";
		return data;
	}
	
	
	@Test(dataProvider="getData")
	public void gmailLogin(String un, String pw) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("identifier")).sendKeys(un);
		
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(2000);
		
		
		  driver.findElement(By.xpath("//input[@type=\'password\']")).sendKeys(pw);
	       driver.findElement(By.id("passwordNext")).click();
		Thread.sleep(2000);
		Reporter.log("Create:" + un + "pwd:" + pw, true);
		
	}
}
