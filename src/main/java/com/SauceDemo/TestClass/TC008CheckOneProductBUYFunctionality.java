package com.SauceDemo.TestClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClass._2POMClassforHomePage;
import com.SauceDemo.POMClass._3POMClassforInformationPage;
import com.SauceDemo.POMClass._4POMClassforCheckOverviewPage;
import com.SauceDemo.POMClass._5POMClassforFinalPage;
import com.SauceDemo.utitlityClass._6ScreenShotPOM;

public class TC008CheckOneProductBUYFunctionality extends TestBaseClass
{
	@BeforeMethod
	public void oneproductbuyfunctionality()
	{
		   
   	_2POMClassforHomePage hp= new _2POMClassforHomePage(driver);
	hp.addtocartclick();
	hp.basketclick();
	hp.checkoutbuttonclick();
	_3POMClassforInformationPage info= new _3POMClassforInformationPage(driver);
	info.entrefirstname();
	info.entrelastname();
	info.entrepostalcode();
	info.clickcontinebutton();
	}
	@Test
	public void verifyoneproductbuyfunctionality() throws InterruptedException, IOException 
	{
		_4POMClassforCheckOverviewPage cp=new _4POMClassforCheckOverviewPage(driver);
		cp.finshbuttonclick();
		Thread.sleep(3000);
		_6ScreenShotPOM.screenshot("Buyproduct", driver);
		
		_5POMClassforFinalPage fp=new _5POMClassforFinalPage(driver);
		String actualresult=fp.finshpagetext();
		String expectedresult="Your order has been dispatched, and will arrive just as fast as the pony can get there!";
		Assert.assertEquals(actualresult,expectedresult);
	}
	
			
			
	}


