package com.cleartrip.qa.pages;

import org.openqa.selenium.WebDriver.Window;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cleartrip.qa.base.TestBase;
import com.cleartrip.qa.util.TestUtil;

public class LoginPage extends TestBase {
	
	@FindBy(linkText="Your trips")	WebElement yourTrips;
	
	@FindBy(xpath="//input[@id='SignIn']")	WebElement SignIn;
	
	@FindBy(id="email") WebElement Username;
	
	@FindBy(id="password") WebElement passwrd;
	
	@FindBy(id="signInButton") WebElement SigButton;
	
	
	
	
	public LoginPage()
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	public SearchFlight Sign(String username, String password)
	{
		
	
		yourTrips.click();
					
		SignIn.click();
				
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		  driver.switchTo().frame("modal_window");
					
		Username.sendKeys(username);
		
		passwrd.sendKeys(password);
		
		SigButton.click();
	 
		return new SearchFlight();
	}
	   
	   
	         
		
	}
	



