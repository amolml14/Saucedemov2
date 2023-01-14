package com.saucedemo.pom;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPom_Class 

{
	private WebDriver driver;
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username;
	
	public void sendusername()
	{
		username.sendKeys("standard_user");
	}
	
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	public void sendpassword()
	{
		password.sendKeys("secret_sauce");
	}
	
	@FindBy (xpath="//input[@id='login-button']")
	private WebElement Loginbtn;
	
	public void loginbtnclick() 
	{
		Loginbtn.click();
	}
	 
	
	
	public LoginPom_Class (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	}


