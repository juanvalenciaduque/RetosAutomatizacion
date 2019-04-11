package co.com.google.qa.miprimerselenium.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)   
@CucumberOptions( features="src/test/resources/features",
        glue = { "co.com.google.qa.miprimerselenium.stepsdefinitions" },
        snippets =  SnippetType.CAMELCASE
        )  

public class BusquedaGoogleRunner {

}
