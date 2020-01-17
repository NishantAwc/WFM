package Indus;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObject.HomePage;
import pageObject.SignInPage;
import resources.Base;

public class SignInTest extends Base{
	
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void intilizeBrowser() throws IOException, InterruptedException {
	
		driver = initializeDriver();
		log.info("Driver is Initialized");
		driver.get(p.getProperty("url"));
		log.info("Navigated to URL successfully");
		driver.manage().window().maximize();
		log.info("Browser is maximized");
		Base b1 = new Base();
		b1.waitForPageLoaded();
		// Thread.sleep(5000);

	}
	
	@Test(dataProvider = "getData")
	public void SignInTest(String username, String password) throws InterruptedException, IOException {
		// WebDriverWait wait = new WebDriverWait(driver, 30);
		Base b = new Base();
		SignInPage sP = new SignInPage(driver);
		// wait.until(ExpectedConditions.elementToBeClickable(sP.UserName()));
		assertTrue(sP.SignInText().isDisplayed(), "SignInText is not Visible");
		log.debug("SignIn Text is Visible");
		sP.UserName().sendKeys(username);
		log.debug("Email is entered");
		sP.clickONNext().click();
		log.debug("Next Button is clicked");
		assertTrue(sP.EnterPwdText().isDisplayed(), "Enter Password text is not visible");
		log.debug("Enter Password Text is visible");
		sP.Password().sendKeys(password);
		log.debug("Password is entered");
		b.waitForPageLoaded();
		// Thread.sleep(2000);
		sP.Submit().click();
		log.debug("Submit Button is clicked");
		b.waitForPageLoaded();
		// Thread.sleep(2000);
		sP.NoSignInWindow().click();
		log.debug("Stay sign In button clicked");
		// Thread.sleep(10000);
		HomePage hP = new HomePage(driver);
		// wait.until(ExpectedConditions.urlToBe("https://industowers.sharepoint.com/sites/idocumentum/wfmdev/SitePages/App.aspx#/"));
		assertEquals(hP.driver.getTitle(), p.getProperty("title"));
		log.debug("Title verified and sign is successful");
		b.waitForPageLoaded();
		Thread.sleep(2000);
		// b.getWait(hP.getWFText());
		// Thread.sleep(15000)
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[1][2];
		data[0][0] = "p-akash.verma@industowers.com";
		data[0][1] = "user@123";
		return data;
	}

}
