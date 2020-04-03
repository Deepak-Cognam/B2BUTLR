package com.B2BUTLR.pageobject;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signUpPage {
	

	@FindBy(id = "GeneralContent_C067_ctl00_ctl00_tbEmail")
	private WebElement EmailTxBx;
	@FindBy(id = "GeneralContent_C067_ctl00_ctl00_tbFirstName")
	private WebElement FirstNameTxBx;
	@FindBy(id = "GeneralContent_C067_ctl00_ctl00_tbLastName")
	private WebElement LastNameTxBx;
	@FindBy(id = "GeneralContent_C067_ctl00_ctl00_tbCompanyName")
	private WebElement CompanyNameTxBx;
	@FindBy(id = "GeneralContent_C067_ctl00_ctl00_ddlCountry")
	private WebElement CountryTxBx;
	@FindBy(id = "GeneralContent_C067_ctl00_ctl00_tbPhone")
	private WebElement PhoneTxBx;
	@FindBy(id = "GeneralContent_C067_ctl00_ctl00_btnSubmit")
	private WebElement SubmitBtn;
	
	
	
	
 public signUpPage(WebDriver driver)
	{
	  PageFactory.initElements(driver, this);
	}
	
	public void Signup(HashMap<String,String> Fields)
	{
		System.out.println(Fields.get("country"));
		EmailTxBx.sendKeys(Fields.get("email"));
		FirstNameTxBx.sendKeys(Fields.get("firstName"));
		LastNameTxBx.sendKeys(Fields.get("lastname"));
		CompanyNameTxBx.sendKeys(Fields.get("company"));
		CountryTxBx.sendKeys(Fields.get("country"));
		PhoneTxBx.sendKeys(Fields.get("phoneNo")); 
	    SubmitBtn.click();
	    
	    
		
	}

}
