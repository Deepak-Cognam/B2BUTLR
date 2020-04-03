package com.B2BUTLR.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;




public class baseLib {
	
public  WebDriver driver;
	
	@BeforeClass
	
	public void setup()
	{
		String browserName = genericLib.getValue("browser");
	 
	if(browserName.equalsIgnoreCase("firefox"))
	{
    System.setProperty("webdriver.gecko.driver", "./Source/exefiles/geckodriver.exe");
	driver = new FirefoxDriver();
	Reporter.log("Firefox launched", true);
	}
	else if(browserName.equalsIgnoreCase("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "./Source/exefiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("Chrome launched", true);
	}
	else if(browserName.equalsIgnoreCase("ie"))
	{
		System.setProperty("webdriver.ie.driver", "./Source/exefiles/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		Reporter.log("internetexplorer launched", true);
	}
	
	String envName = genericLib.getValue("env");
	
	if(envName.equalsIgnoreCase("DEV"))
	{
		driver.navigate().to(genericLib.getValue("testurl"));
	}
	else if(envName.equalsIgnoreCase("QA"))
	{
		driver.navigate().to(genericLib.getValue("testurl1"));
	}
	else if(envName.equalsIgnoreCase("UAT"))
	{
		driver.navigate().to(genericLib.getValue("testurl2"));
	}
	waitStatementLib.iWaitForSec(driver, 30);
	}



}
