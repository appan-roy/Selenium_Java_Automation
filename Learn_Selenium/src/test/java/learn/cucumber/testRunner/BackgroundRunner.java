package learn.cucumber.testRunner;

import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
		features="FeatureBackground", 
		glue={"stepDefBackground"},
		plugin={"html:target/cucumber-html-report","json:target/cucumber.json","pretty:target/cucumber-pretty.txt",
				"usage:target/cucumber-usage.json","junit:target/cucumber-results.xml"})
public class BackgroundRunner {

}
