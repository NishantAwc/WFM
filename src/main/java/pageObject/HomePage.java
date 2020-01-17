package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
public WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}

	
	By Forms = By.xpath("//div[@id='navbarSupportedContent']/ul/li[2]");
	
	By EB = By.xpath("//div[@id='navbarSupportedContent']/ul/li[2]/ul/li[2]");
	
	By NewSite = By.xpath("//div[@id='navbarSupportedContent']/ul/li[2]/ul/li[2]/ul/li[1]");
	
	By Upgrade = By.xpath("//div[@id='navbarSupportedContent']/ul/li[2]/ul/li[2]/ul/li[2]");
	
	By NormalSite = By.xpath("//div[@id='navbarSupportedContent']/ul/li[2]/ul/li[2]/ul/li[2]/ul/li/a");
	
	By StretegicSite = By.xpath("//div[@id='navbarSupportedContent']/ul/li[2]/ul/li[2]/ul/li[2]/ul/li[2]/a");
	
	//"//div[@id='navbarSupportedContent']/ul/li[2]/ul/li[2]/ul/li[1]"
	
	By WFText= By.xpath("//a[@class='navbar-brand']");
	
	
	public WebElement GetStretegicSite()
	{
		return driver.findElement(StretegicSite);
	}
	
	
	public WebElement GetNormalSite()
	{
		return driver.findElement(NormalSite);
	}
	
	
	public WebElement GetUpgrade()
	{
		return driver.findElement(Upgrade);
	}
	
	
	public WebElement GetNewSite()
	{
		return driver.findElement(NewSite);
	}
	
	
	
	public WebElement GetEB()
	{
		return driver.findElement(EB);
	}
	
	public WebElement getWFText()
	{
		return driver.findElement(WFText);
	}
	
	
	public WebElement clickOnForms()
	{
		return driver.findElement(Forms);
	}
	
}
