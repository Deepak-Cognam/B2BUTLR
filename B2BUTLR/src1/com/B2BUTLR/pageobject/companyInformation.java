package com.B2BUTLR.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class companyInformation {
	/**
	protected WebDriver driver;
	
	private By BusinessName = By.xpath("//input[@name='name']");
	WebElement BusinessNameTxBx = driver.findElement(BusinessName);
	private By Dba = By.xpath("//input[@name='dba']");
	WebElement DbaTxBx = driver.findElement(Dba);
	private By RegBusAdd = By.xpath("//input[@name='address']");
	WebElement RegBusAddTxBx = driver.findElement(RegBusAdd);
	private By PhoneNo = By.id("cellPhoneNumber");
	WebElement PhoneNoTxBx = driver.findElement(PhoneNo);
	private By CompWeb = By.xpath("//input[@name='website']");
	WebElement CompWebTxBx = driver.findElement(CompWeb);
	private By BusinessType = By.xpath("//div[@id='select-businessType']");
	WebElement BusinessTypeTxBx = driver.findElement(BusinessType);
	private By IndustryType = By.xpath("//div[@id = 'select-industryType']");
	WebElement IndustryTypeTxBx = driver.findElement(IndustryType);
	private By FederalTaxId = By.xpath("//input[@name='federalTaxId']");
	WebElement FederalTaxIdTxBx = driver.findElement(FederalTaxId);
	private By RegStateISOCode = By.xpath("//div[@id = 'select-regStateISOCode']");
	WebElement RegStateISOCodeTxBx = driver.findElement(RegStateISOCode);
	private By SaveAndCont = By.xpath("//span[text()='Save and Continue']");
	WebElement SaveAndContBtn = driver.findElement(SaveAndCont);
	
	public companyInformation(WebDriver driver)
	{
	  this.driver=driver;
	}*/
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement BusinessNameTxBx;
	@FindBy(xpath="//input[@name='dba']")
	private WebElement DbaTxBx;
	@FindBy(xpath="//input[@name='address']")
	private WebElement RegBusAddTxBx;
	@FindBy(id="cellPhoneNumber")
	private WebElement PhoneNoTxBx;
	@FindBy(xpath="//input[@name='website']")
	private WebElement CompWebTxBx;
	@FindBy(xpath="//div[@id='select-businessType']")
	private WebElement BusinessTypeTxBx;
	@FindBy(xpath="//div[@id = 'select-industryType']")
	private WebElement IndustryTypeTxBx;
	@FindBy(xpath="//input[@name='federalTaxId']")
	private WebElement FederalTaxIdTxBx;
	@FindBy(xpath="//div[@id = 'select-regStateISOCode']")
	private WebElement RegStateISOCodeTxBx;
	@FindBy(xpath="//span[text()='Save and Continue']")
	private WebElement SaveAndContBtn;
	
	public companyInformation(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void validCompInfo(String regBusAdd, String phoneNo, String compWeb, String fedTaxId)
	{
		RegBusAddTxBx.sendKeys(regBusAdd);
		PhoneNoTxBx.sendKeys(phoneNo);
		CompWebTxBx.sendKeys(compWeb);
		Select drpdwn1 = new Select(BusinessTypeTxBx);
		drpdwn1.selectByVisibleText("LLC");
		Select drpdwn2 = new Select(IndustryTypeTxBx);
		drpdwn2.selectByVisibleText("Utilities");
		FederalTaxIdTxBx.sendKeys(fedTaxId);
		Select drpdwn3 = new Select(RegStateISOCodeTxBx);
		drpdwn3.selectByVisibleText("Alaska");
		SaveAndContBtn.click();
		
		
		
	}
}
