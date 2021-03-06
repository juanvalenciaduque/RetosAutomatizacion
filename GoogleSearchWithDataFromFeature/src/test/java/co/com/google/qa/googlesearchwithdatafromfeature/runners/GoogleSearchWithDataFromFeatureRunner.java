package co.com.google.qa.googlesearchwithdatafromfeature.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
	glue= ("co.com.google.qa.googlesearchwithdatafromfeature.stepsdefinitions"),
	snippets = SnippetType.CAMELCASE,
	plugin = {"pretty", "html:target/cucumber", "json:target/cucumber/cucumber.json"})

public class GoogleSearchWithDataFromFeatureRunner {

}
