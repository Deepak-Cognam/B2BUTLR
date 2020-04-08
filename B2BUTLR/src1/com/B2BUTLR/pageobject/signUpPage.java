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
	private WebElement CompanyTxBx;
	@FindBy(xpath = "//input[@name='firstName']")
	private WebElement FirstNameTxBx;
	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement LastNameTxBx;
	@FindBy(xpath = "//input[@name='title']")
	private WebElement TitleTxBx;
	@FindBy(xpath = "//input[@name='businessEmail']")
	private WebElement BusinessEmailTxBx;
	@FindBy(xpath = "//input[@name='phone']")
	private WebElement phoneTxBx;
	@FindBy(xpath="//span[text()='Create Account']")
	private WebElement SubmitBtn;
	@FindBy(xpath="//input[@name='password']")
	private WebElement PasswordTxBx;
	@FindBy(xpath = "//input[@name='username']")
	private WebElement usernameTxBx;
	
	@FindBy(xpath = "//p[text()='already exists']")
	private WebElement emailExists;
	@FindBy(xpath = "//p[text()='Username already exists.']")
	private WebElement UserNameExistMsg;
	
	public WebElement getUserNameExistMsg() {
		return UserNameExistMsg;
	}
	
	public WebElement getEmailExistsMsg() {
		return emailExists;
	}
	
		
 public signUpPage(WebDriver driver)
	{
	  PageFactory.initElements(driver, this);
	}
 
  public void validSignUp(String company, String firstName, String lastName, String title, String businessEmail, String phone, String userName, String password)
  {
	  CompanyTxBx.sendKeys(company);
	  FirstNameTxBx.sendKeys(firstName);
	  LastNameTxBx.sendKeys(lastName);
	  TitleTxBx.sendKeys(title);
	  BusinessEmailTxBx.sendKeys(businessEmail);
	  phoneTxBx.sendKeys(phone);
	  usernameTxBx.sendKeys(userName);
	  PasswordTxBx.sendKeys(password);
	  SubmitBtn.click();
  }
  
   public void emailExist(String company, String firstName, String lastName, String title, String businessEmail, String phone, String userName, String password)
   {
	   CompanyTxBx.sendKeys(company);
		  FirstNameTxBx.sendKeys(firstName);
		  LastNameTxBx.sendKeys(lastName);
		  TitleTxBx.sendKeys(title);
		  BusinessEmailTxBx.sendKeys(businessEmail);
		  phoneTxBx.sendKeys(phone);
		  usernameTxBx.sendKeys(userName);
		  PasswordTxBx.sendKeys(password);
		  
		  String expMsg="Username already exists.";
			String actMsg=UserNameExistMsg.getText();
			Assert.assertEquals(actMsg, expMsg);
			Reporter.log("usename exists msg is verified",true);
   }
	
	}
