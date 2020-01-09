import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Java");
	Thread.sleep(2000);
	
	WebElement list = driver.findElement(By.xpath("//ul[@class='erkvQe']"));
	System.out.println(list.getText());
	
	System.out.println("3rd element is:");
	WebElement name = driver.findElement(By.xpath("//ul[@class='erkvQe']/li[3]"));
	System.out.println(name.getText());
	name.click();
	//driver.close();
	
	}
}
