package newSite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class newSiteLogin {
	
		WebDriver driver;

		@FindBy(xpath="(//li[@data-label='or'])[1]")
		private WebElement login;

		public  newSiteLogin (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
		public void clickonsignin() {
		login.click();
		}
		}

	


