package amzonLogin;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class addToCartPge {
	WebDriver driver;
	
	@FindBy(xpath="//select[@name='dropdown_selected_size_name']")
	private WebElement selectSize;
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	private WebElement addToCard ;
	
	@FindBy(xpath="//div[@id='nav-cart-count-container']")
	private WebElement gobackCart ;
	
	public addToCartPge(WebDriver driver) {
	this.driver=driver;	
	PageFactory.initElements(driver, this);
	}
	
	
	 public void swichToWindow() {
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		 ArrayList<String> aL= new ArrayList<String>(driver.getWindowHandles());
		 driver.switchTo().window(aL.get(1));
		 }
    	 
     public void selectSize() {
    	 Select S1=new Select(selectSize);
    	 S1.selectByVisibleText("M");
     }
     public void clickOnaddToCart() throws IOException {
                
    	       Actions Wc = new Actions(driver);
    	    	 Wc.click(addToCard).perform();
     }	 
    	 
     public void clickOngobackcart() {
    	 Actions Wc = new Actions(driver);
    	 Wc.click(gobackCart ).perform();
    	 
     }	 
    	  

}
