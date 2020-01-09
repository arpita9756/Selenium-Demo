

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GmailDataProvider 
{
	public class DataProviderDemo
	{
	@DataProvider
	public String[][] getData()
	{
		String[][] data=new String[3][2];
		data[0][0]="pranalishinde1111";
		data[0][1]="pranali";
		
		data[1][0]="pranalishinde111";
		data[1][1]="pranali";
		
		data[2][0]="prasadzurange21";
		data[2][1]="C1111";
		return data;
		
	}
	@Test(dataProvider="getData")
	public void createUser(String un,String pw) throws InterruptedException
	{
		Reporter.log("create:"+un+"pwd:"+pw,true);
		
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
		     System.out.println("Launching browser");
	       Thread.sleep(2000);
	       driver.get("https://accounts.google.com/");
	    
	       driver.manage().window().maximize();	
	       Thread.sleep(2000);
	       driver.findElement(By.name("identifier")).sendKeys(un);
	      
	       //Thread.sleep(2000);
	       driver.findElement(By.id("identifierNext")).click();
	       Thread.sleep(3000);
	     driver.findElement(By.xpath("//input[@type=\'password\']")).sendKeys(pw);
	       driver.findElement(By.id("passwordNext")).click();
	       driver.close();
	       
	       
		
		
}
}
}