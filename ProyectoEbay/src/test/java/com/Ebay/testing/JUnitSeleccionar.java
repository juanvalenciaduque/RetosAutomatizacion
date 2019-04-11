package com.Ebay.testing;

import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.Ebay.test.pom.ComprobarConexion;
import com.Ebay.test.pom.Driver;
import com.Ebay.test.pom.PomSeleccionar;


public class JUnitSeleccionar {
	
	static PomSeleccionar SeleccionarEbay;
	private Driver IDriver= new Driver();
	private ComprobarConexion Internet = new ComprobarConexion();

	@Before
	public void setUp() throws Exception {	
		SeleccionarEbay = new PomSeleccionar(IDriver.getDriver());
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void test() throws IOException, InterruptedException {
		assertFalse(Internet.conectadoAInternet());
		try {
			assertTrue(PomSeleccionar.explicitWait("Pes 2019"));
			SeleccionarEbay.seleccionar();
			}
		catch(Exception e) {
			System.out.println("Sin Conexion");
		}
				
	}


}
