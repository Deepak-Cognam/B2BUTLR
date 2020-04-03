package com.B2BUTLR.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class baseLib {
	
	public WebDriver driver;//fianl driver   a
	@BeforeMethod
	public void  setUp()
	{
		String browserName = genericLib.getValue("browser");
		if(browserName.equalsIgnoreCase("firefox"))
		{
			 driver = new FirefoxDriver();
			 Reporter.log("Firefox Launched", true);
		}
		else if (browserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chromedriver", "./exefiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("Chrome launched", true);
			
		}
		else if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.iedriver", "./exefiles/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			Reporter.log("ie", true);
			
		}
		waitStatementLib.iWaitForSec(driver, 20);
		driver.navigate().to(genericLib.getValue("testurl"));
	}

	@AfterMethod
	public void tearDown(ITestResult result )
	{
		String scriptName = result.getMethod().getMethodName();
		if (result.isSuccess()) //true
		{
			System.out.println(scriptName+"Script pass");
		}
		else //fail
		{
			System.out.println(scriptName+"script fail");
			screenShotLib slib = new screenShotLib();
			slib.tekeScreenShot(driver, scriptName);
			Reporter.log("browser closed", true);
		}
		driver.quit();

	}



}
