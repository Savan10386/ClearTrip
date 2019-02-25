package com.cleartrip.qa.testcases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.cleartrip.qa.base.TestBase;
import com.cleartrip.qa.pages.LoginPage;
import com.cleartrip.qa.pages.SearchFlight;
import com.cleartrip.qa.util.TestUtil;


public class LoginTest extends TestBase {
	
	LoginPage lp;
	
	SearchFlight sf;
	
public LoginTest()
	{
		super();
	}

@BeforeMethod
public void setUp()
{
	initialization();
	
	lp=  new LoginPage();
	
}

@Test(priority=1)
public void Login() {
	
   
	sf=lp.Sign(prop.getProperty("username"),prop.getProperty("password"));
	
	
	assertEquals("savanvadalia10386@gmail.com",driver.findElement(By.xpath("//*[@id='userAccountLink']/span[2]")).getText());
	
}



@AfterMethod
public void teardown()
{
	driver.quit();
}

    

}
