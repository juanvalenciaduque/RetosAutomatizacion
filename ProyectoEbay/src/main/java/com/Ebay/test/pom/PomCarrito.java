package com.Ebay.test.pom;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.itextpdf.text.DocumentException;

public class PomCarrito {
	
	private WebDriver driver;
	private ScreenshotsHighlight screenshot = new ScreenshotsHighlight();
	private By Cantidad = By.xpath("//div[contains(@class,'u-flL qtyCntVal vi-bboxrev-posabs vi-bboxrev-dsplinline')]//input[contains(@value,'1')]");
	private By Carrito = By.xpath("//a[contains(text(),'Agregar al carro de compras')]");
	private By Highlight = By.xpath("//div[@class='grid__group details']");
	
	public PomCarrito(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}	
	
	public void cantidad() {
		driver.findElement(Cantidad).clear();
		driver.findElement(Cantidad).sendKeys("2");
	}
	
	public void carrito() {
		driver.findElement(Carrito).click();
		
	}
	
	
	public void AgregarCarrito() throws IOException, InterruptedException, DocumentException{
	cantidad();
	carrito();	
	screenshot.HighlightCart(driver.findElement((Highlight)));
	Thread.sleep(4000);
	screenshot.Screenshot("Agregar Al Carrito");
	}
	
	
	
}
