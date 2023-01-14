package com.saucedemo.pom;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThankyouPage_PomClass 
{
	private WebDriver driver;
  @FindBy (xpath="//h2[@class='complete-header']")
  private WebElement Thankyou;
  
  public String gettext() 
  {
	  String Text=Thankyou.getText();
	  return Text;
  }
  
  
  public ThankyouPage_PomClass (WebDriver driver)
  {
	 this.driver=driver;
	 PageFactory.initElements( driver,this);
  }
  
  
}
