import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//select[@name='birthday_day']/option[21]")).click();
		//driver.findElement(By.xpath("//select[@name='birthday_month']/option[12]")).click();
		
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s = new Select(day);
			List<WebElement> list = s.getOptions();
		if(s.isMultiple())
			for (WebElement lists : list) {
				System.out.println(lists.getText());
				s.selectByValue(lists.getText());
			}
		else
		{
			for (WebElement lists : list) {
				System.out.println(lists.getText());
		}
		 s.selectByValue("20");
		
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s1 = new Select(month);
		s1.selectByValue("11");
		
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select s2 = new Select(year);
		s2.selectByValue("1991");
		
	}
}
}
