import java.util.concurrent.TimeUnit;

import org.omg.PortableServer.THREAD_POLICY_ID;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("admin");
		
		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys("manager");
		WebElement next = driver.findElement(By.id("loginButton"));
		next.click();
		
		
		driver.findElement(By.xpath("//div[@class='menuTable']/descendant::div[@class='menu_icon'][3]")).click();
		
		driver.findElement(By.xpath("//ul[@class='popup_menu_items']/descendant::li[contains(.,'About your actiTIME')]")).click();
		
		WebElement fetch = driver.findElement(By.xpath("//span[contains(.,'© 2019 actiTIME Inc. All rights reserved.')]"));
		System.out.println(fetch.getText());
		
	}

}
