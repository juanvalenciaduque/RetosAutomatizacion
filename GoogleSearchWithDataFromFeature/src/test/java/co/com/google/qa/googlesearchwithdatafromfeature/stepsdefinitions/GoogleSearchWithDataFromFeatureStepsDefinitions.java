package co.com.google.qa.googlesearchwithdatafromfeature.stepsdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import co.com.googlepom.BusquedaGooglePom;
import co.com.googleutilities.BasePage;
import co.com.googleutilities.Driver;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchWithDataFromFeatureStepsDefinitions {
	static WebDriver driver;
	static BusquedaGooglePom Busqueda;
	private static Driver StartDriver;
	private Scenario scenario;
	static BasePage basepage;

	@Before
	public void Before(Scenario scenario) {
		this.scenario = scenario;
	}

	@Given("Juan Diego en el sitio de google")
	public void juan_Diego_en_el_sitio_de_google() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Juan Diego abre su navegador");
		StartDriver = new Driver(driver);
		driver = StartDriver.InicializarDriver("https://www.google.com/");
		basepage = new BasePage(driver);

		System.out.println("Juan Diego abre la pagina inicio de google");
		Busqueda = new BusquedaGooglePom(driver);
	}

	@When("El busca la palabra {string}")
	public void el_busca_la_palabra(String string) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("En la barra de busqueda escribe una palabra");
		Busqueda.EscribirTexto(string);

		System.out.println("Juan Diego da click en el botón buscar");
		Busqueda.RealizarBusqueda();
	}

	@Then("El verifica que la palabra {string} este en los resultados")
	public void el_verifica_que_la_palabra_este_en_los_resultados(String string) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		basepage.getEvidenceOnReport(scenario, driver);
		System.out.println("El actor captura los resultados de la busqueda");

		// assertTrue(basepage.explicitWait("Serenity"));
		basepage.HighlightCart(driver.findElement(By.xpath("//div[@id='center_col']")), "5", "green");
		System.out.println("El actor verifica que la búsqueda sea exitosa");
		Thread.sleep(4000);
		driver.quit();

	}
}
