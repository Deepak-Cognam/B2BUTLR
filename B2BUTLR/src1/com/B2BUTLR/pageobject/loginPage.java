package com.B2BUTLR.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	/**
	protected WebDriver driver;
	private By username1 = By.name("username");
	WebElement UnTxBx = driver.findElement(username1);
	private By password1 = By.id("password");
	WebElement PswTxBx = driver.findElement(password1);
	private By ForgotPassword = By.xpath("//a[text()='Forgot Password']");
	WebElement ForgotPasswordBtn = driver.findElement(ForgotPassword);
	private By Login = By.xpath("//span[text()='Login']");
	WebElement loginbtn = driver.findElement(Login);
	private By CreateAnAccount = By.xpath("//span[(text()='Create an Account']");
	WebElement createAccBtn = driver.findElement(CreateAnAccount);
	private By passwordhelper = By.id("password-helper-text");
	WebElement CredentialMsg = driver.findElement(passwordhelper);
	
	
	public WebElement getCredentialMsg() {
	  return CredentialMsg;
	}
	*/
	@FindBy(name="username")
	private WebElement UnTxBx;
	@FindBy(id="password")
	private WebElement PswTxBx;
	@FindBy(xpath="//a[text()='Forgot Password']")
	private WebElement ForgotPasswordBtn;
	@FindBy(xpath="//span[text()='Login']")
	private WebElement loginbtn;
	@FindBy(xpath="//span[(text()='Create an Account']")
	private WebElement createAccBtn;
	@FindBy(id="password-helper-text")
	private WebElement CredentialMsg;
	
	
	public loginPage(WebDriver driver)
	{
	 
	 PageFactory.initElements(driver, this);
	} 
	
	public void clickonCreateAccBtn()
	{
		
		createAccBtn.click();
	}
	
	public void login(String username, String password)
	{
		UnTxBx.sendKeys(Keys.CONTROL+"a");
		UnTxBx.sendKeys(Keys.DELETE);
		UnTxBx.sendKeys(username);
		PswTxBx.sendKeys(Keys.CONTROL+"a");
		PswTxBx.sendKeys(Keys.DELETE);
		PswTxBx.sendKeys(password);
		loginbtn.click();
	
	}
	
	public void invalidLogin(String username, String password)
	{
		
		UnTxBx.sendKeys(username);
		PswTxBx.sendKeys(password);
		loginbtn.click();
	
	}
	
	

}
