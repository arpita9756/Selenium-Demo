import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class AmazonTopBottom {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		Thread.sleep(2000);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File ScreenShot = ts.getScreenshotAs(OutputType.FILE);
		File screensave = new File(".\\ScreenShot\\amazon.png");
		Files.copy(ScreenShot, screensave);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		TakesScreenshot ts1 = (TakesScreenshot)driver;
		File ScreenShot1 = ts.getScreenshotAs(OutputType.FILE);
		File screensave1 = new File(".\\ScreenShot\\amazonBottom.png");
		Files.copy(ScreenShot1, screensave1);
		
		driver.findElement(By.xpath("//span[text()='Back to top']")).click();

	}

}
