import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Launching browser");
		Thread.sleep(2000);
		driver.get("https://www.naukri.com/");
		//String url = driver.getCurrentUrl();
		//System.out.println(url);
		//System.out.println(driver.getTitle());
		//driver.quit(); //it will close all the child browsers as well as parent browsers. Close() will not do dis.
		String parent = driver.getWindowHandle();
		System.out.println(parent); //id of parent window(focus)
		Set<String> wins = driver.getWindowHandles(); //id of child browsers
		wins.remove(parent); //removes parent window and focus will be on child browsers
		for(String win : wins)
		{
			System.out.println(win);
			driver.switchTo().window(win); //win (parent)
			driver.close();
		}
		

	}

}
