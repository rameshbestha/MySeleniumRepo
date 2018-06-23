package com.selenium.core.ddf.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestA {
	
	@Test(priority = 1)
	public void testa1() {
		
	}
	
	@Test(priority = 2, dependsOnMethods={"testa1"})
	public void testa2() {
		
	}
	
	@Test(priority = 2, dependsOnMethods={"testa1","testa2"})
	public void testa3() {
		
	}
	@AfterMethod
	public void quit() {
		
	}
	
}
