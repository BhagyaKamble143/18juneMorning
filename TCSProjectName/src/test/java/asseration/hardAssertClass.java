package asseration;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hardAssertClass {
	String actRslt="facebook.com";
	String expRslt="facebook.com";
	String actRslt2="google.com";
	
	@Test
	public void TC01() {
		Assert.assertEquals(actRslt, expRslt, "Assertion failed due to ");
		System.out.println("Assertion1");
		Assert.assertNotEquals(actRslt2,expRslt);
		System.out.println("Assertion2");
	    Assert.assertTrue(true,"Assertion failed due to ");
	    System.out.println("Assertion3");
        Assert.assertFalse(false);
        System.out.println("Assertion4");
        }
	@Test
	public void TC02() {
		Assert.assertEquals(actRslt, expRslt);
		System.out.println("TC02 Assertion1");
		Assert.assertNotEquals(actRslt2,expRslt);
		System.out.println("TC02 Assertion2");
	    Assert.assertTrue(true);
	    System.out.println("TC02 Assertion3");
        Assert.assertFalse(false);
        System.out.println("TC02 Assertion4");
        }
	
}
