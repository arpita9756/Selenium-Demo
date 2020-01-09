import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestone4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='hp-gms-banner']")).click();
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		driver.findElement(By.xpath("//div[@class='form-submit text-center auto-filled']/input[@type='submit']")).click();
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		if(title1.equals(title2))
		{
			System.out.println("Fill the required details");
		}
		
		//WebElement amount = driver.findElement(By.id("amount_error"));
		//System.out.println(amount.getText());
		//WebElement email = driver.findElement(By.id("Email_error"));
		//System.out.println(email.getText());
		driver.close();
	}

}
