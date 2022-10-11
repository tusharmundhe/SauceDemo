package com.SauceDemo.TestClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClass._1POMClassForLogin;
import com.SauceDemo.utitlityClass._6ScreenShotPOM;

public class _TC001CheckLoginFunctionality extends TestBaseClass  

{
	     @Test
		public void verifyloginfunctionality()
		{
		String GivenTitle="Swag Labs";
		String ActualTitle=driver.getTitle();
		
		Assert.assertEquals(ActualTitle,GivenTitle);
	
	}
}

