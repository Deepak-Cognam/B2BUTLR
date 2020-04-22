package com.B2BUTLR.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class paymentNeedPage {
	/**
	protected WebDriver driver;
	
	private By avgAmtPerMonthDrpdwn = By.id("select-avgPayPM");
	WebElement avgAmtPerMonth = driver.findElement(avgAmtPerMonthDrpdwn);
	private By avgNoPayPerMonthDrpdwn = By.id("select-avgPayAmtPM");
	WebElement avgNoPayPerMonth = driver.findElement(avgNoPayPerMonthDrpdwn);
	private By purpopseOfPaymentDrpdwn = By.id("password-helper-text");
	WebElement purpopseOfPayment = driver.findElement(purpopseOfPaymentDrpdwn);
	private By saveAndContinue = By.xpath("//span[text()='Save and Continue']");
	WebElement saveAndContinueButton = driver.findElement(saveAndContinue);
	
	
	public paymentNeedPage(WebDriver driver)
	{
	  this.driver=driver;
	}
	*/
	
	@FindBy(id="select-avgPayPM")
	private WebElement avgAmtPerMonth;
	@FindBy(id="select-avgPayAmtPM")
	private WebElement avgNoPayPerMonth;
	@FindBy(id="password-helper-text")
	private WebElement purpopseOfPayment;
	@FindBy(xpath="//span[text()='Save and Continue']")
	private WebElement saveAndContinueButton;
	
	public paymentNeedPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void selectInfo()
	{
		Select avgPaydropdown = new Select(avgAmtPerMonth);
		avgPaydropdown.selectByVisibleText("20,000.00 - 50,000.00 USD");
		Select avgPerMonthdropdown = new Select(avgNoPayPerMonth);
		avgPerMonthdropdown.selectByVisibleText("3 - 5");
		Select purposeOfpaymentdropdown = new Select(purpopseOfPayment);
		purposeOfpaymentdropdown.selectByVisibleText("PurchasingFrom");
		saveAndContinueButton.click();
	}

}
