package amzonLogin;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {
	WebDriver driver;
	@FindBy(xpath="//span[text()='Account & Lists']")
	private WebElement yourAccount;
	@FindBy(xpath="//span[text()='Sign Out']")
	private WebElement SignOut;
	public LogOut(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	public void ClickOnYourAccount() {
driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		Actions W=new Actions (driver);
		W.moveToElement(yourAccount).perform();
	}
	public void ClickOnSignOut() {
		SignOut.click();
	}
}
