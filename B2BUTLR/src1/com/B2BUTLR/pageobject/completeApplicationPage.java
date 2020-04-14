package com.B2BUTLR.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class completeApplicationPage {
	
	@FindBy(xpath = "//a[text()='Company Information']")
	private WebElement CompanyInfoLink;

}
