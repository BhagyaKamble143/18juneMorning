package amzonLogin;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClassAmzonLogin {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
						
		WebDriver driver = new ChromeDriver(); //Browser Launch
    driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");//URL Insert
   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
   driver.manage().window().maximize();
   amzonLogin login=new amzonLogin(driver);
   login.enterUserName();
   login.clickOnContinueButton();
   AmzonLogin2  login1=new AmzonLogin2 (driver);
   login1.enterPassword();
   login1.ClickOnsubmitButton();
   amzonHomePage hmpg= new amzonHomePage(driver);
    hmpg.ClickOnAll();
    hmpg.ClickOnMenFashions();
    hmpg.clickOnTshirtsPolos();
    hmpg.ClickOnHoodedNeck();
    hmpg.clickOnimage();
   addToCartPge AddCart=new  addToCartPge (driver);
    AddCart.swichToWindow();
    AddCart.selectSize();
    AddCart.clickOnaddToCart();
    AddCart.clickOngobackcart();
    LogOut sigout =new  LogOut (driver);
    sigout.ClickOnSignOut();
    GoBckinHmpg goback=new GoBckinHmpg(driver);
    goback.clickOnproccedToBuy();
    goback.closeallBrowser();
}
}