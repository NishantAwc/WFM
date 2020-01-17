package pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {
	
	public WebDriver driver;
	
	public SignInPage(WebDriver driver)
	{
		this.driver=driver;
	}		
	
	By SignInText = By.xpath("//div[@role='heading']");
	
	By EnterPasswordText = By.id("loginHeader");
	
	By username = By.id("i0116");
	
	By Next = By.id("idSIButton9");
	
	By NewSite = By.xpath("//div[@id='navbarSupportedContent']/ul/li[2]/ul/li[2]/ul/li[1]");
	
	By EnterPwdText = By.id("loginHeader");
	
	By Password = By.id("i0118");
	
	By Submit = By.xpath("//input[@type='submit']");
	
	By NoSignInWindow = By.id("idBtn_Back");
	
	public WebElement EnterPasswordText()
	{
		return driver.findElement(EnterPasswordText);
	}
	
	public WebElement NoSignInWindow()
	{
		return driver.findElement(NoSignInWindow);
	}
	
	public WebElement Password()
	{
		return driver.findElement(Password);
	}
	
	public WebElement Submit()
	{
		return driver.findElement(Submit);
	}
	
	public WebElement EnterPwdText()
	{
		return driver.findElement(EnterPwdText);
	}
	
	public WebElement SignInText()
	{
		return driver.findElement(SignInText);
	}
	
	public WebElement clickONNext()
	{
		return driver.findElement(Next);
	}
	
	public WebElement UserName()
	{
		return driver.findElement(username);
	}
	
	public WebElement clickonNewSite()
	{
		return driver.findElement(NewSite);
	}
}

