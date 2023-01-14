package com.saucedemo.test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.saucedemo.pom.Addtokart_Pomclass;
import com.saucedemo.pom.HomepagePom_Class;
import com.saucedemo.pom.Overview_PomClass;
import com.saucedemo.pom.ThankyouPage_PomClass;
import com.saucedemo.pom.Yourcart_PomClass;
import com.saucedemo.pom.Yourinfo_PomClass;
import com.saucedemo.utility.Utility;

public class AllTestClass extends TestBaseClass

{
	
	   
	@Test(priority=2)
	public void Tc03_verify_Pdclickandaddtocart() throws IOException
	{
		
		HomepagePom_Class hp=new HomepagePom_Class (driver);
		
		hp.productclick();
		System.out.println("first product clicked");
		
	
		Addtokart_Pomclass ap=new Addtokart_Pomclass (driver);
		ap.addtocart();
		System.out.println("product added to cart");
		Utility.takess(driver, "Tc03_Addtocart");
		
		ap.backtoproducts();
	    System.out.println("backbtn clicked");
		Utility.takess(driver, "Tc03_Homepage");
		
		String Currentcount=hp.gettext();
		String GivenCount="1";
		
		Assert.assertEquals(Currentcount, GivenCount);
	}
		
		@Test(priority=3)
		public void Tc04_Addtocartallproductsfunctionlaity() throws IOException
		{
			
			
			 HomepagePom_Class hp=new  HomepagePom_Class (driver);
			 hp.clickaddtocart();
			 System.out.println("all products added to cart");
			 Utility.takess(driver, "Tc04_Homepageafteradd");
			String actualcount= hp.gettext();
			
			String Expectedcount="6";
			
			SoftAssert soft=new SoftAssert();
			soft.assertEquals(actualcount, Expectedcount);
			soft.assertAll();
		}
		
		@Test(priority=1)
		public void Tc05_Buyproductfunctionality() throws IOException 
	{
		
		 HomepagePom_Class hp=new HomepagePom_Class (driver);
	
	hp.productclick();
	System.out.println("first product clicked");
	

	Addtokart_Pomclass ap=new Addtokart_Pomclass (driver);
	Utility.takess(driver, "Tc05_Productpage");
	ap.addtocart();
	Utility.takess(driver, "Tc05_Productpage_Afteraddtocart");
	System.out.println("product added to cart");
	
	ap.cartbtnclick();
	System.out.println("cartbtn clicked");
	
	Yourcart_PomClass yp=new Yourcart_PomClass (driver);
	Utility.takess(driver, "Tc05_yourcart");
	yp.clickcheckout();
	System.out.println("clicked checkout");
	
	Yourinfo_PomClass yi=new Yourinfo_PomClass (driver);
	Utility.takess(driver, "Tc05_Yourinfopage");
	yi.sendfirstame();
	System.out.println("entered name");
	yi.sendlastname();
	System.out.println("entered last name");
	yi.sendpincode();
	Utility.takess(driver, "Tc05_yourinfopage_afterenteringinfo");
	System.out.println("entered pincode");
	yi.clickcontinue();
	System.out.println("click continue");
	
	Overview_PomClass op=new Overview_PomClass(driver);
	Utility.takess(driver, "Tc05_overviewpage");
	op.clickfinish();
	System.out.println("clicked finish");
	
	ThankyouPage_PomClass tp=new ThankyouPage_PomClass (driver);
	Utility.takess(driver, "Tc05_Thankyoupage");
	String Actualtext=tp.gettext();
	String ExpectedText="THANK YOU FOR YOUR ORDER";
	
	Assert.assertEquals(Actualtext, ExpectedText);
	        
	
				
			
			

	}
		
}
		
		