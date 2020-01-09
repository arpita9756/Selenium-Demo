import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunch
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //to launch the browser
		Thread.sleep(2000);
		//driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.google.com/"); //instead of get, u can use navigate to launch the browser
		driver.manage().window().maximize();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		System.out.println("Loading URL");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		System.out.println(driver.getTitle());
		driver.quit(); //driver.close(); is also used to close the browser
		System.out.println("Closing browser");
		//ChromeDriver driver = new ChromeDriver();
		//driver.get("http://seleniumhq.org/");
		//driver.get("https://www.google.com/");
		
		//driver.get("https://www.amazon.com/");
		
	
	}
	
}
