package com.sophos.test.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PomEbay {	
	
	public WebDriver driver;
	
	By cmbCategoria = By.xpath("//select[@name='_sacat']");
	By txtBuscar = By.xpath("//input[@id='gh-ac']");
	By OptionVideoJuegosConsolas = By.xpath("//option[@value='1249']");
	By btnBuscar = By.xpath("//input[@id='gh-ac']");
	
	public void cmbCategoria() {
		driver.findElement(cmbCategoria).click();
	}
	public void txtBuscar() {
	driver.findElement(txtBuscar).sendKeys("Pes2019");
	}
	
	public void OptionVideoJuegosConsolas() {
	driver.findElement(OptionVideoJuegosConsolas).click();
	}
	
	public void btnBuscar() {
	driver.findElement(btnBuscar).submit();
	}
	
}