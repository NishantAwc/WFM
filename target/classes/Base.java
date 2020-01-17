package resources;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.SignInPage;

public class Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());
	public static WebDriver driver;
	public static Properties p;
	public static WebDriverWait wait;
	public static FileInputStream fis;
	public static FileReader fr;
	public static String username, password;
	
	public WebDriver initializeDriver() throws IOException {

		p = new Properties();
		//fis = new FileInputStream("D:\\Automation Testing Projects\\Indus WFM\\WFM\\src\\main\\java\\resources\\Data.properties");
		//fis = (FileInputStream) this.getClass().getResourceAsStream("D:\\Automation Testing Projects\\Indus WFM\\WFM\\src\\main\\java\\resources\\Data.properties");
		//this.getClass().getResourceAsStream("Data.properties");
		fr= new FileReader ("D:\\Automation Testing Projects\\Indus WFM\\WFM\\src\\main\\java\\resources\\Data.properties");
		p.load(fr);
		
		if(p.getProperty("browsername").contentEquals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D://Driver//chromedriver.exe");
			driver= new ChromeDriver();
		}
		
		else if(p.getProperty("browsername").contentEquals("firefox"))
		{
			System.setProperty("webdriver.firefox.marionette", "D://Driver//geckodriver.exe");
			driver= new FirefoxDriver();
		}
		
		else if(p.getProperty("browsername").contentEquals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "D://Driver//IE//geckodriver.exe");
			driver= new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public void getScreenshot(String result) throws IOException
	{
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(src, new File("D://Test"+result+"Test.png"));
	}
	
	
	public void waitForPageLoaded() {
        ExpectedCondition<Boolean> expectation = new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
                    }
                };
        try {
            Thread.sleep(1500);
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(expectation);
        } catch (Throwable error) {
            Assert.fail("Timeout waiting for Page Load Request to complete.");
        }
    }
	
		
		public void SignInTest() throws InterruptedException {
			// WebDriverWait wait = new WebDriverWait(driver, 30);
		
			SignInPage sP = new SignInPage(driver);
			// wait.until(ExpectedConditions.elementToBeClickable(sP.UserName()));
			assertTrue(sP.SignInText().isDisplayed(), "SignInText is not Visible");
			log.debug("SignIn Text is Visible");
			sP.UserName().sendKeys(p.getProperty("username"));
			log.debug("Email is entered");
			sP.clickONNext().click();
			log.debug("Next Button is clicked");
			assertTrue(sP.EnterPwdText().isDisplayed(), "Enter Password text is not visible");
			log.debug("Enter Password Text is visible");
			sP.Password().sendKeys(p.getProperty("password"));
			log.debug("Password is entered");
			waitForPageLoaded();
			// Thread.sleep(2000);
			sP.Submit().click();
			log.debug("Submit Button is clicked");
			waitForPageLoaded();
			// Thread.sleep(2000);
			sP.NoSignInWindow().click();
			log.debug("Stay sign In button clicked");
			// Thread.sleep(10000);
			HomePage hP = new HomePage(driver);
			// wait.until(ExpectedConditions.urlToBe("https://industowers.sharepoint.com/sites/idocumentum/wfmdev/SitePages/App.aspx#/"));
			assertEquals(hP.driver.getTitle(), p.getProperty("title"));
			log.debug("Title verified and sign is successful");
			waitForPageLoaded();
			Thread.sleep(2000);
			// b.getWait(hP.getWFText());
			// Thread.sleep(15000)
		}
		

		}

	



