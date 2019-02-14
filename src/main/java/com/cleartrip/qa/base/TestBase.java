package com.cleartrip.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class TestBase {
	
	static Properties prop;
	static WebDriver driver;
	
    public TestBase()
	{
    	try
    	{
    		
    		prop = new Properties();
    		
    	FileInputStream ip = new FileInputStream("C:\\Users\\savan\\eclipse-workspace\\ClearTrip\\src"
    			+ "\\main\\java\\com\\cleartrip\\qa\\config"+ "\\config.properties");
    	
    	  prop.load(ip);
    		
    		
    		
    	}
		catch(Exception e)
    	{
			e.printStackTrace();
    	}
	}
    
    public static void initialization()
    {
    	String browserName=prop.getProperty("Browser");
    	
    	   if(browserName.equalsIgnoreCase("ie"))
    	   {
    		   File file = new File("C:\\Users\\savan\\eclipse-workspace\\ClearTrip\\IEDriverServer.exe");
    			System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
    	 		driver =  new InternetExplorerDriver();
    	   }
    	   
    	   else if(browserName.equalsIgnoreCase("chrome"))
    	   {
    		   File file = new File("C:\\Users\\savan\\eclipse-workspace\\ClearTrip\\chromedriver.exe");
   			   System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
   	 		    driver =  new ChromeDriver();
   	 		 }
    	   
    	   
  	             driver.manage().window().maximize();
  	             driver.manage().deleteAllCookies();
  	             driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
  	             driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  	             driver.get(prop.getProperty("URL"));
    		   
    }
    
    }


