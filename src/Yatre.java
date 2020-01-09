import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Yatre 
{
	private static final String Date = null;

	@Test
	public void bluestone() throws InterruptedException, IOException
	{
	System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.yatra.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//label[@for='BE_flight_origin_city']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div/li[@class='active ac_over']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//label[@for='BE_flight_arrival_city']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div/li[@class='active ac_over']")).click();
	Thread.sleep(6000);
	
	driver.findElement(By.xpath("//label[@for='BE_flight_origin_date']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("10/01/2020")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//label[@for='BE_flight_arrival_date']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("25/01/2020")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//span[text()='Traveller']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@data-flightagegroup='adult']/descendant::span[@class='ddSpinnerPlus']")).click();
	driver.findElement(By.xpath("//div[@data-flightagegroup='child']/descendant::span[@class='ddSpinnerPlus']")).click();
	driver.findElement(By.xpath("//div[@data-flightagegroup='infant']/descendant::span[@class='ddSpinnerPlus']")).click();
	
	driver.findElement(By.xpath("//span[text()='Premium Economy']")).click();
	driver.findElement(By.id("BE_flight_flsearch_btn")).click();
	TakesScreenshot ss = (TakesScreenshot)driver;
	File screenshot = ss.getScreenshotAs(OutputType.FILE);
	File screensave= new File(".\\ScreenShot\\yatra.png");
	Files.copy(screenshot, screensave);
	
	driver.close();
	
	}
}
