import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///H:/Arpita/multi.html");
		Thread.sleep(2000);

		WebElement opt = driver.findElement(By.xpath("//select[@id='b']"));
		
		Select s = new Select(opt);
		List<WebElement> values= s.getOptions();
		if(s.isMultiple())
		for (WebElement data : values) 
		{
			System.out.println(data.getText());
			s.selectByValue(data.getText());
		}
		
		
		System.out.println(s.getFirstSelectedOption().getText());
		List<WebElement> selectedoption = s.getAllSelectedOptions();
		for (WebElement selectoptions : selectedoption) {
			System.out.println(selectoptions.getText()); //for selecting
			s.deselectByValue(selectoptions.getText()); //for deselecting
			s.deselectAll(); //for deselecting all
			//s.deselectByIndex(2);  // for deselcting by index
			
		}
		WebElement list = driver.findElement(By.xpath("//select[@id='a']"));
		list.click();
		Select s1 = new Select(list);
		List<WebElement> value= s1.getOptions();
		if(s.isMultiple() )
		for (WebElement datas : value) {
			System.out.println(datas.getText());
			
		}
		
	}

}
