package asseration;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertClass12 {
	
	String actRslt="facebook.com";
	String expRslt="facebook.com";
	String actRslt2="google.com";
	
	SoftAssert soft = new SoftAssert ();
	
	
	@Test
	public void TC01() {
	
		soft.assertEquals(actRslt, expRslt);
		System.out.println("Asseration 1");
		soft.assertNotEquals(actRslt2, expRslt );
		System.out.println("Asseration 2");
		soft.assertTrue(true ,"Asseration failed  due to ");
		System.out.println("Asseration 3");
		soft.assertFalse(false);
		System.out.println("Asseration 4");
		soft.assertAll();
		
        }
	@Test
	public void TC02() {
		soft.assertEquals(actRslt2, expRslt,"Asseration failed due to ");
		System.out.println("TC02 Asseration 1");
		soft.assertNotEquals(actRslt2, expRslt );
		System.out.println("Asseration 2");
		soft.assertTrue(true);
		System.out.println("Asseration 3");
		soft.assertFalse(false);
		System.out.println("Asseration 4");
		soft.assertAll();
}
}