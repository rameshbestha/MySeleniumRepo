package com.selenium.core.ddf.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestA {
	
	@Test(priority=1)
	public void testA1(){
		Assert.fail();
	}
	
	@Test(priority=2,dependsOnMethods={"testA1"})
	public void testA2(){
		System.out.println("Second test");
		
	}
	
	@Test(priority=3,dependsOnMethods={"testA1","testA2"})
	public void testA3(){
		
	}
	
	@AfterMethod
	public void quit(){
		
	}
	
}
