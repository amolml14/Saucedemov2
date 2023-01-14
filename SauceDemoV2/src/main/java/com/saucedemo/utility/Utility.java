package com.saucedemo.utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility 
{
	public static void takess(WebDriver driver ,String filename) throws IOException 
	{
		Date d=new Date();
		String Timestamp=d.toString().replace(":", "_").replace("/", "_").replace(" ", "_");
	    
	TakesScreenshot ts= (TakesScreenshot)driver;	 

	File sourceFile = ts.getScreenshotAs(OutputType.FILE);   //byte format 

	File destFile = new File("./Screenshots/"+filename+"_"+Timestamp+".jpg");	 

	org.openqa.selenium.io.FileHandler.copy(sourceFile, destFile);
	}

}
