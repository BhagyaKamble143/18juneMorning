package amzonLogin;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class GoBckinHmpg {

WebDriver driver;
	
	
	@FindBy(xpath="//span[@id='sc-buy-box-ptc-button']")
	private WebElement processedToBuy ;
	
	
	public GoBckinHmpg(WebDriver driver) {
	this.driver=driver;	
	PageFactory.initElements(driver, this);
	}
	 public void clickOnproccedToBuy() {
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 processedToBuy.click();
		 driver.navigate().back();
		
		 }
    	public void closeallBrowser() {
    		 driver.quit();	
    	} 
    

}
