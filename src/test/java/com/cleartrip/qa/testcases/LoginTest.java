package com.cleartrip.qa.testcases;

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
	
   
	lp.Sign();
	
}



@AfterMethod
public void teardown()
{
	//driver.quit();
}

    

}
