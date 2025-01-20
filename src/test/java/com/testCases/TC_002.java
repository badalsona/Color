package com.testCases;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.POM.ColorVisionPage;

public class TC_002 
{
	
	public static ChromeDriver driver;
	List<WebElement> spanElements;
	static  WebElement matchingOption;
	
	@Test
	public void method()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://color-vision-vercel.vercel.app/");
		
		//instruction page navigate
		driver.findElement(By.xpath("//button[@class='next-button']")).click();
		driver.findElement(By.xpath("//button[@class='next-button']")).click();
		driver.findElement(By.xpath("//button[@class='next-button']")).click();
		
		//get plate page attribute value 
		WebElement img_screen = driver.findElement(By.xpath("//div[@class='plate-container']/img"));
		String attributeValue = img_screen.getAttribute("alt");
	    System.out.println("Plate Attribute Value: " + attributeValue);
	    
   	 List<WebElement>  spanElements= driver.findElements(By.xpath("//div[@class='radio-option']/div/span"));
   	 for (WebElement spanElement : spanElements)
   	 {
         String no = spanElement.getText(); // Get the text of the current span element
         System.out.println(no); // Add it to the list
     }
	    
	    //convert plateNo to number 
	 //   String number = switchplateNo(attributeValue);
	//    System.out.println(number);
	    
	    // match with radio button 
	 //   switchplateNo(number);
	    
	
	    
	    // get list of radio button 
	   
	    
	    
	   
	    
//	    if (index >= 0 && index < spanElements.size()) {
//	      System.out.println();
//	    } else {
//	        throw new IndexOutOfBoundsException("Invalid index for radio options: " + index);
//	    }
/*
	    // Iterate through the spans and collect their text
	    for (int i = 0; i < spanElements.getSize(); i++) 
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
	    
	  */  
	    
	

	
	}
	    
	    
	    //************************************************************
	 //   int index = 0;
	    
	    public List<String> getSpanElementTexts()
	    {
	    	
	    	 List<WebElement>  spanElements= driver.findElements(By.xpath("//div[@class='radio-option']/div/span"));
	    	
	        List<String> spanTexts = new ArrayList<>(); // Create a list to store the span texts

	        for (WebElement spanElement : spanElements) {
	            String no = spanElement.getText(); // Get the text of the current span element
	            spanTexts.add(no); // Add it to the list
	        }

	        return spanTexts; // Return the list of span texts
	        
	        
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
	
	
	public static void matchSpanRadioOption(String number, List<WebElement> spanElements)
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
	        
	        
			if(spans[i].equals(number))
	        {
		   matchingOption = driver.findElement(By.xpath(xpath));
		   matchingOption.click();
		    System.out.println("Clicked on the radio option with value: " );
		    break; // Exit the loop after clicking
	        }
		        
		 }
	    

	    ColorVisionPage.getAttributeValueOfPlate();

	}
	
	
	
	
	
	
	
	
	
	
}
