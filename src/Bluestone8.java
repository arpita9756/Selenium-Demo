import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ClearElement;
import org.openqa.selenium.remote.server.handler.html5.ClearLocalStorage;
import org.openqa.selenium.remote.server.handler.html5.ClearSessionStorage;
import org.openqa.selenium.remote.server.jmx.ManagedAttribute;

public class Bluestone8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='hp-gms-banner']")).click();
		WebElement amount = driver.findElement(By.name("amount"));
		amount.sendKeys("5000");
				
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("malaviyaarpita1165354@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='form-submit text-center auto-filled']/input[@type='submit']")).click();
		Thread.sleep(2000);
		
		WebElement no = driver.findElement(By.id("contactNumber"));
		no.sendKeys("9746355278");
		
		WebElement name = driver.findElement(By.id("fullname"));
		name.sendKeys("Arpita");

		WebElement add = driver.findElement(By.id("address"));
		add.sendKeys("Hadapsar, Pune");
		
		WebElement pin = driver.findElement(By.id("postcode_delivery"));
		pin.sendKeys("467829");
		
		driver.findElement(By.name("_eventId_savePersonalAddressDetails")).click();
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		WebElement nominee = driver.findElement(By.id("nomineeName"));
		nominee.sendKeys("Mitesh");
		
		WebElement relationship = driver.findElement(By.xpath("//select[@id='nomineeRelationship']/option[1]"));
		relationship.click();
		
		WebElement nationality =  driver.findElement(By.xpath("//select[@id='nomineeNationality']/option[1]"));
		nationality.click();
		
		driver.findElement(By.name("_eventId_checkoutSaveAddressDetails")).click();
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		if(title1!=title2)
		{
			System.out.println("Navigating to Payment page");
		}
		else
		{
			System.out.println("Not Navigating");
		}
		
		
		driver.close();
	}

}
