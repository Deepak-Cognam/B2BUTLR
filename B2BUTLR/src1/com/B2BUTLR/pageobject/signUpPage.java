package com.B2BUTLR.pageobject;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class signUpPage {
	
	/**
    protected WebDriver driver;
	
	private By Company = By.xpath("//input[@name='companyName']");
	WebElement CompanyTxBx = driver.findElement(Company);
	private By FirstName = By.xpath("//input[@name='firstName']");
	WebElement FirstNameTxBx = driver.findElement(FirstName);
	private By LastName = By.xpath("//input[@name='lastName']");
	WebElement LastNameTxBx = driver.findElement(LastName);
	private By Title = By.xpath("//input[@name='title']");
	WebElement TitleTxBx = driver.findElement(Title);
	private By BusinessEmail = By.xpath("//input[@name='businessEmail']");
	WebElement BusinessEmailTxBx = driver.findElement(BusinessEmail);
	private By phone = By.xpath("//input[@name='phone']");
	WebElement phoneTxBx = driver.findElement(phone);
	private By Submit = By.xpath("//span[text()='Create Account']");
	WebElement SubmitBtn = driver.findElement(Submit);
	private By Password = By.xpath("//input[@name='password']");
	WebElement PasswordTxBx = driver.findElement(Password);
	private By username = By.xpath("//input[@name='username']");
	WebElement usernameTxBx = driver.findElement(username);
	private By emailExistMsg = By.xpath("//p[text()='already exists']");
	WebElement emailExists = driver.findElement(emailExistMsg);
	private By UserNameExist = By.xpath("//p[text()='Username already exists.']");
	WebElement UserNameExistMsg = driver.findElement(UserNameExist);
	
	public signUpPage(WebDriver driver)
	{
	  this.driver=driver;
	}
	*/
	
	
	@FindBy(xpath="//input[@name='companyName']")
	private WebElement CompanyTxBx;
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement FirstNameTxBx;
	@FindBy(xpath="//input[@name='lastName']")
	private WebElement LastNameTxBx;
	@FindBy(xpath="//input[@name='title']")
	private WebElement TitleTxBx;
	@FindBy(xpath="//input[@name='businessEmail']")
	private WebElement BusinessEmailTxBx;
	@FindBy(xpath="//input[@name='phone']")
	private WebElement phoneTxBx;
	@FindBy(xpath="//span[text()='Create Account']")
	private WebElement SubmitBtn;
	@FindBy(xpath="//input[@name='password']")
	private WebElement PasswordTxBx;
	@FindBy(xpath="//input[@name='username']")
	private WebElement usernameTxBx;
	@FindBy(xpath="//p[text()='already exists']")
	private WebElement emailExistMsg;
	@FindBy(xpath="//p[text()='Username already exists.']")
	private WebElement UserNameExistMsg;
	
	public WebElement getUserNameExistMsg() {
		return UserNameExistMsg;
	}
	
	public WebElement getEmailExistsMsg() {
		return emailExistMsg;
	}
	
	public signUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
 
 
  public void validSignUp(String company, String firstName, String lastName, String title, String businessEmail, String phone, String userName, String password)
  {
	  CompanyTxBx.clear();
	  CompanyTxBx.sendKeys(company);
	  FirstNameTxBx.clear();
	  FirstNameTxBx.sendKeys(firstName);
	  LastNameTxBx.clear();
	  LastNameTxBx.sendKeys(lastName);
	  TitleTxBx.clear();
	  TitleTxBx.sendKeys(title);
	  BusinessEmailTxBx.clear();
	  BusinessEmailTxBx.sendKeys(businessEmail);
	  phoneTxBx.clear();
	  phoneTxBx.sendKeys(phone);
	  usernameTxBx.clear();
	  usernameTxBx.sendKeys(userName);
	  PasswordTxBx.clear();
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
