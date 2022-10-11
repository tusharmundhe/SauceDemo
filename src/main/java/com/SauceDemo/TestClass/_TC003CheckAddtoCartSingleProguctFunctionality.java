package com.SauceDemo.TestClass;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.SauceDemo.POMClass._1POMClassForLogin;
import com.SauceDemo.POMClass._2POMClassforHomePage;

public class _TC003CheckAddtoCartSingleProguctFunctionality extends TestBaseClass
{
	
	    @Test
		public void verifysingleaddtocartyfunctionality()
		{
		_2POMClassforHomePage hp= new _2POMClassforHomePage(driver);
		hp.addtocartclick();
		
		String expectedresult="1";
		//String actualresult=y.basket.getText();
		String actualresult=hp.baskettext();
		
//		SoftAssert soft= new SoftAssert();
//		soft.assertNotEquals(actualresult, expectedresult, "because spelling mistake");
		Assert.assertEquals(actualresult, expectedresult,"because spelling mistake");
		}
		

}
