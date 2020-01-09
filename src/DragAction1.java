import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAction1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		
		WebElement content = driver.findElement(By.xpath("//div[@id='draggable']"));
		Actions a = new Actions(driver);
		//a.dragAndDropBy(content, 150, 20).perform();
		
		WebElement dropped = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		
		a.dragAndDrop(content, dropped).perform();
		System.out.println(dropped.getText());

	}

}
