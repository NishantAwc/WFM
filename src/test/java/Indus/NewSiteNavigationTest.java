package Indus;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.HomePage;
import resources.Base;

public class NewSiteNavigationTest extends Base {

	public static Logger log = LogManager.getLogger(Base.class.getName());

	@BeforeTest
	public void sigin() throws IOException, InterruptedException {
		driver = initializeDriver();
		log.info("Driver is Initialized");
		driver.get(p.getProperty("url"));
		log.info("Navigated to URL successfully");
		driver.manage().window().maximize();
		log.info("Browser is maximized");
		Base b = new Base();
		b.waitForPageLoaded();
		b.SignInTest();
	}

	@Test
	public void newSiteNavigation() throws InterruptedException {
		HomePage hP = new HomePage(driver);
		// wait.until(ExpectedConditions.visibilityOf(hP.getWFText()));
		hP.clickOnForms().click();
		hP.GetEB().click();
		hP.GetNewSite().click();
		
	}
	

}
	


