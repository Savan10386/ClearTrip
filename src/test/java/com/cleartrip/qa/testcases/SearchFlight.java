package com.cleartrip.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cleartrip.qa.base.TestBase;

public class SearchFlight extends TestBase
{
	SearchFlight sf;
	public SearchFlight()
	{
		
		super();
		
		System.out.println("Super");
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		
		sf= new SearchFlight();
	}
	
	
	@Test
	public void pageTitle()
	{
		
	}
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
