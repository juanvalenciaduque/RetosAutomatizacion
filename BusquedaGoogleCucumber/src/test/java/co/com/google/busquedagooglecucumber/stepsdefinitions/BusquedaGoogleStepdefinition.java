package co.com.google.busquedagooglecucumber.stepsdefinitions;

import static org.junit.Assert.assertTrue;
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

public class BusquedaGoogleStepdefinition {
	static WebDriver driver;
	static BusquedaGooglePom Busqueda;
	private static Driver StartDriver;
	private Scenario scenario;
	static BasePage basepage;

	@Before
	public void Before(Scenario scenario) {
		this.scenario = scenario;
	}

	@Given("Juan Diego is on the google home page")
	public void juan_Diego_is_on_the_google_home_page() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Juan Diego abre su navegador");
		StartDriver = new Driver(driver);
		driver = StartDriver.InicializarDriver("https://www.google.com/");
		basepage = new BasePage(driver);

		System.out.println("Juan Diego abre la pagina inicio de google");
		Busqueda = new BusquedaGooglePom(driver);
	}

	@When("he does the search")
	public void he_does_the_search() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("En la barra de busqueda escribe una palabra");
		Busqueda.EscribirTexto("Cucumber Java Serenity");

		System.out.println("Juan Diego da click en el botón buscar");
		Busqueda.RealizarBusqueda();
	}

	@Then("he validates the result is success")
	public void he_validates_the_result_is_success() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		basepage.getEvidenceOnReport(scenario, driver);
		System.out.println("El actor captura los resultados de la busqueda");

		assertTrue(basepage.explicitWait("Serenity"));
		basepage.HighlightCart(driver.findElement(By.xpath("//div[@id='center_col']")));
		System.out.println("El actor verifica que la búsqueda sea exitosa");
		Thread.sleep(4000);
		driver.quit();
	}

}
