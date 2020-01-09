import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleTest {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Thanose",Keys.ENTER);
		WebElement searchresults = driver.findElement(By.xpath("//div[@id='resultStats']"));
		Thread.sleep(2000);
		System.out.println(searchresults.getText());
		
		WebElement target = driver.findElement(By.xpath("//div[@class='Ftghae iirjIb']/div[3]"));
		Actions  a= new Actions(driver);
		a.click(target);
		Thread.sleep(2000);
		
		WebElement searchresults1 = driver.findElement(By.xpath("//canvas[@class='c3yYr']/parent::div[@jscontroller='zfndQe']"));
		Thread.sleep(2000);
		System.out.println(searchresults1.getText());
		
	}

}
