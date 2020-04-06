package com.B2BUTLR.pageobject;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class signUpPage {
	
	@FindBy(xpath = "//input[@name='companyName']")
	private WebElement Company;
	@FindBy(xpath = "//input[@name='firstName']")
	private WebElement FirstNameTxBx;
	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement LastNameTxBx;
	@FindBy(xpath = "//input[@name='title']")
	private WebElement Title;
	@FindBy(xpath = "//input[@name='businessEmail']")
	private WebElement BusinessEmail;
	@FindBy(xpath = "//input[@name='phone']")
	private WebElement PhoneTxBx;
	@FindBy(xpath="//span[text()='Create Account']")
	private WebElement SubmitBtn;
	@FindBy(xpath="//input[@name='password']")
	private WebElement Password;
	@FindBy(xpath = "//p[text()='Company name length must be between 2 to 60.']")
	private WebElement CompanyTxBxValidMsg;
	@FindBy(xpath = "//p[text()='Company name length must be between 2 to 60.']")
	private WebElement FirstNameTxBxValidMsg;
	@FindBy(xpath = "//p[text()='Company name length must be between 2 to 60.']")
	private WebElement LastnameTxBxValidMsg;
	@FindBy(xpath = "//p[text()='Company name length must be between 2 to 60.']")
	private WebElement TitleTxBxValidMsg;
	@FindBy(xpath = "//p[text()='Company name length must be between 2 to 60.']")
	private WebElement BusinessEmailTxBxValidMsg;
	@FindBy(xpath = "//p[text()='Company name length must be between 2 to 60.']")
	private WebElement PhoneTxBxValidMsg;
	@FindBy(xpath = "//p[text()='Company name length must be between 2 to 60.']")
	private WebElement passwordTxBxValidMsg;
	
	
	public WebElement getInvalidCompanyMsg() {
		return CompanyTxBxValidMsg;
	}
	
	public WebElement getInvalidFirstnameMsg() {
		return FirstNameTxBxValidMsg;
	}
	
	public WebElement getInvalidLastNameMsg() {
		return LastnameTxBxValidMsg;
	}
	
	public WebElement getInvalidTitleMsg() {
		return TitleTxBxValidMsg;
	}
	
	public WebElement getInvalidBusinessEmailMsg() {
		return BusinessEmailTxBxValidMsg;
	}
	
	public WebElement getInvalidPhoneMsg() {
		return PhoneTxBxValidMsg;
	}
	
	public WebElement getInvalidpasswordMsg() {
		return passwordTxBxValidMsg;
	}
	
	
	
	
	
 public signUpPage(WebDriver driver)
	{
	  PageFactory.initElements(driver, this);
	}
	
	public void Signup(HashMap<String,String> Fields)
	{
	
		Company.sendKeys(Fields.get("company"));
		FirstNameTxBx.sendKeys(Fields.get("firstName"));
		LastNameTxBx.sendKeys(Fields.get("lastname"));
		Title.sendKeys(Fields.get("title"));
		BusinessEmail.sendKeys(Fields.get("businessEmail"));
		PhoneTxBx.sendKeys(Fields.get("phoneNo"));
		Password.sendKeys(Fields.get("password"));
	    SubmitBtn.click();
	    
	  }
	
	public void verifyingTxBxMsg(HashMap<String,String> Fields)
	{
		Company.sendKeys(Fields.get("company"));
		String compTxBxExpMsg = "Company name length must be between 2 to 60.";
		String compTxBxActMsg = CompanyTxBxValidMsg.getText();
		Assert.assertEquals(compTxBxExpMsg, compTxBxActMsg);
		Reporter.log("Invalid Company text msg is verified",true);
		
		FirstNameTxBx.sendKeys(Fields.get("firstName"));
		String FirstNameTxBxExpMsg = "Company name length must be between 2 to 60.";
		String FirstNameTxBxActMsg = CompanyTxBxValidMsg.getText();
		Assert.assertEquals(FirstNameTxBxExpMsg, FirstNameTxBxActMsg);
		Reporter.log("Invalid FirstName text msg is verified",true);
		
		LastNameTxBx.sendKeys(Fields.get("lastname"));
		String LastNameTxBxExpMsg = "Company name length must be between 2 to 60.";
		String LastNameTxBxActMsg = CompanyTxBxValidMsg.getText();
		Assert.assertEquals(LastNameTxBxExpMsg, LastNameTxBxActMsg);
		Reporter.log("Invalid LastName text msg is verified",true);
		
		Title.sendKeys(Fields.get("title"));
		String TitleTxBxExpMsg = "Company name length must be between 2 to 60.";
		String TitleTxBxActMsg = CompanyTxBxValidMsg.getText();
		Assert.assertEquals(TitleTxBxExpMsg, TitleTxBxActMsg);
		Reporter.log("Invalid title text msg is verified",true);
		
		BusinessEmail.sendKeys(Fields.get("businessEmail"));
		String BusinessEmailTxBxExpMsg = "Company name length must be between 2 to 60.";
		String BusinessEmailTxBxActMsg = CompanyTxBxValidMsg.getText();
		Assert.assertEquals(BusinessEmailTxBxExpMsg, BusinessEmailTxBxActMsg);
		Reporter.log("Invalid BusinessEmail text msg is verified",true);
		
		PhoneTxBx.sendKeys(Fields.get("phoneNo"));
		String PhoneTxBxExpMsg = "Company name length must be between 2 to 60.";
		String PhoneTxBxActMsg = CompanyTxBxValidMsg.getText();
		Assert.assertEquals(PhoneTxBxExpMsg, PhoneTxBxActMsg);
		Reporter.log("Invalid Phone text msg is verified",true);
		
		Password.sendKeys(Fields.get("password"));
		String PasswordTxBxExpMsg = "Company name length must be between 2 to 60.";
		String PasswordTxBxActMsg = CompanyTxBxValidMsg.getText();
		Assert.assertEquals(PasswordTxBxExpMsg, PasswordTxBxActMsg);
		Reporter.log("Invalid Password text msg is verified",true);
	   // SubmitBtn.click();
	}

}
