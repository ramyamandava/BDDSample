package runner;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		publish=true,
		features="@target/failedScenarios.txt",
		glue= {"stepDefinition"}
		)
public class rerunRunner {

	

}
