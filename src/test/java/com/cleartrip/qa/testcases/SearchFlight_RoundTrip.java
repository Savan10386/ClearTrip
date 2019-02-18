package com.cleartrip.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cleartrip.qa.base.TestBase;
import com.cleartrip.qa.pages.SearchFlight;

public class SearchFlight_RoundTrip extends TestBase
{
	SearchFlight sf;
	public SearchFlight_RoundTrip()
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
	
	
	@Test(priority=1)
	public void pageTitle()
	{
	String title=	sf.ValidateSearchFlightTitle();
		
		Assert.assertEquals(title,"#1 Site for Booking Flights, Hotels, Packages, Trains & Local activities." );
	}
	
	@Test(priority=2)
	public void clickRoundTrip()
	{
		
	}
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}