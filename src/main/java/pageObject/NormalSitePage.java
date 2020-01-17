package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NormalSitePage {

public WebDriver driver;
	
	public NormalSitePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By EblineDistance = By.id("eblinedis");
	
	By EBType = By.xpath("//div[@id='ebID']");
	
	By EBTypeElement = By.xpath("//div[@id='ebID']/select/option");
	
	By Subject = By.id("_SubjectItem");
	
	By CurrentLoad = By.xpath("//input[@id='_appledload'][@ng-model='currentload']");
	
	By AppliedLoad = By.xpath("//input[@id='_appledload'][@ng-model='applidmload']");
	
	By AdditionalLoad = By.id("_additionalload");
	
	By FileAttachementROI = By.id("fileAttachment");
	
	By Remarks = By.id("_remarks");
	
	By Submit = By.id("submit");
	
	
	public WebElement GetSubmit()
	{
		return driver.findElement(Submit);
	}
	
	
	
	public WebElement GetRemarks()
	{
		return driver.findElement(Remarks);
	}
	
	public WebElement GetFileAttachementROI()
	{
		return driver.findElement(FileAttachementROI);
	}
	
	
	public WebElement GetAdditionalLoad()
	{
		return driver.findElement(AdditionalLoad);
	}
	
	public WebElement GetAppliedLoad()
	{
		return driver.findElement(AppliedLoad);
	}
	
	public WebElement GetCurrentLoad()
	{
		return driver.findElement(CurrentLoad);
	}
	
	
	public WebElement GetSubject()
	{
		return driver.findElement(Subject);
	}
	
	public List<WebElement> GetEBTypeElement()
	{
		return driver.findElements(EBTypeElement);
	}
	
	public int GetEBTypeElementSize()
	{
		return driver.findElements(EBTypeElement).size();
	}
	
	
	public WebElement GetEBType()
	{
		return driver.findElement(EBType);
	}
	
	
	public WebElement GetEblineDistance()
	{
		return driver.findElement(EblineDistance);
	}
}
