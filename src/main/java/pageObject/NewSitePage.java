package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewSitePage {
	
public WebDriver driver;
	
	public NewSitePage(WebDriver driver)
	{
		this.driver=driver;
	}	
	
By IntiatorDesignation = By.xpath("//div[@class='col-md-6 col-12']/div/select[@ng-model='SelectedDesignationID']");
	
	By IntiatorDesignationNumberOfElements = By.xpath("//div[@class='col-md-6 col-12']/div/select[@ng-model='SelectedDesignationID']/option");
	
	By UserDepartment = By.xpath("//div[@class='col-md-6 col-12']/div/select[@ng-model='SelectedDepartmentID']");
	
	By BudgetCategory = By.xpath("//div[@class='col-md-6 col-12']/div/select[@ng-model='SelectedBudgetcategoryID']");
	
	By WorkExecutedBY = By.xpath("//div[@class='col-md-6 col-12']/div/select[@ng-model='SelectedWorkExecutedID']");
	
	By EBLineDistance = By.id("linedistance");
	
	By IndusID = By.id("_indusid");
	
	By EBLineType = By.xpath("//div[@class='col-md-6 col-12']/div/select[@ng-model='SelectedEBLineTypeID']");
	
	By SiteName = By.id("_sitename");
	
	By ConnectionType = By.xpath("//input[@value='Temporary']");
	
	By SiteType = By.xpath("//div[@class='col-md-6 col-12']/div/select[@ng-model='SelectedSitetypeID']");
	
	By TransormerRating = By.id("transrating");
	
	By AppliedLoad = By.id("_appledload");
	
	By Subject = By.id("_subitem");
	
	By Praposal = By.id("_Proposal");
	
	By Background = By.id("_background");
	
	By Justification = By.id("_justification");
	
	By FinalImplication = By.id("_financialimpl");
	
	By TotalAmount = By.id("_ttlamounti");
	
	By AdditionalAmount = By.xpath("//div[@class='col-md-6 col-12  validate-input']/input[@ng-model='AdditionalAmount']");
	
	By DieselCost = By.id("_disesl");
	
	By FileAttachmentROI = By.id("fileAttachmentROI");
	
	By BudgetHead = By.id("_budgetid");
	
	By PreferredSupplier = By.id("_prefesuplier");
	
	By ReasonForOverspending = By.id("_resonfover");
	
	By Remarks = By.xpath("//textarea[@ng-model='resonforover']");
	
	By Recommendation = By.id("_recodation");
	
	By AttachDocument = By.id("fileAttachmentIT");
	
	By UserComment = By.id("LargeText");
	
	By Submit = By.id("submit");
	
	By OtherText = By.id("othersInp");
	
	
	public WebElement GetOtherText()
	{
		return driver.findElement(OtherText);
	}
	
	public WebElement GetSubmit()
	{
		return driver.findElement(Submit);
	}
	
	
	public WebElement GetUserComment()
	{
		return driver.findElement(UserComment);
	}
	
	public WebElement GetAttachDocument()
	{
		return driver.findElement(AttachDocument);
	}
	
	public WebElement GetRecommendation()
	{
		return driver.findElement(Recommendation);
	}
	
	
	public WebElement GetRemarks()
	{
		return driver.findElement(Remarks);
	}
	
	
	public WebElement GetReasonForOverspending()
	{
		return driver.findElement(ReasonForOverspending);
	}
	
	public WebElement GetPreferredSupplier()
	{
		return driver.findElement(PreferredSupplier);
	}
	
	public WebElement GetBudgetHead()
	{
		return driver.findElement(BudgetHead);
	}
	
	
	public WebElement GetFileAttachmentROI()
	{
		return driver.findElement(FileAttachmentROI);
	}
	
	public WebElement GetDieselCost()
	{
		return driver.findElement(DieselCost);
	}
	
	
	public WebElement GetAdditionalAmount()
	{
		return driver.findElement(AdditionalAmount);
	}
	
	public WebElement GetTotalAmount()
	{
		return driver.findElement(TotalAmount);
	}
	
	public WebElement GetFinalImplication()
	{
		return driver.findElement(FinalImplication);
	}
	
	public WebElement GetJustification()
	{
		return driver.findElement(Justification);
	}
	
	
	public WebElement GetBackground()
	{
		return driver.findElement(Background);
	}
	
	
	public WebElement GetPraposal()
	{
		return driver.findElement(Praposal);
	}
	
	
	public WebElement GetSubject()
	{
		return driver.findElement(Subject);
	}
	
	
	public WebElement GetAppliedLoad()
	{
		return driver.findElement(AppliedLoad);
	}
	
	public WebElement GetTransormerRating()
	{
		return driver.findElement(TransormerRating);
	}
	
	public WebElement GetSiteType()
	{
		return driver.findElement(SiteType);
	}
	
	public WebElement GetConnectionType()
	{
		return driver.findElement(ConnectionType);
	}
	
	public WebElement GetSiteName()
	{
		return driver.findElement(SiteName);
	}
	
	public WebElement GetEBLineType()
	{
		return driver.findElement(EBLineType);
	}
	
	
	public WebElement GetIndusID()
	{
		return driver.findElement(IndusID);
	}
	
	
	public WebElement GetEBLineDistance()
	{
		return driver.findElement(EBLineDistance);
	}
	
	public WebElement GetWorkExecutedBY()
	{
		return driver.findElement(WorkExecutedBY);
	}
	
	
	public WebElement GetBudgetCategory()
	{
		return driver.findElement(BudgetCategory);
	}
	
	
	
	public WebElement GetUserDepartment()
	{
		return driver.findElement(UserDepartment);
	}
	
	
	public List<WebElement> GetIntiatorDesignationNumberOfElements()
	{
		return driver.findElements(IntiatorDesignationNumberOfElements);
	}
	

	public WebElement GetIntiatorDesignation()
	{
		return driver.findElement(IntiatorDesignation);
	}

}
