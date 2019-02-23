package com.cleartrip.qa.pages;

import org.openqa.selenium.WebDriver.Window;

import java.util.Iterator;
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
	
	
	
	
	public LoginPage()
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void Sign()
	{
		
	String parentWindow=driver.getWindowHandle();
			
		SignIn.click();
				
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
	   Set<String> AllWindows=	driver.getWindowHandles();
	   
	   Iterator<String> i1= AllWindows.iterator();
	   
	   while (i1.hasNext()) {
		   
		String childWindow =  i1.next();
		
		     if(!parentWindow.equalsIgnoreCase(childWindow))
		     {
		    	 driver.switchTo().window(childWindow);
		    	 
		    	  Username.sendKeys("Savab");
		    	 
		     }
		
	}
	   
	   
	         
		
	}
	


}
