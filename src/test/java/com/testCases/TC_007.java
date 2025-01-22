package com.testCases;

import org.testng.annotations.Test;

import com.generic.BaseTest;
import com.POM.*;

public class TC_007 extends BaseTest
{
	@Test
	public void method23() throws InterruptedException
	{
		InstructionPage object1 = new InstructionPage(driver);
		object1.methodNavigateInstructionPage();

		ColorVisionPage object2 = new ColorVisionPage(driver);
		object2.methodmatchAll();
		object2.score();

		System.out.println("******************23/23*************************");
		object2.restartTest();

	}

	@Test
	public void methodCantSee() throws InterruptedException
	{

		ColorVisionPage object2 = new ColorVisionPage(driver);
		object2.cantSee();
		object2.score();

		System.out.println("******************0/23*************************");
		object2.restartTest();

	}

	@Test
	public void methodRandom() throws InterruptedException
	{
		ColorVisionPage object2 = new ColorVisionPage(driver);
		object2.selectRandomOption();
		object2.score();

		System.out.println("******************random/23*************************");
		object2.restartTest();
	}















}
