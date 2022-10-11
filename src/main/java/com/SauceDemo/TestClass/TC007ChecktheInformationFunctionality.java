package com.SauceDemo.TestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClass._1POMClassForLogin;
import com.SauceDemo.POMClass._2POMClassforHomePage;
import com.SauceDemo.POMClass._3POMClassforInformationPage;
import com.SauceDemo.POMClass._4POMClassforCheckOverviewPage;

public class TC007ChecktheInformationFunctionality extends TestBaseClass
{
	
	@Test
	public void verifyinformationfunctionality()
	{
		_2POMClassforHomePage hp= new _2POMClassforHomePage(driver);
		
		hp.addtocartclick();
		hp.basketclick();
		hp.checkoutbuttonclick();
	
	   
		_3POMClassforInformationPage ip=new _3POMClassforInformationPage(driver);
		ip.entrefirstname();
		ip.entrelastname();
		ip.entrepostalcode();
		ip.clickcontinebutton();
		
		_4POMClassforCheckOverviewPage op=new _4POMClassforCheckOverviewPage(driver);
		String actualresult=op.checkoutpagetext();
		//System.out.println(actualresult);
		String expectedresult="CHECKOUT: OVERVIEW";
		
		Assert.assertEquals(actualresult,expectedresult);
		
		
		}
	    
}
