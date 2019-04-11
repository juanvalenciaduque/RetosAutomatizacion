package com.linio.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PomBuscar {

	WebDriver driver;
	By txtBox = By.xpath("//div[@class='input-group hidden-sm-down input-group-search']//input[@placeholder='Busca productos']");
	By btnBuscar = By.xpath("//div[@class='input-group-btn']//span[@class='icon icon-inverse']");

	public PomBuscar(WebDriver driver) {
		this.driver = driver;
	}

	public void IngresarBusqueda() {
		driver.findElement(txtBox).sendKeys("PS4");
		;
	}

	public void Buscar() {
		driver.findElement(btnBuscar).submit();
		;
	}

}
