package com.office.RTD_MYRIDE_pages;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

import com.office.RTD_MYRIDE.util.DataDrivenHelper;

public class homepage extends pagebase{

	public homepage(WebDriver driver)
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public loginpage loginaccount(String username,String password)
	{
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='form-user-login']/button")).click();
		return new loginpage(driver);
	}
	
}
