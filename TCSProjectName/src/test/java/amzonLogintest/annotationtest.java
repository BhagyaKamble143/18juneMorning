package amzonLogintest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseTest.baseClass;
import amzonLogin.AmzonLogin2;
import amzonLogin.GoBckinHmpg;
import amzonLogin.LogOut;
import amzonLogin.addToCartPge;
import amzonLogin.amzonHomePage;
import amzonLogin.amzonLogin;
import utility.utilityClass;


public class annotationtest extends baseClass{
	static amzonLogin login;
	static AmzonLogin2  login1;
	static amzonHomePage hmpg;
    static addToCartPge AddCart;
	static GoBckinHmpg goback;
	static LogOut sigout;
	@BeforeClass
	public static void lunchbr() {
		baseClass.launchBrowser("Chrome");
		 login=new amzonLogin(driver);
	     login1=new AmzonLogin2 (driver);
	   hmpg= new amzonHomePage(driver);
	   AddCart=new  addToCartPge (driver);
	   goback=new GoBckinHmpg(driver);
	   sigout =new  LogOut (driver);
	
	}
	
	@BeforeMethod
	public static void PreReqLogin() {
		 
		   login.enterUserName();
		   login.clickOnContinueButton();
		   login1.enterPassword();
		   login1.ClickOnsubmitButton();
	}
	@Test
	public static  void TCHmPG() {
		 hmpg.ClickOnAll();
		 hmpg.ClickOnMenFashions();
		 hmpg.clickOnTshirtsPolos();
		 hmpg.ClickOnHoodedNeck();
		 hmpg.clickOnimage();
		 System.out.println("TCHmPG");
	}
    @Test(priority=1,dependsOnMethods="TCHmPG")
	public void TCaddcart() throws IOException {
		AddCart.swichToWindow();
	    AddCart.selectSize();
	    AddCart.clickOnaddToCart();
	    AddCart.clickOngobackcart();
	    goback.clickOnproccedToBuy();
	     Assert.fail();
	}
	//
   // @Test 
	//public void TC03() {
		//goback.clickOnproccedToBuy();
		//goback.closeallBrowser();
		
	//}
	@AfterMethod
	public void SignOut(ITestResult result) throws IOException {
		if(result.getStatus()==ITestResult.FAILURE) {
		 utilityClass.getScreenshort();
		 utilityClass.paramerzation();
		 
		}
	    sigout.ClickOnYourAccount();
		sigout.ClickOnSignOut();
	}
	@AfterClass
	public void quitbrowser() {
		goback.closeallBrowser();
	}
	}
	
	
	


