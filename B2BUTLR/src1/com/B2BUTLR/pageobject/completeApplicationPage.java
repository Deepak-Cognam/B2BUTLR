package com.B2BUTLR.pageobject;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class completeApplicationPage {
	/**
	protected WebDriver driver;
	
	private By CompanyInfo = By.xpath("//a[text()='Company Information']");
	WebElement CompanyInfoLink = driver.findElement(CompanyInfo);
	private By PaymentNeed = By.xpath("//a[text()='Payment Needs']");
	WebElement PaymentNeedLink = driver.findElement(PaymentNeed);
	private By OwnerShipInfo = By.xpath("//a[text()='Ownership Information']");
	WebElement OwnerShipInfoLink = driver.findElement(OwnerShipInfo);
	private By AuthRep = By.xpath("//a[text()='Authorized Representatives']");
    WebElement AuthRepLink = driver.findElement(AuthRep);	
    private By ReviewandSubmit = By.xpath("//a[text()='Review and Submit']");
    WebElement ReviewandSubmitLink = driver.findElement(ReviewandSubmit);
	
	
	public completeApplicationPage(WebDriver driver)
	{
	  this.driver=driver;
	}
	*/
	
	@FindBy(xpath="//a[text()='Company Information']")
	private WebElement CompanyInfoLink;
	@FindBy(xpath="//a[text()='Payment Needs']")
	private WebElement PaymentNeedLink;
	@FindBy(xpath="//a[text()='Ownership Information']")
	private WebElement OwnerShipInfoLink;
	@FindBy(xpath="//a[text()='Authorized Representatives']")
	private WebElement AuthRepLink;
	@FindBy(xpath="//a[text()='Review and Submit']")
	private WebElement ReviewandSubmitLink;
	
	public completeApplicationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void CompanyInformation()
	{
		 CompanyInfoLink.click();
	}
	void PaymentNeeds()
	{
		PaymentNeedLink.click();
	}
	void OwnerShipInformation()
	{
		OwnerShipInfoLink.click();
	}
	void AuthorizedRepresentative()
	{
		AuthRepLink.click();
	}
	void ReviewAndSubmit()
	{
		ReviewandSubmitLink.click();
	}

}
