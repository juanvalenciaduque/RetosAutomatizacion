package co.com.google.qa.miprimerselenium.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.bing.com/")
public class GoogleHomePage extends PageObject {

	@FindBy(name = "q")
	private WebElementFacade searchTerms;

	@FindBy(name = "go")
	private WebElementFacade lookupButton;

	public void enterKeywords(String keyword) {
		searchTerms.typeAndEnter(keyword);
	}

	public void lookupTerms() {
		lookupButton.waitUntilClickable().click();
	}

}
