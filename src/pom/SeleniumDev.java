package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumDev 
{
	@FindBy(xpath = "//input[@name='search']")
	private WebElement search;
	
	
	public SeleniumDev(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void searchBox(String text)
	{
		search.sendKeys(text,Keys.ENTER);
	}
}
