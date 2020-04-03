package com.B2BUTLR.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitStatementLib {
	
	public static void iSleep(int Sec)
	{
		try
		{
		Thread.sleep(Sec*100);
		}
		catch(InterruptedException e)
		{
		e.printStackTrace();	
		}
	}
	public static void iWaitForSec(WebDriver driver, int Sec)
	{
		driver.manage().timeouts().implicitlyWait(Sec, TimeUnit.SECONDS);
	}
	public static void eWaitForVisisbility(WebDriver driver, int Sec, WebElement ele)
	{
	WebDriverWait wait = new WebDriverWait(driver, Sec);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(ele)));
	}
	public static void  eWaitForTitle(WebDriver driver, int Sec, String Title)
	{
		WebDriverWait wait = new WebDriverWait(driver, Sec);
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.titleIs(Title)));
	}


}
