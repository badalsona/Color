package com.generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.POM.ColorVisionPage;
import com.POM.InstructionPage;

public class BaseTest
{
	public WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://color-vision-vercel.vercel.app/");
		
		new InstructionPage(driver);
		new ColorVisionPage(driver);
	}
	
	
}
