package com.B2BUTLR.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class confirmIdentity {
	/**
   protected WebDriver driver;
	
	private By verificationCode = By.name("mfa_code");
	WebElement verificationCodeTxBx = driver.findElement(verificationCode);
	private By trustedDevice = By.name("is_trusted");
	WebElement trustedDeviceBtn = driver.findElement(trustedDevice);
	private By continueb = By.xpath("//span[text()='Continue']");
	WebElement continueBtn = driver.findElement(continueb);
	private By resend = By.xpath("text()='Resend Code']");
	WebElement resendBtn = driver.findElement(resend);
	
	public confirmIdentity(WebDriver driver)
	{
	  this.driver=driver;
	}
	*/
	
	@FindBy(name="mfa_code")
	private WebElement verificationCodeTxBx;
	@FindBy(name="is_trusted")
	private WebElement trustedDeviceBtn;
	@FindBy(xpath="//span[text()='Continue']")
	private WebElement continueBtn;
	@FindBy(xpath="text()='Resend Code']")
	private WebElement resendBtn;
	
	public confirmIdentity(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void mfa(String mfa)
	{
		verificationCodeTxBx.sendKeys(mfa);
		continueBtn.click();
	}

}
