package com.B2BUTLR.script;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.B2BUTLR.generic.baseLib;
import com.B2BUTLR.generic.waitStatementLib;
import com.B2BUTLR.generic.yamlReader;
import com.B2BUTLR.pageobject.signUpPage;

public class signUptest extends baseLib{
	
	@Test
	public void signUpValid()
	{
		HashMap<String,String> Fields = new HashMap<String,String>();
		Fields.put("company", " ");		
		Fields.put("firstName", " ");
		Fields.put("lastname", " ");
		Fields.put("title", " ");
		Fields.put("businessEmail", " ");
		Fields.put("phoneNo", " ");
		Fields.put("password", " ");
		
		
		String ss = yamlReader.yamlreader(Fields,"signUpValid");
		signUpPage sUp = new signUpPage(driver); 
		sUp.Signup(Fields);  
	}
	
	@Test
	public void signUpFieldValidation()
	{
		HashMap<String,String> Fields = new HashMap<String,String>();
		Fields.put("company", " ");	
		Fields.put("firstName", " ");
		Fields.put("lastname", " ");
		Fields.put("title", " ");
		Fields.put("businessEmail", " ");
		Fields.put("phoneNo", " ");
		Fields.put("password", " ");
		
		
		String ss = yamlReader.yamlreader(Fields,"signUpFieldValidation");
		signUpPage sUp = new signUpPage(driver); 
		sUp.Signup(Fields);  
		waitStatementLib.eWaitForVisisbility(driver, 2, sUp.getInvalidCompanyMsg());
		waitStatementLib.eWaitForVisisbility(driver, 2, sUp.getInvalidFirstnameMsg());
		waitStatementLib.eWaitForVisisbility(driver, 2, sUp.getInvalidLastNameMsg());
		waitStatementLib.eWaitForVisisbility(driver, 2, sUp.getInvalidTitleMsg());
		waitStatementLib.eWaitForVisisbility(driver, 2, sUp.getInvalidBusinessEmailMsg());
		waitStatementLib.eWaitForVisisbility(driver, 2, sUp.getInvalidPhoneMsg());
		waitStatementLib.eWaitForVisisbility(driver, 2, sUp.getInvalidpasswordMsg());

	}
	
	

}
