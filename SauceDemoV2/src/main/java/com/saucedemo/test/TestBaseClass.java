package com.saucedemo.test;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.saucedemo.pom.HomepagePom_Class;
import com.saucedemo.pom.LoginPom_Class;
import com.saucedemo.utility.Utility;

public class TestBaseClass 
{ 
	    WebDriver driver;
	    
		@BeforeClass 
		public void setUp() throws IOException
		{
			
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("Open Browser");
		driver.manage().window().maximize();
		
		System.out.println("maximmize browser");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com");
		System.out.println("open url");
		Utility.takess(driver, "Loginpage");
		}
		
		
		@BeforeMethod 
		public void Login() throws IOException 
		{
        LoginPom_Class lp=new LoginPom_Class(driver);
        
		lp.sendusername();
		System.out.println("username entered");
		lp.sendpassword();
		System.out.println("password entered");
		Utility.takess(driver, "Loginpagewithidpw");
		lp.loginbtnclick();
		System.out.println("login button clicked");
		 
		Utility.takess(driver, "Homepage");
		}
		@AfterMethod
		public void Loggout() throws IOException
		{
			HomepagePom_Class lq=new HomepagePom_Class(driver);
			
			lq.clickmenu();
			System.out.println("menu clicked");
			
			
			Utility.takess(driver, "Tc02_Menu");
			lq.logoutclick();
			Utility.takess(driver, "Tc02_Loggedout");
			System.out.println("Logoutclick_Tc02");
			
		}		
	
   
	@AfterClass
	public void tearDown()
	{	
	
		driver.quit();
		System.out.println("browser is closed");
		
		System.out.println("End of Program");
	}

}