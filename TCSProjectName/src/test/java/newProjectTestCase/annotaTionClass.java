package newProjectTestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseTest.baseClass;
import basePckNewSite.baseClassNewSite;
import newSite.homPge;
import newSite.logOut;
import newSite.login2;
import newSite.newSiteLogin;
import utility.utilityClass;

public class annotaTionClass extends baseClassNewSite {
	
		static newSiteLogin login;
		static  login2  loginPg;
		static homPge hmpg;
	    static logOut sigout;

		@BeforeClass
		public static void browserLaunch() {
			baseClassNewSite.lunchBrowser("Chrome");
			 login =new newSiteLogin  (driver);
			 loginPg = new login2  (driver);
		   hmpg= new homPge(driver);
		  sigout =new logOut(driver);
		}
		 @BeforeMethod
			public static void PreLogin() {
			 login.clickonsignin();
			 loginPg.enterusername();
			 loginPg.enterpassword();
		 }	  
			
			@Test
			public static  void TCHmPG() {
				 hmpg.moveonEyeglasses();
				 hmpg.clickonwomen();
				 hmpg.selectposition();
				 hmpg.clickonBlue();;
			System.out.println("TCHmPG");
			}
		   @AfterMethod
			public void SignOut(ITestResult result) throws IOException {
				if(result.getStatus()==ITestResult.FAILURE) {
				 utilityClass.getScreenshort();
				 utilityClass.paramerzation();
				 
				}
				sigout.switchtowindow();
			    sigout.clickAnuja();
				sigout.clickonlogoutbutton();
			}
			@AfterClass
			public void quitbrowser() {
				sigout.close();
			}
			
			
}
