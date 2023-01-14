package com.saucedemo.pom;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtokart_Pomclass 
{
	private WebDriver driver;
	
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement Addtocartbtn;
	
	public void addtocart()
	{
		Addtocartbtn.click();         
		
	}
	
	@FindBy(xpath="//button[@id='back-to-products']")
	private WebElement Backtoproducts;
	
	public void backtoproducts()
	{
		Backtoproducts.click();
	}
	
	@FindBy (xpath="//a[@class='shopping_cart_link']")
	private WebElement Cartbtn;
	
	public void cartbtnclick()
	{
	Cartbtn.click();
	}
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement Menu;
	
	public void clickmenu()
	{
		Menu.click();
	}
	
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	 WebElement logout;
	
	public void logoutclick()
	{
		logout.click();
	}
	
	
	
	
	public Addtokart_Pomclass (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	

}
