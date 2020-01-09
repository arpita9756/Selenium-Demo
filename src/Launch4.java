import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		
		//driver.getPageSource();
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> wins = driver.getWindowHandles();
		System.out.println(wins.getClass());
		ArrayList<String> al1 = new ArrayList<>(wins);
		for(String win : wins)
		{
			al1.add(win);
			driver.switchTo().window(win).close();
			
		}
		

	}

}
