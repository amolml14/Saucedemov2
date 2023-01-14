package com.saucedemo.pom;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Yourinfo_PomClass 
{
	private WebDriver driver;
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement firstname;
	
	public void sendfirstame()
	{
		firstname.sendKeys("Amol");
	}
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement lastname;
	
	public void sendlastname()
	{
		lastname.sendKeys("Lohgaonkar");
	}
	@FindBy(xpath="//input[@id='postal-code']")
	private WebElement pincode;
	
	public void sendpincode()
	{
		pincode.sendKeys("431401");
	}
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continuebtn;
	
	public void clickcontinue()
	{
		continuebtn.click();
	}
	
	
	public Yourinfo_PomClass(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
		
	}
	
}
