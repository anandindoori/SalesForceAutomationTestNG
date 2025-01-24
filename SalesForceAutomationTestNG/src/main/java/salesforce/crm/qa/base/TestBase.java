package salesforce.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import salesforce.crm.qa.util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {

//		{
//
//			prop = new Properties();
//			try {
//				FileInputStream ip = new FileInputStream("/Users/anandindoori/Desktop/gitHub/SalesForceAutomationTestNG/src/main/java/salesforce/crm/qa/config/config.properties");
//					;
//				prop.load(ip);
//			} catch (FileNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//		}
		
	}
	
	public static void initialization() {
		
		//String browser = prop.getProperty("browser");
		String browser = "chrome";
		
		
			
			
			 if(browser.equals("chrome")) {
				 String ProjectPath = System.getProperty("user.dir");
				 System.getProperty("webdriver.chrome.driver",ProjectPath+"/src/test/resources/chromedriver/chromedriver.exe");
				 driver = new ChromeDriver();
			 
			 }else if (browser.equals("edge")){
				 WebDriverManager.edgedriver().setup();
				 driver = new EdgeDriver();
				 
			 } else if (browser.equals("firefox")) {
				 WebDriverManager.firefoxdriver().setup();
				 driver = new FirefoxDriver();
				 
			 }else {
				   
				 System.out.println("No Browser spicified");
			 }
			
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));
			driver.get("https://login.salesforce.com/");
		 
		}
	
	
	public void teardown()
	{
		driver.quit();
		
	}
	
	
	
	
}
		
		
	


