package com.B2BUTLR.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createAccountConfirmation {
	
	/**
	protected WebDriver driver;
	
	private By createAccountConfirmation = By.xpath("//h6[text()='Your company account has been created!']");
	WebElement createAccountConfirmationMsg = driver.findElement(createAccountConfirmation);
	
	
	public createAccountConfirmation(WebDriver driver)
	{
		this.driver=driver;
	}
	*/
	
	@FindBy(xpath="//h6[text()='Your company account has been created!']")
	private WebElement createAccountConfirmationMsg;
	
	public createAccountConfirmation(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
