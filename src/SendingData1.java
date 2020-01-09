import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendingData1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(6000);
		WebElement search = driver.findElement(By.name("q"));
		Thread.sleep(3000);
		search.sendKeys("Java",Keys.ENTER); //for clicking enter. Enter is a final static variable and has some value.
		
		
		

	}

}
