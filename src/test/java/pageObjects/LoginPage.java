package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	public WebDriver ldriver;
	// constructor 
	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	

	// Locators
	@FindBy(id = "Email")
	@CacheLookup
	WebElement txtEmail;
	
	
	@FindBy(id = "Password")
	@CacheLookup
	WebElement txtPassword;
	
	
	@FindBy(xpath = "//input[@value='Log in']")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(linkText = "Logout")
	@CacheLookup
	WebElement lnkLogout;
	
	// Action methods --> for every web element we located we have to create an action method
	
	public void setEmail(String email) { // we will receive the email as a parameter from Login.feature file 
		txtEmail.clear();
		txtEmail.sendKeys(email);
	}
	
	public void setPassword(String pwd) {// we will receive the password as a parameter from Login.feature file 
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		btnLogin.click();
	}
	
	public void clickLogout()
	{
		lnkLogout.click();
	}
	
	
	

}
