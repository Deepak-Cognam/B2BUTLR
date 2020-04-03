package com.B2BUTLR.scripts;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.B2BUTLR.generic.baseLib;
import com.B2BUTLR.generic.yamlReader;
import com.B2BUTLR.pageobject.signUpPage;



public class signUpTest extends baseLib {
	
	@Test
	public void signUp()
	{
		HashMap<String,String> Fields = new HashMap<String,String>();
		Fields.put("email", " ");
		Fields.put("firstName", " ");
		Fields.put("lastname", " ");
		Fields.put("company", " ");
		Fields.put("country", " ");
		Fields.put("phoneNo", " ");
		
		
		String ss = yamlReader.yamlreader(Fields,"login");
		signUpPage sUp = new signUpPage(driver); 
		sUp.Signup(Fields);
	
      
      
	}
    

}
