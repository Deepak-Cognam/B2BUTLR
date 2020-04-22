package com.B2BUTLR.script;

import java.io.FileNotFoundException;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.B2BUTLR.generic.baseLib;
import com.B2BUTLR.generic.screenShotLib;
import com.B2BUTLR.generic.waitStatementLib;
import com.B2BUTLR.generic.yamlReader;
import com.B2BUTLR.pageobject.loginPage;
import com.B2BUTLR.pageobject.signUpPage;

public class signUptest extends baseLib{
	
	@Test(priority=1)
	public void createAccBtn()
	{
		loginPage lp = new loginPage(driver);
		lp.clickonCreateAccBtn();		
	}
	
	@Test(priority=3)
	public void ValidSignUp() throws FileNotFoundException {
		
		
		
		String company = yamlReader.getValue("signUp.TC_01.company");
		String firstName = yamlReader.getValue("signUp.TC_01.firstName");
		String lastName = yamlReader.getValue("signUp.TC_01.lastname");
		String title = yamlReader.getValue("signUp.TC_01.title");
	    String businessEmail = yamlReader.getValue("signUp.TC_01.businessEmail");
		String phone = yamlReader.getValue("signUp.TC_01.phoneNo");
		String userName = yamlReader.getValue("signUp.TC_01.UserName");
		String password = yamlReader.getValue("signUp.TC_01.password");
		
		signUpPage sUp = new signUpPage(driver);
		sUp.validSignUp(company, firstName, lastName, title, businessEmail, phone, userName, password);
		
		screenShotLib sc = new screenShotLib();
		sc.takeScreenShot(driver, "validSignUp");
		
	}
	
	@Test(priority=2)
	public void EmailExistSignUp() throws FileNotFoundException
	{
		
		String company = yamlReader.getValue("signUp.TC_02.company");
		String firstName = yamlReader.getValue("signUp.TC_02.firstName");
		String lastName = yamlReader.getValue("signUp.TC_02.lastname");
		String title = yamlReader.getValue("signUp.TC_02.title");
	    String businessEmail = yamlReader.getValue("signUp.TC_02.businessEmail");
		String phone = yamlReader.getValue("signUp.TC_02.phoneNo");
		String userName = yamlReader.getValue("signUp.TC_02.UserName");
		String password = yamlReader.getValue("signUp.TC_02.password");
		
		signUpPage sUp = new signUpPage(driver);
		sUp.emailExist(company, firstName, lastName, title, businessEmail, phone, userName, password);
		waitStatementLib.eWaitForVisisbility(driver, 2, sUp.getEmailExistsMsg());
		screenShotLib sc = new screenShotLib();
		sc.takeScreenShot(driver, "EmailExistSignUp");
		
	}
	
	
	

}
