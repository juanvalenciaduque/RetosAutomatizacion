package com.Ebay.testing;

import static org.junit.Assert.assertFalse;
import java.io.IOException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.Ebay.test.pom.ComprobarConexion;
import com.Ebay.test.pom.Driver;
import com.Ebay.test.pom.PomCarrito;

public class JUnitAñadirCarrito {

	private PomCarrito AñadirAlCarrito;
	private Driver IDriver= new Driver();
	private ComprobarConexion Internet = new ComprobarConexion();
	
	
	@Before
	public void setUp() throws Exception {
		AñadirAlCarrito = new PomCarrito(IDriver.getDriver());
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws IOException, InterruptedException {
		assertFalse(Internet.conectadoAInternet());
		try {
			AñadirAlCarrito.AgregarCarrito();
		}
		catch(Exception e) {
			System.out.println("Sin Conexion");
		}
		
	
	
	}

}
