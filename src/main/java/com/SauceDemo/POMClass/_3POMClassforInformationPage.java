package com.SauceDemo.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _3POMClassforInformationPage
{
	private static WebDriver driver;
	
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement firstname;
	public void entrefirstname()
	{
		firstname.sendKeys("tushar");
	}
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement lastname;
	public void entrelastname()
	{
		lastname.sendKeys("mundhe");
	}
	@FindBy(xpath="//input[@id='postal-code']")
	private WebElement postalcode;
	public void entrepostalcode()
	{
		postalcode.sendKeys("888888");
	}
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continuebutton;
	public void clickcontinebutton()
	{
		continuebutton.click();
	}
	
	
	public _3POMClassforInformationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	

}
