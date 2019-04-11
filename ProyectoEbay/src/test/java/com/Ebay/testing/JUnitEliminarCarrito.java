package com.Ebay.testing;

import static org.junit.Assert.assertFalse;
import java.io.IOException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.Ebay.test.pom.ComprobarConexion;
import com.Ebay.test.pom.Driver;
import com.Ebay.test.pom.PomEliminar;
import com.Ebay.test.pom.ScreenshotsHighlight;

public class JUnitEliminarCarrito {

	private PomEliminar EliminarProducto;
	private Driver IDriver= new Driver();
	private ComprobarConexion Internet = new ComprobarConexion();
	private ScreenshotsHighlight screenshot = new ScreenshotsHighlight();
	
	@Before
	public void setUp() throws Exception {
		EliminarProducto = new PomEliminar(IDriver.getDriver());
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		IDriver.getDriver().quit();
		screenshot.createPdf();
	}

	@Test
	public void test() throws InterruptedException, IOException {
		assertFalse(Internet.conectadoAInternet());
		try {
			EliminarProducto.eliminar();
		}
		catch(Exception e) {
			System.out.println("Sin Conexion");
		}
		
		
	}

}
