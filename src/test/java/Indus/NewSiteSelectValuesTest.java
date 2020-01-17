package Indus;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObject.NewSitePage;
import resources.Base;

public class NewSiteSelectValuesTest extends Base{
	
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	@Test(dataProvider= "getNewSiteData")
	public void SelectNewSiteValues(String EBLineDistance, String IndusID, String SiteName, String TransformerRating, String AppliedLoad, String Subject, String Praposal,
			String Background, String Justification, String FinalImplication, String TotalAmount, String AdditionalAmount, String DieselCost, String BudgetHead,
			String PreferredSupplier, String ReasonForOverspending, String Remarks, String Recommendation, String UserComment, String OtherText) throws InterruptedException, IOException {
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
		nS.GetEBLineDistance().sendKeys(EBLineDistance);
		log.debug("EBLineDistance is entered");

		// b.waitForPageLoaded();
		nS.GetIndusID().sendKeys(IndusID);
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
			nS.GetOtherText().sendKeys(OtherText);
		}

		b.waitForPageLoaded();
		nS.GetSiteName().sendKeys(SiteName);
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
		nS.GetTransormerRating().sendKeys(TransformerRating);
		log.debug("TransformerRating is Entered");

		// b.waitForPageLoaded();
		nS.GetAppliedLoad().sendKeys(AppliedLoad);
		log.debug("Applied Load is Entered");

		js.executeScript("arguments[0].scrollIntoView();", nS.GetSubject());
		b.waitForPageLoaded();
		nS.GetSubject().sendKeys(Subject);
		log.debug("Subject is Entered");

		// b.waitForPageLoaded();
		nS.GetPraposal().sendKeys(Praposal);
		log.debug("Praposal is Entered");

		// b.waitForPageLoaded();
		nS.GetBackground().sendKeys(Background);
		log.debug("Background is Entered");

		// b.waitForPageLoaded();
		nS.GetJustification().sendKeys(Justification);
		log.debug("Justification is Entered");

		// b.waitForPageLoaded();
		nS.GetFinalImplication().sendKeys(FinalImplication);
		log.debug("FinalImplication is Entered");

		// b.waitForPageLoaded();
		nS.GetTotalAmount().sendKeys(Keys.BACK_SPACE);
		nS.GetTotalAmount().sendKeys(TotalAmount);
		log.debug("Total Amount is Entered");

		// b.waitForPageLoaded();
		nS.GetAdditionalAmount().sendKeys(AdditionalAmount);
		log.debug("Additional Amount is Entered");

		// b.waitForPageLoaded();
		nS.GetDieselCost().sendKeys(DieselCost);
		log.debug("Diesel Cost is Entered");

		js.executeScript("arguments[0].scrollIntoView();", nS.GetFileAttachmentROI());
		b.waitForPageLoaded();
		nS.GetFileAttachmentROI().sendKeys("D:\\COC.docx");
		log.debug("ROI Attachment is Attached");

		nS.GetBudgetHead().sendKeys(BudgetHead);
		log.debug("BudgetHead is Entered");

		nS.GetPreferredSupplier().sendKeys(PreferredSupplier);
		log.debug("Preferred Supplier is Entered");

		nS.GetReasonForOverspending().sendKeys(ReasonForOverspending);
		log.debug("Reason For Overspending is Entered");

		nS.GetRemarks().sendKeys(Remarks);
		log.debug("Remarks is Entered");

		nS.GetRecommendation().sendKeys(Recommendation);
		log.debug("Recommendation is Entered");

		b.waitForPageLoaded();
		nS.GetAttachDocument().sendKeys("D:\\COC.docx");
		log.debug("Attachment is Attached");

		nS.GetUserComment().sendKeys(UserComment);
		log.debug("user comment is Entered");
	}

	@DataProvider
	public Object[][] getNewSiteData() {
		Object[][] data = new Object[1][20];
		data[0][0] = "123.33";
		data[0][1] = "TestIndusID01";
		data[0][2] = "TestSiteName01";
		data[0][3] = "11.22";
		data[0][4] = "23.22";
		data[0][5] = "This form is for Test Purpose";
		data[0][6] = "This form is for Test Purpose";
		data[0][7] = "This form is for Test Purpose";
		data[0][8] = "This form is for Test Purpose";
		data[0][9] = "This form is for Test Purpose";
		data[0][10] = "10000";
		data[0][11] = "5000";
		data[0][12] = "200";
		data[0][13] = "BudgetHead01";
		data[0][14] = "PreferredSupplier01";
		data[0][15] = "This form is for Test Purpose";
		data[0][16] = "This form is for Test Purpose";
		data[0][17] = "This form is for Test Purpose";
		data[0][18] = "This form is for Test Purpose";
		data[0][19] = "This form is for Test Purpose";
		return data;
	}


}
