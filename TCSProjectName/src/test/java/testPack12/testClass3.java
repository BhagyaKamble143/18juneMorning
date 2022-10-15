package testPack12;

import org.testng.annotations.Test;

public class testClass3 {
	@Test (groups="regression1")
	public void TC01() {
		
		System.out.println("testClass3 TC01");
	}
	@Test (groups="regression2")
	public void TC02() {
		
		System.out.println("testClass3 TC02");
	}
	@Test
	public void TC03() {
		
		System.out.println("testClass3 TC03");
	}
	@Test 
	public void TC04() {
		
		System.out.println("testClass3 TC04");
	}

}
