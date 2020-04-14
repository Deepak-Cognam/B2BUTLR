package com.B2BUTLR.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class createAccountConfirmation {
	
	@FindBy(xpath = "//h6[text()='Your company account has been created!']")
	private WebElement createAccountConfirmation;

}
