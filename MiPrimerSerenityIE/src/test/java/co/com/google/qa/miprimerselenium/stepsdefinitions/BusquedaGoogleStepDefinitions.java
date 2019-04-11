package co.com.google.qa.miprimerselenium.stepsdefinitions;

import co.com.google.qa.miprimerselenium.steps.EndUserSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BusquedaGoogleStepDefinitions {

	@Steps
	EndUserSteps Diego;

	@Given("^Juan Diego en el sitio de google$")
	public void juanDiegoEnElSitioDeGoogle() {
		Diego.is_the_home_page();
	}

	@When("^El busca la palabra \"([^\"]*)\"$")
	public void elBuscaLaPalabra(String Buscar) {
		Diego.looks_for(Buscar);
	}

	@Then("^El verifica que la palabra \"([^\"]*)\" este en los resultados$")
	public void elVerificaQueLaPalabraEsteEnLosResultados(String expectedResult) {

	}

}
