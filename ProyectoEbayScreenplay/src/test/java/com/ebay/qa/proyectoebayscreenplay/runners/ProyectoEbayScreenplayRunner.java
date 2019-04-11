package com.ebay.qa.proyectoebayscreenplay.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)   
@CucumberOptions( features= "src/test/resources/features/RemoveFromCart.feature",
        glue = { "com.ebay.qa.proyectoebayscreenplay.stepsdefinitions" },
        snippets =  SnippetType.CAMELCASE
        )  
public class ProyectoEbayScreenplayRunner {

}
 