package com.ebay.qa.proyectoebayscreenplay.stepsdefinitions;

import org.openqa.selenium.WebDriver;
import com.ebay.qa.proyectoebayscreenplay.userinterfaces.EbayHomePage;
import com.ebay.qa.proyectoebayscreenplay.userinterfaces.ResultEbayPage;
import static com.ebay.qa.proyectoebayscreenplay.userinterfaces.ShoppingCart.DELETE_FROM_CART;
import com.ebay.qa.proyectoebayscreenplay.interactions.Clicking;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class RemoveToCart {
	
	EbayHomePage ebayHomePage;	
	ResultEbayPage resultEbayPage;
	@Managed(driver = "chrome")
    private WebDriver hisBrowser;
	private Actor Diego = Actor.named("Juan Diego");
	
	@Before
	 public void setUp() {		
		Diego.can(BrowseTheWeb.with(hisBrowser));
   }
	
	@Given("^Juan Diego has a product in the cart$")
	public void juan_Diego_has_a_product_in_the_cart(){
	}

	@When("^he wants to eliminate the product from the cart$")
	public void he_wants_to_eliminate_the_product_from_the_cart() throws InterruptedException{
		Diego.attemptsTo(Clicking.Selecting(DELETE_FROM_CART));
	}

	@Then("^he validates that the cart is empty$")
	public void he_validates_that_the_cart_is_empty(){
	}
}
