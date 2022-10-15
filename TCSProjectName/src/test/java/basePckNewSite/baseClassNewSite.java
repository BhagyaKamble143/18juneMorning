package basePckNewSite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class baseClassNewSite {
	public static WebDriver driver;
	public static void lunchBrowser(String browser) {
		if(browser.equalsIgnoreCase("Chrome")) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			 driver =new ChromeDriver();
		}else if(browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.chrome.driver", 
					
					"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
									
					driver = new EdgeDriver(); //Browser Launch
		}
			driver.get("https://www.titaneyeplus.com/");
			 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			
	}
	public static void closeAllBrowser() {
		
	  driver.quit();
	}
}
