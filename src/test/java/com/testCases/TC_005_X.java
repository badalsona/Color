package com.testCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_005_X
{

	public static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://color-vision-vercel.vercel.app/");

		//instruction page navigate
		driver.findElement(By.xpath("//button[@class='next-button']")).click();
		driver.findElement(By.xpath("//button[@class='next-button']")).click();
		driver.findElement(By.xpath("//button[@class='next-button']")).click();

		//click till result page
		
		methodClickonRadioOption();
		
		
		
		
		
		
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
		
			//System.out.println("method implemented Page Number: " + pageNo);
	    
			return pageNo;

	}
	
	public static void methodClickonRadioOption() throws InterruptedException
	{
	  
	  for(int click=0;click<=22;click++)
	  {
		WebElement img_screen = driver.findElement(By.xpath("//div[@class='plate-container']/img"));
		String attributeValue = img_screen.getAttribute("alt");
		System.out.println("Plate Attribute Value: " + attributeValue);
		
		String number=methodconvertplattonumber(attributeValue);
		System.out.println("plate no converted to number  ="+number);

		List<WebElement>  spanElements= driver.findElements(By.xpath("//div[@class='radio-option']/div/span"));
		for (WebElement spanElement : spanElements)
		{
			String spanno = spanElement.getText(); // Get the text of the current span element
			System.out.println(spanno); // Add it to the list
			
			if(number.equalsIgnoreCase(spanno))
			{
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@class='answer-options']//div/span")).click();
				System.out.println("==========clicked on matched radio option=============");
				Thread.sleep(2000);
				break;
			}
		}
	  }
	}  
}
