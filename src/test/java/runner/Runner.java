package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class	)
@CucumberOptions(
	 monochrome = true,
    features = "./src/test/resources/features/first.feature",
    dryRun = false,
     glue = "first" ,
     plugin = { "pretty","html: cucumber-html-reports",
     "json: features/cucumber.json" }
     )		



public class Runner {

}
