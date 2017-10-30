package com.office.RTD_MYRIDE_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class loginpage extends pagebase{
	
	
		public loginpage(WebDriver driver) 
		{
		super(driver);
		// TODO Auto-generated constructor stub
	     }
		public String gettitle()
		{
			return driver.getTitle();	
			
		}
		
		public boolean isloginsuccessful()
		{
			if(isElementPresent(By.linkText("Logout")))
				
				return true;
			else 
				return false;		
		}
	/*	public String isloginsuccessful()
		{
			return driver.findElement(By.linkText("Logout")).getText();
		}
*/
		
		private boolean isElementPresent(By by)
		{
		    try {
		      driver.findElement(by);
		      return true;
		    } catch (NoSuchElementException e) {
		      return false;
		    }
		  }
	
}
