import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SearchJaava {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Java", Keys.ENTER);
		
		WebElement java = driver.findElement(By.xpath("//div[@class='kno-ecr-pt PZPZlf gsmt']/span[contains(.,'Java')]"));
		//driver.findElement(By.xpath("//div[@class='kno-ecr-pt PZPZlf gsmt']/span[text()='Java']")); (instead of contains, we can also use text())
		Actions a = new Actions(driver);
		a.doubleClick(java).perform();
		
	}

}
