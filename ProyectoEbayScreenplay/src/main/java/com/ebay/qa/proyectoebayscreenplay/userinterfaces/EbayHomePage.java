package com.ebay.qa.proyectoebayscreenplay.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.ebay.com/")
public class EbayHomePage extends PageObject {
	
	    public static final Target SEARCH_BAR = Target.the("Barra de busqueda")    		
	            .located(By.xpath("//input[@placeholder='Buscar artículos']"));
	    
	    public static final Target CATEGORIES = Target.the("Seleccion Categoria de Busqueda")
	            .located(By.xpath("//select[@id='gh-cat']"));	
	    
	    public static final Target SEARCH_BUTTON = Target.the("Boton Buscar")
	            .located(By.xpath("//input[@id='gh-btn']"));
	    
	    public static final Target LOGO = Target.the("Logo")
	            .located(By.xpath("//img[@id='gh-logo']"));
}

