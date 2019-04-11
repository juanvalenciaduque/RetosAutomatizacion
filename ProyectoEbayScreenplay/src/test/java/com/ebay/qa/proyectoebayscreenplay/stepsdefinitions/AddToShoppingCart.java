package com.ebay.qa.proyectoebayscreenplay.stepsdefinitions;

import java.util.List;
import org.openqa.selenium.WebDriver;
import com.ebay.qa.proyectoebayscreenplay.models.ExpectedResult;
import com.ebay.qa.proyectoebayscreenplay.models.Products;
import com.ebay.qa.proyectoebayscreenplay.tasks.AddToCart;
import com.ebay.qa.proyectoebayscreenplay.userinterfaces.EbayHomePage;
import com.ebay.qa.proyectoebayscreenplay.userinterfaces.ResultEbayPage;
import com.ebay.qa.proyectoebayscreenplay.utils.HighLight;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static com.ebay.qa.proyectoebayscreenplay.userinterfaces.ShoppingCart.PRODUCT;

public class AddToShoppingCart {
	
	EbayHomePage ebayHomePage;	
	ResultEbayPage resultEbayPage;
	@Managed(driver = "chrome")
    static WebDriver hisBrowser;
	HighLight highligth;
	private Actor Diego = Actor.named("Juan Diego");
	
	@Before
	 public void setUp() {		
		Diego.can(BrowseTheWeb.with(hisBrowser));
		highligth = new HighLight(hisBrowser);
   }

	@Given("^Juan Diego selected a product$")
	public void juan_Diego_selected_a_product(){
	}

	@When("^he wants to add to the cart$")
	public void he_wants_to_add_to_the_cart(List<Products> products){
		Diego.attemptsTo(AddToCart.theProduct(products.get(0)));
	}

	@Then("^he validates that the product is correct$")
	public void he_validates_that_the_product_is_correct(List<ExpectedResult> expectedResult) throws InterruptedException{
		highligth.HighlightCart(hisBrowser.findElement((PRODUCT)));
		Thread.sleep(1000);
	}

}
