package com.ebay.qa.proyectoebayscreenplay.tasks;

import static com.ebay.qa.proyectoebayscreenplay.userinterfaces.EbayHomePage.SEARCH_BAR;
import static com.ebay.qa.proyectoebayscreenplay.userinterfaces.EbayHomePage.SEARCH_BUTTON;
import static com.ebay.qa.proyectoebayscreenplay.userinterfaces.EbayHomePage.CATEGORIES;
import static net.serenitybdd.screenplay.Tasks.instrumented;import com.ebay.qa.proyectoebayscreenplay.models.Products;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class LookUpProduct implements Task{

	Products product;
	
	public LookUpProduct(Products product) {
		this.product = product;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(			
				Enter.theValue(product.getproduct()).into(SEARCH_BAR),	
				SelectFromOptions.byVisibleText(product.getcategorie()).from(CATEGORIES),											
				Click.on(SEARCH_BUTTON));		
	}	
	
	public static LookUpProduct composedOfTheWords(Products products) {
		return instrumented(LookUpProduct.class, products);
			
	}
}
