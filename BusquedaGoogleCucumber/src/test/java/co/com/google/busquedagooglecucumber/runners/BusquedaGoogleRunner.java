package co.com.google.busquedagooglecucumber.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
	glue= ("co.com.google.busquedagooglecucumber.stepsdefinitions"),
	snippets = SnippetType.CAMELCASE,
	plugin = {"pretty", "html:target/cucumber", "json:target/cucumber/cucumber.json"})

public class BusquedaGoogleRunner {
}
