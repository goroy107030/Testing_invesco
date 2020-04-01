package com.test.Invesco;

import org.testng.annotations.*;

public class SmokeSuite {
	
	
	
	@BeforeMethod
	public void init() {
		System.out.println("I am in Before Method");
	}
	
	@AfterMethod
	public void trailing() {
		System.out.println("I am in After Method");
	}
	
	@Test
	public void outTest() {
		System.out.println("I am in Test");
	}

}
