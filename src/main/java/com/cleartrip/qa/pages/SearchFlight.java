package com.cleartrip.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cleartrip.qa.base.TestBase;

public class SearchFlight extends TestBase {
	
	
	//page factory method
	
	@FindBy(className="flightApp")	WebElement clickFlights;
	
	@FindBy(linkText="Your trips")	WebElement yourTrips;
	
	@FindBy(xpath="//span[text()='Home']")	WebElement logoImage;
	
	@FindBy(xpath="//input[@id='SignIn']")	WebElement SignIn;
	
	@FindBy(id="RoundTrip")	WebElement RoundTrip;
	
	
	
	public SearchFlight()
	{
		PageFactory.initElements(driver,this);
	}
	
	public String ValidateSearchFlightTitle()
	{
		return driver.getTitle();
		
		
	}
	
	public void clickRoundTrip()
	{
		RoundTrip.click();
	}
	
	public boolean clickTrip()
	{
		yourTrips.click();
		
		return SignIn.isDisplayed();
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
