package com.office.RTD_MYRIDE.tests;

import org.testng.annotations.Test;

import com.office.RTD_MYRIDE_pages.homepage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginTest extends testbase
{

   @Test(dataProvider="dataprovider")
  public void testloginsuccessful(String username,String password) 
  {
	//homepage hp=new homepage(driver);
	boolean result=hpage.loginaccount(username,password).isloginsuccessful();//contains("Logout");

	Assert.assertTrue(result, "login is failed for "+username);
  }
 

}
