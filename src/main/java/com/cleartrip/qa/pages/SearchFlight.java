package com.cleartrip.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cleartrip.qa.base.TestBase;

public class SearchFlight extends TestBase {
	
	
	//page factory method
	
	@FindBy(className="flightApp")	WebElement clickFlights;
	
	@FindBy(linkText="Your trips")	WebElement yourTrips;
	
	@FindBy(xpath="//span[@className='cleartripLogo']")	WebElement logoImage;
	
	@FindBy(xpath="//input[@id='SignIn']")	WebElement SignIn;
	
	public SearchFlight()
	{
		PageFactory.initElements(driver,this);
	}
	
	public String ValidateSearchFlightTitle()
	{
		return driver.getTitle();
		
		
	}
	
	public void clickTrip()
	{
		yourTrips.click();
		
	}

	public void signClick()
	{
		SignIn.click();
		
	}
	
	public boolean verifyLogo()
	{
		return logoImage.isDisplayed();
	}
}
