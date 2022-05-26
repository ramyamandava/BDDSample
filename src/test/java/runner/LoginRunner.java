package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		publish=true,
		features="src/test/resources/SampleFeatures/Login.feature",
		glue= {"stepDefinition"},
		monochrome=true
		)
public class LoginRunner {

}
