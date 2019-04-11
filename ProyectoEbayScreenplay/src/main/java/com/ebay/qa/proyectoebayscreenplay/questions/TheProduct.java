package com.ebay.qa.proyectoebayscreenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import static com.ebay.qa.proyectoebayscreenplay.userinterfaces.ResultEbayPage.PRODUCT;

@Subject
public class TheProduct implements Question<String>  {
	
	private String Condicional;
		
	public TheProduct(String Condicional) {
		this.Condicional=Condicional;
	}

	@Override	
	public String answeredBy(Actor actor) {	
		return PRODUCT.of(Condicional).resolveFor(actor).getTextContent();				
	}
	
	public static TheProduct searched(String Condicional) {
		return new TheProduct(Condicional);
	}	
}
