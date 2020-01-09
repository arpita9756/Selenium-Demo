package pom;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartMenu {

	@FindBy(xpath="//button[@class='_2AkmmA _29YdH8']")
	private WebElement popup;
	@FindBy(xpath="//span[text()='Electronics']")
	private WebElement electronics;
	@FindBy(xpath="//a[@title='Realme']")
	private WebElement realme;
	@FindBy(xpath="//div[text()='Realme 5s (Crystal Blue, 128 GB)']")
	private WebElement realmeFirst;
	@FindBy(xpath="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	private WebElement addCart;
	
	public FlipkartMenu(WebDriver driver)
	{
		PageFactory.initElements(driver, this); //this is used to access the current class' object.
	}
	
		
	public void clickPopup()
	{
		popup.click();
	}
	
	public void mouseOverElec(WebDriver driver)
	{
		Actions a = new Actions(driver);
		a.moveToElement(electronics).build().perform();
	}
	
	public void realMe()
	{
		realme.click();
	}
	
	public void realMe1()
	{
		realmeFirst.click();
	}
	
	public void addToCart()
	{
		addCart.click();
	}

}
