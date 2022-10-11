package com.SauceDemo.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _4POMClassforCheckOverviewPage 
{
   private static WebDriver driver;
   
   @FindBy(xpath="/html/body/div/div/div/div[1]/div[2]/span")
    private WebElement checkouttext;
   public String checkoutpagetext()
   {
	   String actualresult=checkouttext.getText();
	   return actualresult;
   }
   @FindBy(xpath="//button[@id='finish']")
   WebElement finshbutton;
   public void finshbuttonclick()
   {
	   finshbutton.click();
	   
   }
   public _4POMClassforCheckOverviewPage(WebDriver driver)
   {
	this.driver=driver;
	PageFactory.initElements(driver, this);
   }

}
