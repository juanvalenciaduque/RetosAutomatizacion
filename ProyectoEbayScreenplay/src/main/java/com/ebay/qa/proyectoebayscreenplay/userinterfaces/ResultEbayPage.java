package com.ebay.qa.proyectoebayscreenplay.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ResultEbayPage extends PageObject{		
	public static final Target PRODUCT= Target.the("Product").locatedBy("(//h3[contains(text(),'{0}')])[1]");
}

