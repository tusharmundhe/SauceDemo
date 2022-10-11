package com.SauceDemo.TestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClass._1POMClassForLogin;
import com.SauceDemo.POMClass._2POMClassforHomePage;

public class _TC002CheckLogoutFuctionality extends TestBaseClass
{
	
	   @Test
		public void verifylogoutfunctionality()
		{
		_2POMClassforHomePage y= new _2POMClassforHomePage(driver);
		
		y.menubuttonclick();
		y.logoutbuttonclick();
		
		String GivenTitle="Swag Labs";
		String ActualTitle=driver.getTitle();
		
		Assert.assertEquals(ActualTitle,GivenTitle );
		}
	  

}
