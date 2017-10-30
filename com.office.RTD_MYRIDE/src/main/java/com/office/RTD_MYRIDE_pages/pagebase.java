package com.office.RTD_MYRIDE_pages;

import org.openqa.selenium.WebDriver;

public class pagebase {
	protected WebDriver driver;
	
		public pagebase(WebDriver driver) {
		// TODO Auto-generated constructor stub
			this.driver=driver;
	}
	public String gettitle()
	{
		
		return driver.getTitle();

	}


}
