package com.B2BUTLR.script;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import com.B2BUTLR.generic.baseLib;
import com.B2BUTLR.generic.yamlReader;
import com.B2BUTLR.pageobject.loginPage;

public class loginTest extends baseLib{
	
	@Test(priority=2)
	public void validlogin() throws FileNotFoundException
	{
		String username = yamlReader.getValue("login.TC_01.username");
		String password = yamlReader.getValue("login.TC_01.password");
		
		loginPage lp = new loginPage(driver);
		lp.login(username, password);
		
	}
	@Test(priority=1)
	public void inValidLogin() throws FileNotFoundException
	{
		String username = yamlReader.getValue("login.TC_02.username");
		String password = yamlReader.getValue("login.TC_02.password");
		
		loginPage lp = new loginPage(driver);
		lp.invalidLogin(username, password);
	}

}
