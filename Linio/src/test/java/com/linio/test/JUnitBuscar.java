package com.linio.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.linio.pom.Driver;
import com.linio.pom.PomBuscar;

public class JUnitBuscar {

	private PomBuscar BuscarLinio;
	private Driver IDriver = new Driver();

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDriver.exe");
		BuscarLinio = new PomBuscar(IDriver.getDriver());
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception {

		IDriver.getDriver().get("https://www.linio.com");
		IDriver.getDriver().manage().window().maximize();
		BuscarLinio.IngresarBusqueda();
		BuscarLinio.Buscar();

	}

}
