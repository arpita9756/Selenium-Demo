import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Launching the Browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
	    WebElement email=driver.findElement(By.xpath("//label[@for='email']"));
	    System.out.println(email.getText()); //getText() is used to get the inner text in console		
	    driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email.getText());
	    
	    WebElement pass = driver.findElement(By.xpath("//label[@for='pass']"));
	    System.out.println(pass.getText());
	    driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys(pass.getText());
	}

}
