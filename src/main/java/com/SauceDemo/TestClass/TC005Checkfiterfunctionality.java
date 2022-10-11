package com.SauceDemo.TestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClass._1POMClassForLogin;
import com.SauceDemo.POMClass._2POMClassforHomePage;

public class TC005Checkfiterfunctionality extends TestBaseClass
{
	
		@Test
		public void verifydropdownfunctionality()
		{
		_2POMClassforHomePage hp= new _2POMClassforHomePage(driver);
		hp.dropdown();
		}
		
}
