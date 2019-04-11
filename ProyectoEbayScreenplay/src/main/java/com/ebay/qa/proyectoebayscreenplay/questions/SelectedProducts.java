package com.ebay.qa.proyectoebayscreenplay.questions;


import com.ebay.qa.proyectoebayscreenplay.userinterfaces.SelectedProduct;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

@Subject
public class SelectedProducts implements Question<String>  {
	
	public SelectedProducts() {
	}

	@Override
	public String answeredBy(Actor actor) {
				return SelectedProduct.NAME_PRODUCT.resolveFor(actor).getTextContent();
	}
	
	public static SelectedProducts verified() {
		return new SelectedProducts();
	}	
}
