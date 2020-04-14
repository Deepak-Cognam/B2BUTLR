package com.B2BUTLR.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class screenShotLib {

	
	public void takeScreenShot(WebDriver driver, String scriptName)
	{
	EventFiringWebDriver efw = new EventFiringWebDriver(driver);
	File srcFile = efw.getScreenshotAs(OutputType.FILE);
	File destFile = new File("./sceenshot/"+scriptName+".png");
	
	try
	{
		FileUtils.copyFile(srcFile, destFile);
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	
	}
	
}
