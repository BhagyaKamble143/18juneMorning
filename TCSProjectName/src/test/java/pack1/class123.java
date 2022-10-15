package pack1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class123 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
						
		WebDriver driver = new ChromeDriver(); //Browser Launch
    driver.get("https://www.flipkart.com/account/login?ret=/account/login%3Fsignup%3Dtrue");//URL Insert
          Thread.sleep(2000);
    driver.manage().window().maximize();
    System.out.println("velocity");
}
}