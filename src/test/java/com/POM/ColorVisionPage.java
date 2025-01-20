package com.POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generic.BaseTest;

public class ColorVisionPage extends BaseTest
{
	
	static  WebDriver driver;
	
	public ColorVisionPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//div[@class='plate-container']/img")
	public static WebElement img_screen;
	
	@FindBy (xpath="//div[@class='radio-option']/div/span")
	public static WebElement btn_radioOption;
	
	@FindBy (tagName = "span")
	public static List<WebElement> spanElements;
	
	@FindBy ( xpath= "//div[@class='radio-option']")
	public static List<WebElement> radioOptions;
	
	
	
	
	//method
	public static String getAttributeValueOfPlate() {
	    // Assuming img_screen is already located elsewhere in your code
	    String attributeValue = img_screen.getAttribute("alt");
	    System.out.println("Plate Attribute Value: " + attributeValue);
	    return attributeValue;
	}

	
	
	//value of color plate 
	String pageNo_1= "1";
	String pageNo_2= "1";
	String pageNo_3= "2";
	String pageNo_4= "3";
	String pageNo_5= "4";
	String pageNo_6= "4";
	String pageNo_7= "5";
	String pageNo_8= "6";
	String pageNo_9= "7";
	String pageNo_10= "9";
	String pageNo_11= "1";
	String pageNo_12= "1";
	String pageNo_13= "2";
	String pageNo_14= "3";
	String pageNo_15= "4";
	String pageNo_16= "5";
	String pageNo_17= "5";
	String pageNo_18= "6";
	String pageNo_19= "6";
	String pageNo_20= "7";
	//String pageNo_21= "";
	String pageNo_22= "7";
	String pageNo_23= "8";
	String pageNo_24= "9";
	
	
	public static void getValueOfRadioOption()
	{
		String radioText = btn_radioOption.getText();
		//span text value 
		System.out.println(radioText);
		
		
	}
	
	public static WebElement getRadioOptionByIndex(int index) {
	   

	    // Return the element at the given index
	    if (index >= 0 && index < radioOptions.size()) {
	        return radioOptions.get(index);
	    } else {
	        throw new IndexOutOfBoundsException("Invalid index for radio options: " + index);
	    }
	}

	
	public static String[] iterateSpanRadioOption()
	{
		 // Create an array to store the span values
	    String[] spans = new String[spanElements.size()];

	    // Iterate through the spans and collect their text
	    for (int i = 0; i < spanElements.size(); i++) {
	        spans[i] = spanElements.get(i).getText();
	        System.out.println("Span Value: " + spans[i]); // Print each value
	    }

	    // Return the array of span values
	    return spans;

	}
	
	public static String switchplateNo(String attributeValue) {
	    // Apply a switch-case based on the attributeValue
	    String pageNo;

	    switch (attributeValue) {
	        case "Plate 1":
	        case "Plate 2":
	        case "Plate 11":
	        case "Plate 12":	
	            pageNo = "1";
	            break;
	        case "Plate 3":
	        case "Plate 13":
	            pageNo = "2";
	            break;
	        case "Plate 4":
	        case "Plate 14":
	            pageNo = "3";
	            break;
	        case "Plate 5":
	        case "Plate 6":
	        case "Plate 15":
	            pageNo = "4";
	            break;
	        case "Plate 7":
	        case "Plate 16":
	        case "Plate 17":
	            pageNo = "5";
	            break;
	        case "Plate 8":
	        case "Plate 18":
	        case "Plate 19":
	            pageNo = "6";
	            break;
	        case "Plate 9":
	        case "Plate 20":
	        case "Plate 22":
	            pageNo = "7";
	            break;
	        case "Plate 23":
	            pageNo = "8";
	            break;
	        case "Plate 10":
	        case "Plate 24":
	            pageNo = "9";
	            break;
	        default:
	            pageNo = "Unknown"; // Default case if no match is found
	            break;
	    }

	    // Print and use the page number as needed
	    System.out.println("Page Number: " + pageNo);
	    
	    return pageNo;
	}
	
	
	
	
	///method 
	public static void matchSpanRadioOption(String SwitchedpageNo)
	{
		
		
		 // Create an array to store the span values
	    String[] spans = new String[spanElements.size()];
	    System.out.println(spans);

	    // Iterate through the spans and collect their text
	    for (int i = 0; i < spanElements.size(); i++) 
	    {
	        spans[i] = spanElements.get(i).getText();
	        System.out.println("Span Value: " + spans[i]); 
	        String xpath = "(//div[@class='radio-option']/div/span)[" + (i + 1) + "]";
	        System.out.println(xpath);
	        
	        
			if(spans[i].equals(SwitchedpageNo))
	        {
		   WebElement matchingOption = driver.findElement(By.xpath(xpath));
		   matchingOption.click();
		    System.out.println("Clicked on the radio option with value: " );
		    break; // Exit the loop after clicking
	        }
		        
		 }
	    

	    ColorVisionPage.getAttributeValueOfPlate();

	}
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	

