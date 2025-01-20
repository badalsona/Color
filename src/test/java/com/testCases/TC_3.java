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

import lombok.val;

public class TC_3 
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
		
		
         
        
       		 
       		WebElement img_screen = driver.findElement(By.xpath("//div[@class='plate-container']/img"));
       	 	String attributeValue = img_screen.getAttribute("alt");
       	     System.out.println("Plate Attribute Value: " + attributeValue);
       		 
       	
       	
       		    
       		    
       	
       		 
	}
       		 
       		 
       		 
       	 }
  
