package amzonLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmzonLogin2 {
	WebDriver driver;
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement submitButton;
	
	public  AmzonLogin2 (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	        }
		 public void enterPassword() {
			password.sendKeys("priyanka100%");
	        }
	     public void ClickOnsubmitButton() {
	         submitButton.click();
	    	 }
		
	
}

	
