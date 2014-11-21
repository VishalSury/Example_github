package com.exampalpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePageExampal
{
	WebDriver driver;
	
	public void click(WebElement element)
	{
		element.click();
	}
	
	public void printf(String str)
	{
		System.out.println(str);
	}
	
	public <T> T getPageAs(Class<T> T)
	{
		return PageFactory.initElements(driver, T);
	}
}
