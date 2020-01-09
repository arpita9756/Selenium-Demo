import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLoginXl
{

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		//Thread.sleep(2000);
		
		FileInputStream fis = new FileInputStream(".//Data//Selenium.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Row firstRow = sh.getRow(0);
		int rowCount = sh.getPhysicalNumberOfRows();
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(sh.getRow(3).getCell(0).toString());
		Thread.sleep(2000);
		
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys(sh.getRow(3).getCell(1).toString());
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.id("loginbutton"));
		System.out.println(login.getText());
		login.click();
		
		
	}

}
