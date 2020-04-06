package com.B2BUTLR.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class screenShotLib {

	
	static String filepath = "./config.properties";
	/**
	 * @description read value from properties file based on key
	 * @param key
	 * @return
	 */
	public static String getValue(String key)
			{
		String value = null;
		try
		{
		Properties prop = new Properties();
		prop.load(new FileInputStream(new File(filepath)));
		value = prop.getProperty(key);
		}
		catch(FileNotFoundException e)
		{
		e.printStackTrace();	
		}
		catch(IOException e)
		{
		e.printStackTrace();	
		}
		return value;
		
	}

	
}
