package BaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

import amzonLogin.AmzonLogin2;
import amzonLogin.GoBckinHmpg;
import amzonLogin.LogOut;
import amzonLogin.addToCartPge;
import amzonLogin.amzonHomePage;
import amzonLogin.amzonLogin;

public class baseClass {
	public static WebDriver driver;
	public static void launchBrowser(String browser) {
	
		if(browser.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver", 
	
			"C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
							
			 driver = new ChromeDriver(); //Browser Launch
			
	    }else if(browser.equalsIgnoreCase("Edge")) {
		System.setProperty("webdriver.chrome.driver", 
				
				"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
								
				driver = new EdgeDriver(); //Browser Launch
	    }	
	 driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");//URL Insert
	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	 
	   }
	public static void closeBrowser() {
		driver.close();
	}
	   }

