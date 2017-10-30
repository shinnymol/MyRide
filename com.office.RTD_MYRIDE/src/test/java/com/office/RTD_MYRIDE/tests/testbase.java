package com.office.RTD_MYRIDE.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.office.RTD_MYRIDE.util.DataDrivenHelper;
import com.office.RTD_MYRIDE.util.webdriverhelper;
import com.office.RTD_MYRIDE_pages.homepage;

public class testbase {
protected WebDriver driver;
protected homepage hpage;
protected Properties testconfig;
@BeforeSuite
public void beforesuite() throws FileNotFoundException, IOException
{
	testconfig=new Properties();
	  testconfig.load(new FileInputStream("testconfig.properties"));
}

	  @BeforeMethod
	  public void beforeMethod()
	  {
		  
		 driver=webdriverhelper.createdriver(testconfig.getProperty("browser"));
         driver.get(testconfig.getProperty("baseUrl"));
         hpage=new homepage(driver);
	  }
	  @DataProvider
		 public Object[][] dataprovider(Method method)
		 {
			 
		 DataDrivenHelper ddh=new DataDrivenHelper(testconfig.getProperty("masterdatafile"));
		 Object[][]testdata=ddh.getTestCaseDataSets(testconfig.getProperty("testdatasheet"),method.getName());
		 return testdata;
	}

	  @AfterMethod
	  public void afterMethod()
	  {
	    webdriverhelper.quitdriver(driver);
	  }

}
