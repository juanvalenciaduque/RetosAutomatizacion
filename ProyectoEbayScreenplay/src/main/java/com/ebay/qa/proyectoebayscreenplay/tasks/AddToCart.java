package com.ebay.qa.proyectoebayscreenplay.tasks;

import static com.ebay.qa.proyectoebayscreenplay.userinterfaces.SelectedProduct.ADD_TO_CART;
import static com.ebay.qa.proyectoebayscreenplay.userinterfaces.SelectedProduct.AMOUNT;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.ebay.qa.proyectoebayscreenplay.models.Products;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Clear;

public class AddToCart implements Task{
	
	Products product;
	
	public AddToCart(Products product) {
		this.product = product;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Clear.field(AMOUNT),
				Enter.theValue(product.getAmount()).into(AMOUNT),										
				Click.on(ADD_TO_CART));
	}
	
	
	public static AddToCart theProduct(Products products) {
		return instrumented(AddToCart.class, products);			
	}
}
