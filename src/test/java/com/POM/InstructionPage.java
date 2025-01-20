package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstructionPage 
{
	public InstructionPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class='next-button']")
	public static WebElement btn_next;
	
	//method 
	public static void clickNextButton()
	{
		btn_next.click();
	}
}
