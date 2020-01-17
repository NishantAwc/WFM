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
	
	By UserDepartment = By.xpath("//div[@class='col-md-6 col-12 input100-select']/div/select[@ng-model='SelectedDepartmentID']");
	
	By UserDepartmentElement = By.xpath("//div[@class='col-md-6 col-12 input100-select']/div/select[@ng-model='SelectedDepartmentID']/option");
	
	By BudgetCategory = By.xpath("//div[@class='col-md-6 col-12 input100-select']/div/select[@ng-model='SelectedBudgetcategoryID']");
	
	By BudgetCategoryElement = By.xpath("//div[@class='col-md-6 col-12 input100-select']/div/select[@ng-model='SelectedBudgetcategoryID']/option");
	
	By WorkExecutedBY = By.xpath("//div[@class='col-md-6 col-12 input100-select']/div/select[@ng-model='SelectedWorkExecutedID']");
	
	By WorkExecutedBYElement = By.xpath("//div[@class='col-md-6 col-12 input100-select']/div/select[@ng-model='SelectedWorkExecutedID']/option");
	
	By SiteType = By.xpath("//div[@class='col-md-6 col-12 input100-select ']/div/select[@ng-model='SelectedSitetypeID']");
	
	By SiteTypeElement = By.xpath("//div[@class='col-md-6 col-12 input100-select ']/div/select[@ng-model='SelectedSitetypeID']/option");
	
	
	public WebElement GetSiteType()
	{
		return driver.findElement(SiteType);
		
	}
	
	public List<WebElement> GetSiteTypeElement()
	{
		return driver.findElements(SiteTypeElement);
		
	}
	
	public int GetSiteTypeElementSize()
	{
		return driver.findElements(SiteTypeElement).size();
		
	}

	
	public WebElement GetWorkExecutedBY()
	{
		return driver.findElement(WorkExecutedBY);
		
	}
	
	public List<WebElement> GetWorkExecutedBYElement()
	{
		return driver.findElements(WorkExecutedBYElement);
		
	}
	
	public int GetWorkExecutedBYElementSize()
	{
		return driver.findElements(WorkExecutedBYElement).size();
		
	}
	
	
	public WebElement GetBudgetCategory()
	{
		return driver.findElement(BudgetCategory);
		
	}
	
	public List<WebElement> GetBudgetCategoryElement()
	{
		return driver.findElements(BudgetCategoryElement);
		
	}
	
	public int GetBudgetCategoryElementSize()
	{
		return driver.findElements(BudgetCategoryElement).size();
		
	}
	
	public WebElement GetUserDepartment()
	{
		return driver.findElement(UserDepartment);
		
	}
	
	public int GetUserDepartmentElementSize()
	{
		return driver.findElements(UserDepartmentElement).size();
		
	}
	
	public List<WebElement> GetUserDepartmentElement()
	{
		return driver.findElements(UserDepartmentElement);
		
	}
	
	
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
