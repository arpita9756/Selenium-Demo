import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumdev {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.dev");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)"); //for going down
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-1000)"); //for going to top
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); //for scrolling till the end of the web page.
		Thread.sleep(2000);
		//js.executeScript("window.scrollTo(0,document.body.scrollTop)"); //for scrolling to top
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		Thread.sleep(2000);

	}

}
