package com.Ebay.testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ JUnitBuscar.class, JUnitSeleccionar.class, JUnitAñadirCarrito.class, JUnitEliminarCarrito.class })
public class JUnitSuite {
	
}


