package com.cleartrip.qa.util;

import java.util.concurrent.TimeUnit;

import com.cleartrip.qa.base.TestBase;

public class TestUtil extends TestBase {
	
	public static long PAGE_LOAD_TIMEOUT=20;
	public static long IMPLICIT_WAIT=10;
	
	
	public static void  SwitchFrame()
	{
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.switchTo().frame("modal_window");
	}

}
