package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StrategicSitePage {

	
public WebDriver driver;
	
	public StrategicSitePage(WebDriver driver)
	{
		this.driver=driver;
	
	}	
	
	By InitiatorDesignation = By.xpath("//div[@class='col-md-6 col-12 input100-select ']/div/select[@ng-model='SelectedDesignationID']");
	
	By InitiatorDesignationElement = By.xpath("//div[@class='col-md-6 col-12 input100-select ']/div/select[@ng-model='SelectedDesignationID']/option");
	
	public WebElement GetInitiatorDesignation()
	{
		return driver.findElement(InitiatorDesignation);
		
	}
	
	public int GetInitiatorDesignationInitiatorDesignationElementSize()
	{
		return driver.findElements(InitiatorDesignationElement).size();
		
	}
	
	public List<WebElement> GetInitiatorDesignationInitiatorDesignationElement()
	{
		return driver.findElements(InitiatorDesignationElement);
		
	}
}
