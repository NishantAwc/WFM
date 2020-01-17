package Indus;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pageObject.NewSitePage;
import resources.Base;

public class NewSiteSubmitTest extends Base{
	
	public static Logger log = LogManager.getLogger(Base.class.getName());

	
	@Test
	public void SubmitNewSite() throws InterruptedException, IOException
	{
	
	Base b= new Base();
	NewSitePage nS = new NewSitePage(driver);	
	b.waitForPageLoaded();
	nS.GetSubmit().click();
	b.waitForPageLoaded();
	Thread.sleep(12000);
	Alert alert = driver.switchTo().alert();
	//p.load(fis);

	if (alert.getText().contains(p.getProperty("ALERTMSG")))
	{
		log.info("New Site form is submitted successfully");
	}
	alert.accept();;

}
	  @AfterTest 
		 public void tearDown() 
		 { 
			 
			 driver.close(); 
			 driver=null; 
		 }
		 
}
