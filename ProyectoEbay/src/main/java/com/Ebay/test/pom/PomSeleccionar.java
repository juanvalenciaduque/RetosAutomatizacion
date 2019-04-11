package com.Ebay.test.pom;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.itextpdf.text.DocumentException;

public class PomSeleccionar 
{
	
	private static WebDriver driver;	
	private ScreenshotsHighlight screenshot = new ScreenshotsHighlight();

	private static By seleccionar = By.xpath("//h3[contains(text(),'Pro Evolution Soccer 2019 (PES 2019) ps4!!! nuevo ')]");
	
	public PomSeleccionar(WebDriver driver) {
		PomSeleccionar.driver=driver;
	}	
	
	public void seleccionar() throws IOException, DocumentException {
		driver.findElement(seleccionar).click();		
		screenshot.Screenshot("Producto Selecionado");
	}
		
	public static boolean explicitWait(String dato) {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 1);
        wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText(dato)));
        return true;
		}
		catch(Exception e) {
			return false;
			} 
		}	
}
