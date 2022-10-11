package com.SauceDemo.utitlityClass;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class _6ScreenShotPOM 
{
	
	
	public static void screenshot(String screenshotname,WebDriver driver) throws IOException
	{
		
		Date d =new Date();
		//System.out.println(d);
		DateFormat d1= new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
		String date=d1.format(d);
		//System.out.println(date);
	   TakesScreenshot ts=(TakesScreenshot)driver;
	
	   File selenium =ts.getScreenshotAs(OutputType.FILE);
	
	   File tushar= new File("D:\\velocity\\Screenshot\\"+screenshotname+date+".jpg");
	
	   FileHandler fh =new FileHandler();
	   fh.copy(selenium, tushar);
	}

}
