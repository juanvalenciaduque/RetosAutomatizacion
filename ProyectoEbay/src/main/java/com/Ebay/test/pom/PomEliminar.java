package com.Ebay.test.pom;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.itextpdf.text.DocumentException;

public class PomEliminar {

	public WebDriver driver;
	private ScreenshotsHighlight screenshot = new ScreenshotsHighlight();

	private By btnEliminar = By.xpath("//span[2]//button[1]");
	
	public PomEliminar(WebDriver driver) {
		this.driver=driver;
	}	
	
	public void eliminar() throws IOException, InterruptedException, DocumentException {
		driver.findElement(btnEliminar).click();
		Thread.sleep(3000);
		screenshot.Screenshot("Eliminar del Carrito");		
		}
	
	public void eliminarproducto() throws IOException, InterruptedException, DocumentException {
		eliminar();		
		
	}
}
