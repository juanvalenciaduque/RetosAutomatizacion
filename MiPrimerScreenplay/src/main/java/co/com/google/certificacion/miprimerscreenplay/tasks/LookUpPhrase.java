package co.com.google.certificacion.miprimerscreenplay.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.Keys;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.google.certificacion.miprimerscreenplay.userinterfaces.GoogleHomePage.SEARCH_BAR;


public class LookUpPhrase implements Task{
	
	private String phrase;
	
	public LookUpPhrase(String phrase) {
		this.phrase = phrase;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(phrase).into(SEARCH_BAR).thenHit(Keys.ENTER));		
	}	
	
	public static LookUpPhrase composedOfTheWords(String palabraUno, String palabraDos) {
		
		return instrumented(LookUpPhrase.class, palabraUno +" "+ palabraDos);
			
	}
	

}
