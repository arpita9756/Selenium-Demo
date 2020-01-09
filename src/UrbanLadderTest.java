import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbanLadderTest {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com");
		Thread.sleep(7000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='featuredLinksBar__linkContainer']/li[2]")).click();
		Thread.sleep(2000);
		List<WebElement> lists = driver.findElements(By.xpath("//h3[@class='_3JJeW']"));
		Thread.sleep(1000);
		for(WebElement list : lists)
		{
			System.out.println(list.getText());
		}
		
	}

}
