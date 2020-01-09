import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Jqueryui 
{
	@Test
	public void bluestone() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/slider/");
	Thread.sleep(2000);
	
	WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	driver.switchTo().frame(frame);
	
	WebElement slider = driver.findElement(By.id("slider"));
	Actions a = new Actions(driver);
	for(int i=1; i<10; i++)
	{
	a.dragAndDropBy(slider, 150, 0).perform();
	a.dragAndDropBy(slider, -150, 0).perform();
	}
	driver.close();
	}
}
