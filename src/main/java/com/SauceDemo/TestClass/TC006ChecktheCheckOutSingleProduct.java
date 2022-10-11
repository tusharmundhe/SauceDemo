package com.SauceDemo.TestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClass._1POMClassForLogin;
import com.SauceDemo.POMClass._2POMClassforHomePage;

public class TC006ChecktheCheckOutSingleProduct extends TestBaseClass
{
	
	    @Test
		public void singleproductcheckout()
		{
		_2POMClassforHomePage hp= new _2POMClassforHomePage(driver);
		
		hp.addtocartclick();
		hp.basketclick();
		hp.checkoutbuttonclick();
		String actualresult=hp.checkouttext();
		//System.out.println(actualresult);
		String expectedresult="CHECKOUT: YOUR INFORMATION";
		//System.out.println(expectedresult);
		
		Assert.assertEquals(actualresult, expectedresult);
		}
	    

		
	}


