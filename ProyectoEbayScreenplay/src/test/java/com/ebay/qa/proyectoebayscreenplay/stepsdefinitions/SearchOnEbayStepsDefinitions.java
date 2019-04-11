package com.ebay.qa.proyectoebayscreenplay.stepsdefinitions;

import java.util.List;
import static org.hamcrest.Matchers.*;
import org.openqa.selenium.WebDriver;
import com.ebay.qa.proyectoebayscreenplay.models.ExpectedResult;
import com.ebay.qa.proyectoebayscreenplay.models.Products;
import com.ebay.qa.proyectoebayscreenplay.questions.TheProduct;
import com.ebay.qa.proyectoebayscreenplay.tasks.LookUpProduct;
import com.ebay.qa.proyectoebayscreenplay.tasks.OpenTheBrowser;
import com.ebay.qa.proyectoebayscreenplay.userinterfaces.EbayHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static org.hamcrest.core.Is.is;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class SearchOnEbayStepsDefinitions {
	
	EbayHomePage ebayHomePage;	
	@Managed(driver = "chrome")
    private WebDriver hisBrowser;
	private Actor Diego = Actor.named("Juan Diego");
	    
	    
	@Before
	 public void setUp() {		
		Diego.can(BrowseTheWeb.with(hisBrowser));
    }
	
	@Given("^Juan Diego wants to perform a search on ebay$")
	public void juanDiegoWantsToPerformASearchOnEbay(){			
		Diego.wasAbleTo(OpenTheBrowser.on(ebayHomePage));
	}
	
	@When("^Search Product on Ebay$")
	public void searchProductOnEbay(List<Products> products) throws InterruptedException{
		Diego.attemptsTo(LookUpProduct.composedOfTheWords(products.get(0)));
		Diego.remember("product", products.get(0).getproduct());
	}
	
	@Then("^he check the result$")
	public void heCheckTheResult(List<ExpectedResult> expectedResult){
		Diego.should(seeThat(TheProduct.searched(Diego.recall("product")), is(expectedResult.get(0).getExpectedResult())));
	}
}	

