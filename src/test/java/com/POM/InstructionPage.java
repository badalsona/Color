package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generic.BaseTest;

public class InstructionPage extends BaseTest
{
	public InstructionPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class='next-button']")
	public static WebElement btn_next;
	
	//method on instruction page
	public void methodNavigateInstructionPage() throws InterruptedException
	{
		Thread.sleep(1000);
		btn_next.click();
		Thread.sleep(1000);
		btn_next.click();
		Thread.sleep(1000);
		btn_next.click();
	}
}
