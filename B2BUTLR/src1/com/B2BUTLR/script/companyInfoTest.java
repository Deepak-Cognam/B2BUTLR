package com.B2BUTLR.script;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import com.B2BUTLR.generic.baseLib;
import com.B2BUTLR.generic.yamlReader;
import com.B2BUTLR.pageobject.companyInformation;
import com.B2BUTLR.pageobject.completeApplicationPage;
import com.B2BUTLR.pageobject.confirmIdentity;
import com.B2BUTLR.pageobject.loginPage;







public class companyInfoTest extends baseLib{
	
	//@Test(priority=1)
	//public void login() throws FileNotFoundException
	//{
//		String username = yamlReader.getValue("login.TC_01.username");
	//	String password = yamlReader.getValue("login.TC_01.password");
		
	//	loginPage lp = new loginPage(driver);
//		lp.login(username, password);
		
//	}
	
	//@Test(priority=2)
//	public void confirmIdentity() throws FileNotFoundException
//	{
//		String mfa = yamlReader.getValue("mfa");
//		confirmIdentity ci = new confirmIdentity(driver);
//		ci.mfa(mfa);
		
//	}
	
	//@Test(priority=3)
//	public void applicationCompInfo()
	//{
	//	completeApplicationPage cap = new completeApplicationPage(driver);
	//	cap.CompanyInformation();
	//}
	
	@Test
	public void validCompInfo() throws FileNotFoundException
	{
		String username = yamlReader.getValue("login.TC_01.username");
		String password = yamlReader.getValue("login.TC_01.password");
		
		loginPage lp = new loginPage(driver);
		lp.login(username, password);
		
		String mfa = yamlReader.getValue("mfa");
		confirmIdentity ci = new confirmIdentity(driver);
		ci.mfa(mfa);
		
		completeApplicationPage cap = new completeApplicationPage(driver);
		cap.CompanyInformation();
	
		String regAdd = yamlReader.getValue("CompanyInfo.TC_01.address");
		String phonNo = yamlReader.getValue("CompanyInfo.TC_01.phoneNo");
		String compWeb = yamlReader.getValue("CompanyInfo.TC_01.website");
		String fedId = yamlReader.getValue("CompanyInfo.TC_01.federalId");
		
		companyInformation ci1 = new companyInformation(driver);
		ci1.validCompInfo(regAdd, phonNo, compWeb, fedId);
	}

}
