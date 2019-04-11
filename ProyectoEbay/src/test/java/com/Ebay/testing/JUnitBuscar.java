package com.Ebay.testing;

import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.Ebay.test.pom.ComprobarConexion;
import com.Ebay.test.pom.Driver;
import com.Ebay.test.pom.PomBuscar;


public class JUnitBuscar {
	private PomBuscar BuscarEbay;
	private Driver IDriver = new Driver();
	private ComprobarConexion Internet = new ComprobarConexion();
		
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDriver.exe");
		BuscarEbay = new PomBuscar(IDriver.getDriver());				
	}	
	
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException, IOException{
			assertFalse(Internet.conectadoAInternet());
		try {
			IDriver.getDriver().get("https://www.ebay.com");
			IDriver.getDriver().getCurrentUrl();
			assertEquals("https://www.ebay.com/", IDriver.getDriver().getCurrentUrl());	
			IDriver.getDriver().manage().window().maximize();
			BuscarEbay.Buscar();			
		}
		catch(Exception e) {
			System.out.println("Sin Conexion");
		}		
		
	}
}
