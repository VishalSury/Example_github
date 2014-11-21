package com.exampalpracticeBT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.exampalpractice.BasePageExampal;
import com.exampalpracticePM.ExampalOne;

public class ExampalBaseTest 
{
	static WebDriver driver;
	
	public static ExampalOne exampalOne() 
	{
		return (ExampalOne) getPageAs(ExampalOne.class);
	}
	
	public static BasePageExampal getPageAs(Class clazz)
	{
		return PageFactory.initElements(driver,clazz);
	}
}
