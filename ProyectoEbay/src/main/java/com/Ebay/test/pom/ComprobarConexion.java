package com.Ebay.test.pom;

import java.io.IOException;

public class ComprobarConexion {
	
	
	public boolean conectadoAInternet() throws InterruptedException, IOException
	{
	    String comando = "ping -c 1 Ebay.com";
	    return (Runtime.getRuntime().exec(comando).waitFor() == 0);
	}
}
