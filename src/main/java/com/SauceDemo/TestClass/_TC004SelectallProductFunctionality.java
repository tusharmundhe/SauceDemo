package com.SauceDemo.TestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClass._1POMClassForLogin;
import com.SauceDemo.POMClass._2POMClassforHomePage;

public class _TC004SelectallProductFunctionality extends TestBaseClass
{
	    @Test
		public void verifyallproductaddtocartfunctionality()
		{
			
		_2POMClassforHomePage hp= new _2POMClassforHomePage(driver);
		hp.allproductclick();
		
		String expectedresult="6";
		//String actualresult=y.basket.getText();
		String actualresult=hp.baskettext();
		Assert.assertEquals(actualresult,expectedresult );
		
		}
		
}
