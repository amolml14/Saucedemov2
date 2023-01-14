package com.saucedemo.pom;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Yourcart_PomClass 

{ 
	private WebDriver driver;
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement Checkout;
	
	public void clickcheckout()
	{
		Checkout.click();
	}
	 @FindBy(xpath="//button[@id='remove-sauce-labs-backpack']")
	private WebElement Remove;
	public void clickremove()
	{
		Remove.click();
	}
	
	@FindBy (xpath="//a[@class='shopping_cart_link']")
	private WebElement count;
	
	public String gettext() 
	{
		String Actualvalue=count.getText();
        return Actualvalue;		
	}
	
	
	
	public Yourcart_PomClass (WebDriver driver)

	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
}
