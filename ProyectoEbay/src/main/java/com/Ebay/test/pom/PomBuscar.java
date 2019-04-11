 package com.Ebay.test.pom;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.itextpdf.text.DocumentException;

public class PomBuscar {
	
	ScreenshotsHighlight screenshot = new ScreenshotsHighlight();
	private WebDriver driver;
	private By cmbCategoria = By.xpath("//select[@name='_sacat']");
	private By txtBuscar = By.xpath("//input[@id='gh-ac']");
	private By OptionVideoJuegosConsolas = By.xpath("//option[@value='1249']");
	private By btnBuscar = By.xpath("//input[@id='gh-ac']");
	
	public PomBuscar(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}	
	
	public void cmbCategoria() {
		driver.findElement(cmbCategoria).click();
	}
	
	public void txtBuscar() throws InterruptedException {
		driver.findElement(txtBuscar).sendKeys("Pes 2019");	
	}	
	
	public void OptionVideoJuegosConsolas() {
	driver.findElement(OptionVideoJuegosConsolas).click();
	}
	
	public void btnBuscar() {
	driver.findElement(btnBuscar).submit();
	}
	
		
	public void Buscar() throws IOException, InterruptedException, DocumentException {
		screenshot.Screenshot("Pagina");
		cmbCategoria();
		OptionVideoJuegosConsolas();
		txtBuscar();
		screenshot.Screenshot("Busqueda Ingresada");
		btnBuscar();
		screenshot.Screenshot("Resultado Busqueda");
	}
	
}