package com.POM;


import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generic.BaseTest;



public class ColorVisionPage extends BaseTest
{



	public ColorVisionPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath="//div[@class='plate-container']/img")
	public static WebElement img_screen;

	@FindBy (xpath="//div[@class='radio-option']/div/span")
	public static WebElement btn_radioOption;

	@FindBy (xpath = "//div[@class='radio-option']/div/span")
	public static List<WebElement> spanElements;

	@FindBy ( xpath= "//div[@class='radio-option']")
	public static List<WebElement> radioOptions;

	@FindBy (xpath="//div[@class='test-complete']/p")
	public static WebElement txt_score;

	@FindBy (xpath="//div[@class='test-complete']/button")
	public static WebElement btn_restart;




	//method
	public static String getAttributeValueOfPlate() {
		// Assuming img_screen is already located elsewhere in your code
		String attributeValue = img_screen.getAttribute("alt");
		System.out.println("Plate Attribute Value: " + attributeValue);
		return attributeValue;
	}



	public static String methodconvertplattonumber(String attributeValue)
	{

		String pageNo;
		if (attributeValue.equals("Plate 1") || attributeValue.equals("Plate 2") || 
				attributeValue.equals("Plate 11") || attributeValue.equals("Plate 12")) {
			pageNo = "1";
		} else if (attributeValue.equals("Plate 3") || attributeValue.equals("Plate 13")) {
			pageNo = "2";
		} else if (attributeValue.equals("Plate 4") || attributeValue.equals("Plate 14")) {
			pageNo = "3";
		} else if (attributeValue.equals("Plate 5") || attributeValue.equals("Plate 6") || 
				attributeValue.equals("Plate 15")) {
			pageNo = "4";
		} else if (attributeValue.equals("Plate 7") || attributeValue.equals("Plate 16") || 
				attributeValue.equals("Plate 17")) {
			pageNo = "5";
		} else if (attributeValue.equals("Plate 8") || attributeValue.equals("Plate 18") || 
				attributeValue.equals("Plate 19")) {
			pageNo = "6";
		} else if (attributeValue.equals("Plate 9") || attributeValue.equals("Plate 20") || 
				attributeValue.equals("Plate 22")) {
			pageNo = "7";
		} else if (attributeValue.equals("Plate 23")) {
			pageNo = "8";
		} else if (attributeValue.equals("Plate 10") || attributeValue.equals("Plate 24")) {
			pageNo = "9";
		} else {
			pageNo = "Can't see"; // Default case if no match is found
		}

		System.out.println("method implemented Page Number: " + pageNo);

		return pageNo;

	}


	public static void methodmatchAll() throws InterruptedException
	{
		for(int click=0;click<=22;click++) // navigate to all screen 
		{
			String attributeValue = getAttributeValueOfPlate();
			String number = methodconvertplattonumber(attributeValue);


			for (int i = 0; i < spanElements.size(); i++) 
			{
				WebElement spanElement = spanElements.get(i); // Get the current span element
				String spanno = spanElement.getText(); // Get the text of the current span element
				System.out.println("Span No: " + spanno); // Print the text for debugging

				// Check if the current span element matches the expected number
				if (number.equalsIgnoreCase(spanno)) 
				{
					Thread.sleep(1000); // Pause for demonstration purposes (can be replaced by better wait mechanisms)

					// Get the corresponding radio option using the same index
					WebElement matchedOption = spanElements.get(i);

					matchedOption.click();

					System.out.println("==========Clicked on matched radio option=============");

					break; // Exit the loop after finding the match
				}
			}
		}
	}


	public static void score() throws InterruptedException
	{
		Thread.sleep(1000);
		String score = txt_score.getText();
		System.out.println(score);
	}

	public static void restartTest() throws InterruptedException
	{
		Thread.sleep(1000);
		btn_restart.click();

	}


	public static void cantSee() throws InterruptedException
	{
		for(int click=0;click<=22;click++) // navigate to all screen 
		{
			for (int i = 0; i < spanElements.size(); i++) 
			{
				WebElement spanElement = spanElements.get(i); // Get the current span element
				String spanno = spanElement.getText(); // Get the text of the current span element
				System.out.println("Span No: " + spanno); // Print the text for debugging
				if(spanno.equalsIgnoreCase("Can't see"))
				{
					WebElement matchedOption = spanElements.get(i);
					
					Thread.sleep(1000);
					matchedOption.click();

					System.out.println("==========Clicked on matched radio option=============");

					break; // Exit the loop after finding the match
				}
			}
		}
	}

	public static void selectRandomOption() throws InterruptedException {
	    for (int screen = 0; screen <= 22; screen++) { // Navigate through all screens
	        
	        if (!spanElements.isEmpty()) {
	            // Generate a random index based on the size of the spanElements list
	            Random random = new Random();
	            int randomIndex = random.nextInt(spanElements.size());

	            // Get the random option and click it
	            WebElement randomOption = spanElements.get(randomIndex);
	            String optionText = randomOption.getText(); // Get the text of the selected option
	            System.out.println("Randomly selected option: " + optionText);

	            // Perform the click
	            Thread.sleep(1000); // Pause for demonstration (replace with WebDriverWait if needed)
	            randomOption.click();
	            System.out.println("==========Clicked on random radio option=============");
	        } else {
	            System.out.println("No radio options found on this screen!");
	        }

	        
	    }
	}

	




}














