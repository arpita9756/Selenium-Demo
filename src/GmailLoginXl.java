import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class GmailLoginXl {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		
		FileInputStream fis = new FileInputStream(".//Data//Selenium.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Row firstRow = sh.getRow(0);
		int rowCount = sh.getPhysicalNumberOfRows();
		
		WebElement name = driver.findElement(By.name("identifier"));
		name.sendKeys(sh.getRow(1).getCell(0).toString());
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys(sh.getRow(1).getCell(1).toString());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	}

}
