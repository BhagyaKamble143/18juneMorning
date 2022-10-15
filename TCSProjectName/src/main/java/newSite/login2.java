package newSite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login2 {
	WebDriver driver;
	@FindBy(xpath="(//input[@class='input-text'])[3]")
	private WebElement user;
	

	@FindBy(xpath="//input[@id='email']")
	private WebElement username;

	@FindBy(xpath="(//input[@id='pass'])[1]")
	private WebElement password;

	@FindBy(xpath="//button[@id='customerloginsubmit']")
	private WebElement loginButton;

	public login2(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);

	}
	public void enterusername() {
		user.click();
		username.sendKeys("anujakamble37@gmail.com");
	

	}
	public void enterpassword() {
	password.sendKeys("Anuja123");
	}
	public void clickOnloginbutton() {
	loginButton.click();
	}

}
