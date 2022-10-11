package com.SauceDemo.TestClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.Browser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauceDemo.POMClass._1POMClassForLogin;
import com.SauceDemo.utitlityClass._6ScreenShotPOM;

public class TestBaseClass 
{
	
		public WebDriver driver;
		
		@BeforeMethod
		public void setup() throws IOException
		{
			
			
			System.setProperty("webdriver.chrome.driver", "C:\\Sofware\\chromedriver_win32\\chromedriver.exe");
		  	 driver=new ChromeDriver();
			System.out.println("Browser opened");
			driver.manage().window().maximize();
			System.out.println("Browser maximized");
			
		   
			
			driver.navigate().to("https://www.saucedemo.com/");
			System.out.println("url is opened");
			_1POMClassForLogin x= new _1POMClassForLogin(driver);
			x.sendusername();
			System.out.println("username is entered");
			
			x.sendpassword();
			System.out.println("password is entered");
			
			x.loginbuttonclick();
			System.out.println("login is sucessful");
			_6ScreenShotPOM.screenshot("tushar",driver);
		}
		@AfterMethod()
		public void tearDown()
		{
		driver.close();
		System.out.println("browser is closed");
		System.out.println("Thank you");
		}
			
		
	}


