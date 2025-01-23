package salesforce.crm.qa.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import salesforce.crm.qa.base.TestBase;
import salesforce.crm.qa.pages.HomePage;
import salesforce.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	
	
	public LoginPageTest() {
		
		super();
		/*Calling constructor of super class (TestBase Class) to initialize config.properties 
		because "prop" is used in initialization method() below*/
	}
	
	
	
	@BeforeMethod
	
	public void setup() {
		initialization();
		
		 loginpage = new LoginPage(); //Create an object of LoginPage class
		
	}
	
	
	
	
	@Test(priority =1)
	public void login() {
		
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password")); 
	}
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	
	public void teardown() {
		
	//driver.quit();
	}
	
	
	

}
