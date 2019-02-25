package com.cleartrip.qa.testcases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cleartrip.qa.base.TestBase;
import com.cleartrip.qa.pages.LoginPage;
import com.cleartrip.qa.pages.SearchFlight;

public class SearchFlight_RoundTrip extends TestBase
{
	SearchFlight sf;
	LoginPage lp;
	public SearchFlight_RoundTrip()
	{
		
		super();
		
		System.out.println("Super");
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		
		lp=new LoginPage();
		sf=lp.Sign(prop.getProperty("username"),prop.getProperty("password"));
		
	}
	
	@Test(priority=1)
	public void VerifyLogo() {
		
	Boolean logo=sf.verifyLogo();
	
	Assert.assertTrue(logo);
		
	}
	
	@Test(priority=2)
	public void pageTitle()
	{
	   String title=sf.ValidateSearchFlightTitle();
		
		Assert.assertEquals(title,"#1 Site for Booking Flights, Hotels, Packages, Trains & Local activities." );
	}
	
	@Test(priority=3)
	public void clickRoundTrip()
	{
	   sf.clickRoundTrip();	
	   
	   assertTrue(driver.findElement(By.id("RoundTrip")).isSelected());
	}
	
	
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
