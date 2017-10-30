package com.office.RTD_MYRIDE.util;

import java.security.InvalidParameterException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class webdriverhelper {
	public static WebDriver createdriver(String browser)

	{
		WebDriver driver=null;
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\surya\\geckodriver\\geckodriver.exe");
		      driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\surya\\chromedriver\\chromedriver.exe");
		       driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver","C:\\Users\\surya\\IEDriverServer\\IEDriverServer.exe");
		      driver=new InternetExplorerDriver();
			
		}
		else
		{
			throw new InvalidParameterException(browser+"is not a valid browser");
		}
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		
		return driver;
		
	}
public static void quitdriver(WebDriver driver)
{
	driver.quit();
}
}
