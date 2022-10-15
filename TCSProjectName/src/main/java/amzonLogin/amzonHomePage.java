package amzonLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amzonHomePage {
	WebDriver driver;

	@FindBy(xpath="(//span[text()='All'])[2]")
	private WebElement clickall ;
	@FindBy(xpath="//a[@data-menu-id='10']")
	private WebElement Fashions;
	@FindBy(xpath="//a[text()='T-shirts & Polos']")
	private WebElement Tshirts;
	@FindBy(xpath="//span[text()='Hooded Neck']")
	private WebElement hoodedNeck;
	@FindBy(xpath="(//span[text()=\"Men's Regular Fit T-Shirt\"])[1]")
	private WebElement image;
	 
	public amzonHomePage(WebDriver driver) {
	this.driver=driver;	
	PageFactory.initElements(driver, this);
		}
	
     public void ClickOnAll() {
  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    	 clickall.click();
     }
     public void ClickOnMenFashions() {
		 Fashions.click();
	}
     public void clickOnTshirtsPolos() {
    	 Tshirts.click();
    	 
     }
     public void ClickOnHoodedNeck() {
	    	 
	    	 hoodedNeck.click();
	     }
     public void clickOnimage() {
   
    	image.click();
    	 
     }

}
