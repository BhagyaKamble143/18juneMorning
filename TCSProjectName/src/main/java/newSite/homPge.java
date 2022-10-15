package newSite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class homPge {
	
		WebDriver driver;
		@FindBy(xpath="//span[text()='Eyeglasses']")
		private WebElement Eyeglasses;
		@FindBy(xpath="(//a[@href='https://www.titaneyeplus.com/eyeglasses-women.html'])[1]")
		private WebElement women;
		@FindBy(xpath="(//select[@id='sorter'])[1]")
		private WebElement select;
		@FindBy(xpath="(//img[@alt='Black Cateye Women Eyeglasses (FT1397WFP3MBKV|50)'])[1]")
		private WebElement Blue;

		public homPge (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

		public void moveonEyeglasses() {
		Actions eye=new Actions(driver);
		eye.moveToElement((WebElement) eye).perform();
		}
		public void clickonwomen() {
		women.click();
		}
		public void selectposition(){
		Select s=new Select(select);
		s.selectByIndex(1);
		}
		public void clickonBlue() {
		Blue.click();

		}


		}


