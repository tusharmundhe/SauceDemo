package com.SauceDemo.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _5POMClassforFinalPage 
{
	public static WebDriver driver;
	@FindBy(xpath="//div[@class='complete-text']")
	WebElement finshbutton;
	public String finshpagetext()
	{
		String actualtext=finshbutton.getText();
		return actualtext;
	}
	public _5POMClassforFinalPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
