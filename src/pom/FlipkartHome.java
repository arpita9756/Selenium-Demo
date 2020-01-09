package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartHome {

	@FindBy(xpath="//input[@name='q']")
	private WebElement search;
	@FindBy(xpath="//button[@class='vh79eN']")
	private WebElement button;
	@FindBy(xpath="//button[@class='_2AkmmA _29YdH8']")
	private WebElement popup;
	
	public FlipkartHome(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void searchTxt(String txt)
	{
	 search.sendKeys(txt);
	}
	
	public void clickB()
	{
		button.click();
	}
	
	public void clickPopup()
	{
		popup.click();
	}

}
