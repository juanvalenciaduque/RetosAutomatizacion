package com.ebay.qa.proyectoebayscreenplay.stepsdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.StringContains.containsString;
import com.ebay.qa.proyectoebayscreenplay.exceptions.WrongSelection;
import com.ebay.qa.proyectoebayscreenplay.interactions.Clicking;
import com.ebay.qa.proyectoebayscreenplay.models.ExpectedResult;
import com.ebay.qa.proyectoebayscreenplay.models.Products;
import com.ebay.qa.proyectoebayscreenplay.questions.SelectedProducts;
import static com.ebay.qa.proyectoebayscreenplay.userinterfaces.ResultEbayPage.PRODUCT;
import java.util.List;
import org.openqa.selenium.WebDriver;

public class SelectProductStepsDefinitions {

	@Managed(driver = "chrome")
    private WebDriver hisBrowser;
	private Actor Diego = Actor.named("Juan Diego");
	
	@Before
	 public void setUp() {		
		Diego.can(BrowseTheWeb.with(hisBrowser));
   }
	
	@Given("^Juan Diego made and validated a search$")
	public void juan_Diego_made_and_validated_a_search(){		
	}

	@When("^he select a product$")
	public void he_select_a_product(List<Products> products){
		Diego.attemptsTo(Clicking.Selecting(PRODUCT.of(products.get(0).getproduct())));
	}

	@Then("^he validated the selection$")
	public void heValidatedTheSelection(List<ExpectedResult> expectedResult){
		Diego.should(seeThat(SelectedProducts.verified(), containsString(expectedResult.get(0).getExpectedResult())).orComplainWith(WrongSelection.class, WrongSelection.WRONG_SELECTION));
//		
	}
	
}



