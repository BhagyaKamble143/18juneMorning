package amzonLogin;


import org.apache.bcel.verifier.exc.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amzonLogin  {
	WebDriver driver;
	@FindBy(xpath="//input[@id='ap_email']")
	private WebElement userName;
	@FindBy(xpath="(//span[@class='a-button-inner'])[1]")
	private WebElement continueButton;
	
	
	public amzonLogin(WebDriver driver) {
	this.driver=driver;	
	PageFactory.initElements(driver, this);
	}
     public void enterUserName() {
    	 userName.sendKeys("bhagyashrischoudhari@gmail.com");
    	
	
     }
     public void clickOnContinueButton() {
    	 continueButton.click();
     }
}
