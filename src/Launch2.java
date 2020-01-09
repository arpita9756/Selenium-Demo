import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch2 {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Launching browser");
		Thread.sleep(2000);
		driver.get("https://www.naukri.com/");
		String parent = driver.getWindowHandle();
		System.out.println(parent); //id of parent window(focus)
		Set<String> wins = driver.getWindowHandles();
		System.out.println(wins.getClass());
		ArrayList<String> al1 = new ArrayList<>(wins);
		for(int i = al1.size()-1; i>=0; i--)
		{
			driver.switchTo().window(al1.get(i)).close();
		}

	}

}
