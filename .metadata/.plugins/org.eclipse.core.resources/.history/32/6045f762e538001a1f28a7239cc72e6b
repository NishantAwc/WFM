package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import cucumber.runtime.table.DiffableRow;
import pageObject.HomePage;
import pageObject.NewSitePage;
import pageObject.NormalSitePage;
import pageObject.SignInPage;
import pageObject.StrategicSitePage;
import resources.Base;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

@RunWith(Cucumber.class)
public class stepDefination extends Base{

	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	
	 @Given("^: Intialize the browser$")
    public void _intialize_the_browser() throws Throwable {
		driver = initializeDriver();
		log.info("Driver is Initialized");
    }

    @When("^: Navigate to \"([^\"]*)\" Url$")
    public void _navigate_to_something_url(String strArg1) throws Throwable {
    	driver.get(strArg1);
		log.info("Navigated to URL successfully");
		driver.manage().window().maximize();
		log.info("Browser is maximized");
		Base b1 = new Base();
		b1.waitForPageLoaded();
    }
    
    @And("^: Enter username and password with follwing details$")
    public void _enter_email_and_password_with_follwing_values(DataTable data) throws Throwable {
    	List<List<String>>obj1 = data.raw();
    	Base b = new Base();
		SignInPage sP = new SignInPage(driver);
		// wait.until(ExpectedConditions.elementToBeClickable(sP.UserName()));
		assertTrue(sP.SignInText().isDisplayed(), "SignInText is not Visible");
		log.debug("SignIn Text is Visible");
		sP.UserName().sendKeys(obj1.get(0).get(0));
		log.debug("Email is entered");
		sP.clickONNext().click();
		log.debug("Next Button is clicked");
		assertTrue(sP.EnterPwdText().isDisplayed(), "Enter Password text is not visible");
		log.debug("Enter Password Text is visible");
		sP.Password().sendKeys(obj1.get(0).get(1));
		b.waitForPageLoaded();
		log.debug("Password is entered");
		
    }
    
    @And("^: Click on SignIn Button$")
    public void _click_on_signin_button() throws Throwable {
    	Base b = new Base();
    	SignInPage sP = new SignInPage(driver);
    	b.waitForPageLoaded();
    	sP.Submit().click();
		log.debug("Submit Button is clicked");
		b.waitForPageLoaded();
		// Thread.sleep(2000);
		sP.NoSignInWindow().click();
		log.debug("Stay sign In button clicked");
    }
    

    @Then("^: Verify Home Page is open and SignIn is successful$")
    public void _verify_home_page_is_open_and_signin_is_successful() throws Throwable {
    	HomePage hP = new HomePage(driver);
    	Base b= new Base();
		// wait.until(ExpectedConditions.urlToBe("https://industowers.sharepoint.com/sites/idocumentum/wfmdev/SitePages/App.aspx#/"));
		assertEquals(hP.driver.getTitle(), p.getProperty("title"));
		log.debug("Title verified and sign is successful");
		b.waitForPageLoaded();
		Thread.sleep(2000);
    }


    @Given("^: Signin is successful$")
    public void signin_is_successful() throws Throwable {
    	log.info("Sign is successful");
    }
    
    @When("^: Click on New Site link on the Home Page$")
    public void _click_on_new_site_link_on_the_home_page() throws Throwable {
    	HomePage hP = new HomePage(driver);
		// wait.until(ExpectedConditions.visibilityOf(hP.getWFText()));
    	Base b= new Base();
    	b.waitForPageLoaded();
		hP.clickOnForms().click();
		hP.GetEB().click();
		hP.GetNewSite().click();
    	
    }

    @Then("^: Verify New Site form is open$")
    public void _verify_new_site_form_is_open() throws Throwable {
        
    	log.info("New Site form is Open");	

    }
    
    @When("^: Click on NormalSite link on the Home Page$")
    public void _click_on_normalsite_link_on_the_home_page() throws Throwable {
    	HomePage hP = new HomePage(driver);
    	Base b= new Base();
    	b.waitForPageLoaded();
		hP.clickOnForms().click();
		hP.GetEB().click();
		//b.waitForPageLoaded();
		hP.GetUpgrade().click();
		//b.waitForPageLoaded();
		hP.GetNormalSite().click();
    }

    @Then("^: Verify NormalSite form is open$")
    public void _verify_normalsite_form_is_open() throws Throwable {
       log.info("Normal Site Page is open");
    }
    
    @When("^: Click on StrategicSite link on the Home Page$")
    public void _click_on_strategicsite_link_on_the_home_page() throws Throwable {
    	HomePage hP = new HomePage(driver);
    	Base b= new Base();
    	b.waitForPageLoaded();
		hP.clickOnForms().click();
		hP.GetEB().click();
		//b.waitForPageLoaded();
		hP.GetUpgrade().click();
		hP.GetStretegicSite().click();
    }

    @Then("^: Verify StrategicSite form is open$")
    public void _verify_strategicsite_form_is_open() throws Throwable {
    	log.info("StrategicSite Page is open");
    }
    
    @Given("^: New Site form is open$")
    public void _new_site_form_is_open() throws Throwable {
    	
    	log.info("New Site form is Open");
    }
    
    @Given("^: StrategicSite form is open$")
    public void _strategicsite_form_is_open() throws Throwable {
    	log.info("StrategicSite form is Open");
    }
    
    @When("^: Enter values for StrategicSite form with following details$")
    public void _enter_values_for_strategicsite_form_with_following_details(DataTable data) throws Throwable {
    	List<List<String>> objst = data.raw();
    	
    	StrategicSitePage stP = new StrategicSitePage(driver);
    	Base b = new Base();
		b.waitForPageLoaded();
		NewSitePage nS = new NewSitePage(driver);
		stP.GetInitiatorDesignation().click();
		int size = stP.GetInitiatorDesignationInitiatorDesignationElementSize();
		int randomNumber = ThreadLocalRandom.current().nextInt(1, size);
		stP.GetInitiatorDesignationInitiatorDesignationElement().get(randomNumber).click();
		log.debug("Initiator Designation is selected");

		b.waitForPageLoaded();
		nS.GetUserDepartment().click();
		List<WebElement> userDepartment = driver.findElements(
				By.xpath("//div[@class='col-md-6 col-12']/div/select[@ng-model='SelectedDepartmentID']/option"));
		int sizeUD = userDepartment.size();
		int randomNumberUD = ThreadLocalRandom.current().nextInt(1, sizeUD);
		userDepartment.get(randomNumberUD).click();
		log.debug("User Department is selected");

		b.waitForPageLoaded();
		nS.GetBudgetCategory().click();
		List<WebElement> budgetCategory = driver.findElements(
				By.xpath("//div[@class='col-md-6 col-12']/div/select[@ng-model='SelectedBudgetcategoryID']/option"));
		int sizeBC = budgetCategory.size();
		int randomNumberBC = ThreadLocalRandom.current().nextInt(1, sizeBC);
		budgetCategory.get(randomNumberBC).click();
		log.debug("Budget Category is selected");

		b.waitForPageLoaded();
		nS.GetWorkExecutedBY().click();
		List<WebElement> workExecutedBy = driver.findElements(
				By.xpath("//div[@class='col-md-6 col-12']/div/select[@ng-model='SelectedWorkExecutedID']/option"));
		int sizeWEBY = workExecutedBy.size();
		int randomNumberWEBY = ThreadLocalRandom.current().nextInt(1, sizeWEBY);
		workExecutedBy.get(randomNumberWEBY).click();
		log.debug("WorkExecutedBy is selected");

		// b.waitForPageLoaded();
		nS.GetEBLineDistance().sendKeys(objst.get(0).get(0));
		log.debug("EBLineDistance is entered");

		// b.waitForPageLoaded();
		nS.GetIndusID().sendKeys(objst.get(0).get(1));
		log.debug("Indus ID is entered");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", nS.GetEBLineType());
		b.waitForPageLoaded();
		nS.GetEBLineType().click();
		List<WebElement> eBLineType = driver.findElements(By.xpath("//div[@class='col-md-6 col-12']/div/select[@ng-model='SelectedEBLineTypeID']/option"));
		int sizeEB = eBLineType.size();
		int randomNumberEB = ThreadLocalRandom.current().nextInt(1, sizeEB);
		//p.load(fis);
		System.out.println(p.getProperty("OTHERTEXT"));
		eBLineType.get(randomNumberEB).click();
		log.debug("EBLineType is selected");
		b.waitForPageLoaded();
		if (p.getProperty("OTHERTEXT").contentEquals(eBLineType.get(randomNumberEB).getText()))
		{
			b.waitForPageLoaded();
			Thread.sleep(5000);
			nS.GetOtherText().sendKeys(objst.get(0).get(19));
		}

		b.waitForPageLoaded();
		nS.GetSiteName().sendKeys(objst.get(0).get(2));
		log.debug("Site Name is entered");

		b.waitForPageLoaded();
		nS.GetConnectionType().click();
		log.debug("Connection Type is selected");

		b.waitForPageLoaded();
		nS.GetSiteType().click();
		List<WebElement> siteType = driver.findElements(
				By.xpath("//div[@class='col-md-6 col-12']/div/select[@ng-model='SelectedSitetypeID']/option"));
		int sizeST = siteType.size();
		int randomNumberST = ThreadLocalRandom.current().nextInt(1, sizeST);
		siteType.get(randomNumberST).click();
		log.debug("Site Type is selected");

		// b.waitForPageLoaded();
		nS.GetTransormerRating().sendKeys(objst.get(0).get(3));
		log.debug("TransformerRating is Entered");

		// b.waitForPageLoaded();
		nS.GetAppliedLoad().sendKeys(objst.get(0).get(4));
		log.debug("Applied Load is Entered");

		js.executeScript("arguments[0].scrollIntoView();", nS.GetSubject());
		b.waitForPageLoaded();
		nS.GetSubject().sendKeys(objst.get(0).get(5));
		log.debug("Subject is Entered");

		// b.waitForPageLoaded();
		nS.GetPraposal().sendKeys(objst.get(0).get(6));
		log.debug("Praposal is Entered");

		// b.waitForPageLoaded();
		nS.GetBackground().sendKeys(objst.get(0).get(7));
		log.debug("Background is Entered");

		// b.waitForPageLoaded();
		nS.GetJustification().sendKeys(objst.get(0).get(8));
		log.debug("Justification is Entered");

		// b.waitForPageLoaded();
		nS.GetFinalImplication().sendKeys(objst.get(0).get(9));
		log.debug("FinalImplication is Entered");

		// b.waitForPageLoaded();
		nS.GetTotalAmount().sendKeys(Keys.BACK_SPACE);
		nS.GetTotalAmount().sendKeys(objst.get(0).get(10));
		log.debug("Total Amount is Entered");

		// b.waitForPageLoaded();
		nS.GetAdditionalAmount().sendKeys(objst.get(0).get(11));
		log.debug("Additional Amount is Entered");

		// b.waitForPageLoaded();
		nS.GetDieselCost().sendKeys(objst.get(0).get(12));
		log.debug("Diesel Cost is Entered");

		js.executeScript("arguments[0].scrollIntoView();", nS.GetFileAttachmentROI());
		b.waitForPageLoaded();
		nS.GetFileAttachmentROI().sendKeys("D:\\COC.docx");
		log.debug("ROI Attachment is Attached");

		nS.GetBudgetHead().sendKeys(objst.get(0).get(13));
		log.debug("BudgetHead is Entered");

		nS.GetPreferredSupplier().sendKeys(objst.get(0).get(14));
		log.debug("Preferred Supplier is Entered");

		nS.GetReasonForOverspending().sendKeys(objst.get(0).get(15));
		log.debug("Reason For Overspending is Entered");

		nS.GetRemarks().sendKeys(objst.get(0).get(16));
		log.debug("Remarks is Entered");

		nS.GetRecommendation().sendKeys(objst.get(0).get(17));
		log.debug("Recommendation is Entered");

		b.waitForPageLoaded();
		nS.GetAttachDocument().sendKeys("D:\\COC.docx");
		log.debug("Attachment is Attached");

		nS.GetUserComment().sendKeys(objst.get(0).get(18));
		log.debug("user comment is Entered");
    	
    }


    @When("^: Enter values with following details$")
    public void _enter_values_with_following_details(DataTable data) throws Throwable {
    	
    	List<List<String>> obj = data.raw();
       
    	Base b = new Base();
		b.waitForPageLoaded();
		NewSitePage nS = new NewSitePage(driver);
		nS.GetIntiatorDesignation().click();
		int size = nS.GetIntiatorDesignationNumberOfElements().size();
		int randomNumber = ThreadLocalRandom.current().nextInt(1, size);
		nS.GetIntiatorDesignationNumberOfElements().get(randomNumber).click();
		log.debug("Initiator Designation is selected");

		b.waitForPageLoaded();
		nS.GetUserDepartment().click();
		List<WebElement> userDepartment = driver.findElements(
				By.xpath("//div[@class='col-md-6 col-12']/div/select[@ng-model='SelectedDepartmentID']/option"));
		int sizeUD = userDepartment.size();
		int randomNumberUD = ThreadLocalRandom.current().nextInt(1, sizeUD);
		userDepartment.get(randomNumberUD).click();
		log.debug("User Department is selected");

		b.waitForPageLoaded();
		nS.GetBudgetCategory().click();
		List<WebElement> budgetCategory = driver.findElements(
				By.xpath("//div[@class='col-md-6 col-12']/div/select[@ng-model='SelectedBudgetcategoryID']/option"));
		int sizeBC = budgetCategory.size();
		int randomNumberBC = ThreadLocalRandom.current().nextInt(1, sizeBC);
		budgetCategory.get(randomNumberBC).click();
		log.debug("Budget Category is selected");

		b.waitForPageLoaded();
		nS.GetWorkExecutedBY().click();
		List<WebElement> workExecutedBy = driver.findElements(
				By.xpath("//div[@class='col-md-6 col-12']/div/select[@ng-model='SelectedWorkExecutedID']/option"));
		int sizeWEBY = workExecutedBy.size();
		int randomNumberWEBY = ThreadLocalRandom.current().nextInt(1, sizeWEBY);
		workExecutedBy.get(randomNumberWEBY).click();
		log.debug("WorkExecutedBy is selected");

		// b.waitForPageLoaded();
		nS.GetEBLineDistance().sendKeys(obj.get(0).get(0));
		log.debug("EBLineDistance is entered");

		// b.waitForPageLoaded();
		nS.GetIndusID().sendKeys(obj.get(0).get(1));
		log.debug("Indus ID is entered");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", nS.GetEBLineType());
		b.waitForPageLoaded();
		nS.GetEBLineType().click();
		List<WebElement> eBLineType = driver.findElements(By.xpath("//div[@class='col-md-6 col-12']/div/select[@ng-model='SelectedEBLineTypeID']/option"));
		int sizeEB = eBLineType.size();
		int randomNumberEB = ThreadLocalRandom.current().nextInt(1, sizeEB);
		//p.load(fis);
		System.out.println(p.getProperty("OTHERTEXT"));
		eBLineType.get(randomNumberEB).click();
		log.debug("EBLineType is selected");
		b.waitForPageLoaded();
		if (p.getProperty("OTHERTEXT").contentEquals(eBLineType.get(randomNumberEB).getText()))
		{
			b.waitForPageLoaded();
			Thread.sleep(5000);
			nS.GetOtherText().sendKeys(obj.get(0).get(19));
		}

		b.waitForPageLoaded();
		nS.GetSiteName().sendKeys(obj.get(0).get(2));
		log.debug("Site Name is entered");

		b.waitForPageLoaded();
		nS.GetConnectionType().click();
		log.debug("Connection Type is selected");

		b.waitForPageLoaded();
		nS.GetSiteType().click();
		List<WebElement> siteType = driver.findElements(
				By.xpath("//div[@class='col-md-6 col-12']/div/select[@ng-model='SelectedSitetypeID']/option"));
		int sizeST = siteType.size();
		int randomNumberST = ThreadLocalRandom.current().nextInt(1, sizeST);
		siteType.get(randomNumberST).click();
		log.debug("Site Type is selected");

		// b.waitForPageLoaded();
		nS.GetTransormerRating().sendKeys(obj.get(0).get(3));
		log.debug("TransformerRating is Entered");

		// b.waitForPageLoaded();
		nS.GetAppliedLoad().sendKeys(obj.get(0).get(4));
		log.debug("Applied Load is Entered");

		js.executeScript("arguments[0].scrollIntoView();", nS.GetSubject());
		b.waitForPageLoaded();
		nS.GetSubject().sendKeys(obj.get(0).get(5));
		log.debug("Subject is Entered");

		// b.waitForPageLoaded();
		nS.GetPraposal().sendKeys(obj.get(0).get(6));
		log.debug("Praposal is Entered");

		// b.waitForPageLoaded();
		nS.GetBackground().sendKeys(obj.get(0).get(7));
		log.debug("Background is Entered");

		// b.waitForPageLoaded();
		nS.GetJustification().sendKeys(obj.get(0).get(8));
		log.debug("Justification is Entered");

		// b.waitForPageLoaded();
		nS.GetFinalImplication().sendKeys(obj.get(0).get(9));
		log.debug("FinalImplication is Entered");

		// b.waitForPageLoaded();
		nS.GetTotalAmount().sendKeys(Keys.BACK_SPACE);
		nS.GetTotalAmount().sendKeys(obj.get(0).get(10));
		log.debug("Total Amount is Entered");

		// b.waitForPageLoaded();
		nS.GetAdditionalAmount().sendKeys(obj.get(0).get(11));
		log.debug("Additional Amount is Entered");

		// b.waitForPageLoaded();
		nS.GetDieselCost().sendKeys(obj.get(0).get(12));
		log.debug("Diesel Cost is Entered");

		js.executeScript("arguments[0].scrollIntoView();", nS.GetFileAttachmentROI());
		b.waitForPageLoaded();
		nS.GetFileAttachmentROI().sendKeys("D:\\COC.docx");
		log.debug("ROI Attachment is Attached");

		nS.GetBudgetHead().sendKeys(obj.get(0).get(13));
		log.debug("BudgetHead is Entered");

		nS.GetPreferredSupplier().sendKeys(obj.get(0).get(14));
		log.debug("Preferred Supplier is Entered");

		nS.GetReasonForOverspending().sendKeys(obj.get(0).get(15));
		log.debug("Reason For Overspending is Entered");

		nS.GetRemarks().sendKeys(obj.get(0).get(16));
		log.debug("Remarks is Entered");

		nS.GetRecommendation().sendKeys(obj.get(0).get(17));
		log.debug("Recommendation is Entered");

		b.waitForPageLoaded();
		nS.GetAttachDocument().sendKeys("D:\\COC.docx");
		log.debug("Attachment is Attached");

		nS.GetUserComment().sendKeys(obj.get(0).get(18));
		log.debug("user comment is Entered");
    		
    	
    }

    @Then("^: Verify Values enetred successfully$")
    public void _verify_values_enetred_successfully() throws Throwable {
        
    	log.info("Values entered successfully");
    	
    }
    
    
    @Given("^: NormalSite form is open$")
    public void _normalsite_form_is_open() throws Throwable {
       log.info("Normal Site form is open");
    }
    
    
    @When("^: Enter values for Normal Site with following details$")
    public void _enter_values_for_normal_site_with_following_details(DataTable data) throws Throwable {
       
    	List<List<String>> npObj = data.raw();
        
    	Base b = new Base();
    	NormalSitePage nmP = new NormalSitePage(driver);
		b.waitForPageLoaded();
		NewSitePage nS = new NewSitePage(driver);
		nS.GetIntiatorDesignation().click();
		int size = nS.GetIntiatorDesignationNumberOfElements().size();
		int randomNumber = ThreadLocalRandom.current().nextInt(1, size);
		nS.GetIntiatorDesignationNumberOfElements().get(randomNumber).click();
		log.debug("Initiator Designation is selected");

		b.waitForPageLoaded();
		nS.GetUserDepartment().click();
		List<WebElement> userDepartment = driver.findElements(
				By.xpath("//div[@class='col-md-6 col-12']/div/select[@ng-model='SelectedDepartmentID']/option"));
		int sizeUD = userDepartment.size();
		int randomNumberUD = ThreadLocalRandom.current().nextInt(1, sizeUD);
		userDepartment.get(randomNumberUD).click();
		log.debug("User Department is selected");

		b.waitForPageLoaded();
		nS.GetBudgetCategory().click();
		List<WebElement> budgetCategory = driver.findElements(
				By.xpath("//div[@class='col-md-6 col-12']/div/select[@ng-model='SelectedBudgetcategoryID']/option"));
		int sizeBC = budgetCategory.size();
		int randomNumberBC = ThreadLocalRandom.current().nextInt(1, sizeBC);
		budgetCategory.get(randomNumberBC).click();
		log.debug("Budget Category is selected");

		b.waitForPageLoaded();
		nS.GetWorkExecutedBY().click();
		List<WebElement> workExecutedBy = driver.findElements(
				By.xpath("//div[@class='col-md-6 col-12']/div/select[@ng-model='SelectedWorkExecutedID']/option"));
		int sizeWEBY = workExecutedBy.size();
		int randomNumberWEBY = ThreadLocalRandom.current().nextInt(1, sizeWEBY);
		workExecutedBy.get(randomNumberWEBY).click();
		log.debug("WorkExecutedBy is selected");

		// b.waitForPageLoaded();
		nmP.GetEblineDistance().sendKeys(npObj.get(0).get(0));
		log.debug("EBLineDistance is entered");

		// b.waitForPageLoaded();
		nS.GetIndusID().sendKeys(npObj.get(0).get(1));
		log.debug("Indus ID is entered");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", nmP.GetEBType());
		b.waitForPageLoaded();
		nmP.GetEBType().click();
		//List<WebElement> eBLineType = driver.findElements(By.xpath("//div[@class='col-md-6 col-12']/div/select[@ng-model='SelectedEBLineTypeID']/option"));
		int sizeEB = nmP.GetEBTypeElementSize();
		int randomNumberEB = ThreadLocalRandom.current().nextInt(1, sizeEB);
		//p.load(fis);
		//System.out.println(p.getProperty("OTHERTEXT"));
		nmP.GetEBTypeElement().get(randomNumberEB).click();
		log.debug("EBLineType is selected");
		b.waitForPageLoaded();
		if (p.getProperty("OTHERTEXT").contentEquals(nmP.GetEBTypeElement().get(randomNumberEB).getText()))
		{
			b.waitForPageLoaded();
			Thread.sleep(5000);
			nS.GetOtherText().sendKeys(npObj.get(0).get(21));
		}

		b.waitForPageLoaded();
		nS.GetSiteName().sendKeys(npObj.get(0).get(2));
		log.debug("Site Name is entered");

		b.waitForPageLoaded();
		nS.GetConnectionType().click();
		log.debug("Connection Type is selected");

		b.waitForPageLoaded();
		nS.GetSiteType().click();
		List<WebElement> siteType = driver.findElements(
				By.xpath("//div[@class='col-md-6 col-12']/div/select[@ng-model='SelectedSitetypeID']/option"));
		int sizeST = siteType.size();
		int randomNumberST = ThreadLocalRandom.current().nextInt(1, sizeST);
		siteType.get(randomNumberST).click();
		log.debug("Site Type is selected");
		
		nmP.GetCurrentLoad().sendKeys(npObj.get(0).get(3));

		// b.waitForPageLoaded();
		nS.GetTransormerRating().sendKeys(npObj.get(0).get(4));
		log.debug("TransformerRating is Entered");

		// b.waitForPageLoaded();
		nmP.GetAppliedLoad().sendKeys(npObj.get(0).get(5));
		log.debug("Applied Load is Entered");
		
		nmP.GetAdditionalLoad().sendKeys(npObj.get(0).get(6));
		log.debug("Additional Load is entered");

		js.executeScript("arguments[0].scrollIntoView();", nmP.GetSubject());
		b.waitForPageLoaded();
		nmP.GetSubject().sendKeys(npObj.get(0).get(7));
		log.debug("Subject is Entered");

		// b.waitForPageLoaded();
		nS.GetPraposal().sendKeys(npObj.get(0).get(8));
		log.debug("Praposal is Entered");

		// b.waitForPageLoaded();
		nS.GetBackground().sendKeys(npObj.get(0).get(9));
		log.debug("Background is Entered");

		// b.waitForPageLoaded();
		nS.GetJustification().sendKeys(npObj.get(0).get(10));
		log.debug("Justification is Entered");

		// b.waitForPageLoaded();
		nS.GetFinalImplication().sendKeys(npObj.get(0).get(11));
		log.debug("FinalImplication is Entered");

		// b.waitForPageLoaded();
		nS.GetTotalAmount().sendKeys(Keys.BACK_SPACE);
		nS.GetTotalAmount().sendKeys(npObj.get(0).get(12));
		log.debug("Total Amount is Entered");

		// b.waitForPageLoaded();
		nS.GetAdditionalAmount().sendKeys(npObj.get(0).get(13));
		log.debug("Additional Amount is Entered");

		// b.waitForPageLoaded();
		nS.GetDieselCost().sendKeys(npObj.get(0).get(14));
		log.debug("Diesel Cost is Entered");

		js.executeScript("arguments[0].scrollIntoView();", nmP.GetFileAttachementROI());
		b.waitForPageLoaded();
		nmP.GetFileAttachementROI().sendKeys("D:\\COC.docx");
		log.debug("ROI Attachment is Attached");

		nS.GetBudgetHead().sendKeys(npObj.get(0).get(15));
		log.debug("BudgetHead is Entered");

		nS.GetPreferredSupplier().sendKeys(npObj.get(0).get(16));
		log.debug("Preferred Supplier is Entered");

		nS.GetReasonForOverspending().sendKeys(npObj.get(0).get(17));
		log.debug("Reason For Overspending is Entered");

		nmP.GetRemarks().sendKeys(npObj.get(0).get(18));
		log.debug("Remarks is Entered");

		nS.GetRecommendation().sendKeys(npObj.get(0).get(19));
		log.debug("Recommendation is Entered");

		b.waitForPageLoaded();
		nS.GetAttachDocument().sendKeys("D:\\COC.docx");
		log.debug("Attachment is Attached");

		nS.GetUserComment().sendKeys(npObj.get(0).get(20));
		log.debug("user comment is Entered");
    }

   

    @Then("^: Verify Values enetred successfully for the NormalSite$")
    public void _verify_values_enetred_successfully_for_the_normalsite() throws Throwable {
    	log.info("Values entered successfully");
    }
    
    
    @Given("^: Values are entered successfully$")
    public void _values_are_entered_successfully() throws Throwable {
      
    	log.info("Values entered successfully");
    }

    @When("^: Click on Submit Button$")
    public void _click_on_submit_button() throws Throwable {
      
    	Base b= new Base();
    	NewSitePage nS = new NewSitePage(driver);	
    	b.waitForPageLoaded();
    	nS.GetSubmit().click();
    }

    @Then("^: Verify Form is submitted$")
    public void _verify_form_is_submitted() throws Throwable {
    	Base b= new Base();
    	b.waitForPageLoaded();
    	Thread.sleep(15000);
    	Alert alert = driver.switchTo().alert();
    	//p.load(fis);

    	if (alert.getText().contains(p.getProperty("ALERTMSG")))
    	{
    		log.info("New Site form is submitted successfully");
    	}
    	alert.accept();
    	driver.quit();
    }
    


}