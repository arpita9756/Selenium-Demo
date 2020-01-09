
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetElementAttribute;

public class Value {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);

		WebElement email = driver.findElement(By.id("email"));

		// getAttribute is used to get the attribute name and attribute value in
		// console
		String val = email.getAttribute("data-testid");
		System.out.println(val);

		// getting title of a webpage without getTitle method
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		WebElement title1 = driver.findElement(By.tagName("title"));
		System.out.println(title1.getAttribute("textContent")); //textContent is used to get the inner text
	}

}
