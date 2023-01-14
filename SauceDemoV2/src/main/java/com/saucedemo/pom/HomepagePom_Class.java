package com.saucedemo.pom;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepagePom_Class 
{
	private WebDriver driver;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement Menu;
	
	public void clickmenu()
	{
		Menu.click();
	}
	
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	public
      WebElement logout;
	
	public void logoutclick()
	{
		logout.click();
	}
	
	@FindBy(xpath="(//img[@class='inventory_item_img'])[1]")
	private WebElement img1;
	
	public void productclick()
	{
		img1.click();
	}
	
	@FindBy(xpath="//button[text()='Add to cart']")
	List<WebElement> alladdtocart;
	public void clickaddtocart()
	{
		for(WebElement element:alladdtocart)
		{
			element.click();
			
		}
	}
	
	@FindBy(xpath="//span[@class='shopping_cart_badge']")
	private WebElement cart;
	
	public String gettext()
	{
		String count=cart.getText();
		return count;
	}
	
	
	
	
	
	
	
	public HomepagePom_Class(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

}
