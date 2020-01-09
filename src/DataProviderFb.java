import javax.xml.crypto.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderFb 
{
	@DataProvider
	public String[][] getData()
	{
		String data[][] = new String[3][2];
		data[0][0]="user A";
		data[0][1]="A";
		
		data[1][0]="user B";
		data[1][1]="B";
		
		data[2][0]="user C";
		data[2][1]="C";
		return data;
	}
	
	@Test(dataProvider = "getData")
	public void fbLogin(String un, String pw) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(un);
		
		//Reporter.log("Create:" + un + "pwd:" + pw, true);
		Thread.sleep(2000);
		
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys(pw);
		//Reporter.log("Create:" + un + "pwd:" + pw, true);
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.id("loginbutton"));
		System.out.println(login.getText());
		login.click();
		Reporter.log("Create:" + un + "pwd:" + pw, true);
	}
}
