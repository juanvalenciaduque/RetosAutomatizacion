package com.sophos.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class MiPrimerPruebaUnitaria {

	WebDriver driver; 
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
		//driver.close();
	}

	@Test
	public void test() {
		driver.get("http:\\www.google.com.uy");
		driver.findElement(By.name("q")).sendKeys("Selenium Screenshot java");
		driver.findElement(By.name("btnK")).submit();
		//Assert.assertEquals(5, 6);
	}
	
	@Test
	public void test2() {
		driver.get("http:\\www.bing.com.co");
		driver.findElement(By.name("q")).sendKeys("Selenium Screenshot java");
		driver.findElement(By.name("btnK")).submit();
		Assert.assertEquals("dos", "dos");
	}
	


}
