package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src/test/resources/Features/LoginPage.feature",
		glue="stepDefinition",
		dryRun=false,
		plugin={"pretty","html:target/html-report.html"}
		)
public class TestRunner {

}
