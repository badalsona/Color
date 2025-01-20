package com.testCases;

import java.time.Duration;

import org.apache.commons.io.filefilter.FalseFileFilter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.POM.ColorVisionPage;
import com.POM.InstructionPage;
import com.generic.BaseTest;

public class TC_001 extends BaseTest
{
	@Test(priority =1)
	public  void startTest()
	{
		InstructionPage.clickNextButton();
		InstructionPage.clickNextButton();
		InstructionPage.clickNextButton();
		
	}
	
	@Test(priority =2, enabled = false)
	public void screenTestAttributeValue()
	{
		ColorVisionPage.getAttributeValueOfPlate();
	}
	
	@Test(priority =3, enabled = false)
	public void screenTestRadioValue()
	{
		ColorVisionPage.getValueOfRadioOption();
	}
	
	@Test(priority =4, enabled = false)
	public void answerOptionsContainer()
	{
		ColorVisionPage.iterateSpanRadioOption();
	}
	
	@Test(priority =5, enabled = false)
	public void returnSpanElement()
	{
		ColorVisionPage.iterateSpanRadioOption();
	}
	
	@Test(priority =6, enabled = false)
	public void assignAttributeValue()
	{
		String x = ColorVisionPage.getAttributeValueOfPlate();
		ColorVisionPage.switchplateNo(x);
		
	}
	
	@Test(priority = 7)
	public void plateMatchwithRadio() {
	    // Step 1: Wait for all radio options to load
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='radio-option']/div/span")));

	    // Step 2: Get the plate attribute value
	    String plateAttribute = ColorVisionPage.getAttributeValueOfPlate();

	    // Step 3: Convert the plate attribute using the switchplateNo method
	    String pageNo = ColorVisionPage.switchplateNo(plateAttribute);

	    // Step 4: Get all span values from radio options
	   ColorVisionPage.matchSpanRadioOption(pageNo);

	    
	}






	
}
