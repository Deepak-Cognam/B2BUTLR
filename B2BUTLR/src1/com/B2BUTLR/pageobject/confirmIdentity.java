package com.B2BUTLR.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class confirmIdentity {
	
	@FindBy(name = "mfa_code")
	private WebElement verificationCodeTxBx;
	@FindBy(name = "is_trusted")
	private WebElement trustedDeviceBtn;
	@FindBy(xpath = "//span[text()='Continue']")
	private WebElement continueBtn;
	@FindBy(xpath = "text()='Resend Code']")
	private WebElement resendBtn;
	
	public confirmIdentity(WebDriver driver)
	{
	  PageFactory.initElements(driver, this);
	}
	

}
