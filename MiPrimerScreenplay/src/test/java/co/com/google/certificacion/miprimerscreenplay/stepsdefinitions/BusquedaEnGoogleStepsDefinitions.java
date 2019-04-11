package co.com.google.certificacion.miprimerscreenplay.stepsdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.Is.is;
import org.openqa.selenium.WebDriver;
import co.com.google.certificacion.miprimerscreenplay.questions.ThePhrase;
import co.com.google.certificacion.miprimerscreenplay.tasks.LookUpPhrase;
import co.com.google.certificacion.miprimerscreenplay.userinterfaces.GoogleHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;

public class BusquedaEnGoogleStepsDefinitions {
	
	GoogleHomePage googleHomePage;
	
	@Managed(driver = "chrome")
	    private WebDriver hisBrowser;
	    private Actor Diego = Actor.named("Juan Diego");
	    
	@Before
	 public void actorCanBrowseTheWeb() {
		Diego.can(BrowseTheWeb.with(hisBrowser));
    }

	@Given("^Juan Diego esta en el sitio de google$")
	public void juanDiegoEstaEnElSitioDeGoogle(){
		Diego.wasAbleTo(Open.browserOn().the(googleHomePage));
	}

	@When("^El busca la frase compuesta \"([^\"]*)\" compuesta \"([^\"]*)\"$")
	public void elBuscaLaFraseCompuestaCompuesta(String palabraUno, String palabraDos){
		Diego.attemptsTo(LookUpPhrase.composedOfTheWords(palabraUno, palabraDos));
	}

	@Then("^El verifica que la palabra \"([^\"]*)\" este en los resultados$")
	public void elVerificaQueLaPalabraEsteEnLosResultados(String resultadoEsperado){
		Diego.should(seeThat(ThePhrase.searched(), is(resultadoEsperado))); 
	}
	
}
