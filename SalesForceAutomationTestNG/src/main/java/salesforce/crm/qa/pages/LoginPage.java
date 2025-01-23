package salesforce.crm.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import salesforce.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	
	//Page factory / Object Repository for Login Page

	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="pw")
	WebElement password;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement login;
	
//---------------------ACTIONS-----------------------------------//

//Constructor of the class to initialize all the OR above
	
public LoginPage() {
	
	PageFactory.initElements(driver, this); 
	
}

public HomePage login(String uname,String pword) {
	
	username.sendKeys(uname);
	password.sendKeys(pword);
	login.click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	return new HomePage();
	
}
 


}