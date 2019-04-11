package com.ebay.qa.proyectoebayscreenplay.questions;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import static com.ebay.qa.proyectoebayscreenplay.userinterfaces.EbayHomePage.LOGO;

@Subject
public class EbayPageVisible implements Question<Boolean>{

	public Boolean answeredBy(Actor actor) {
		
		return the(LOGO).answeredBy(actor).isCurrentlyVisible();
	}

	public static Question<Boolean> isVisible() {
		return new EbayPageVisible();
	}
}