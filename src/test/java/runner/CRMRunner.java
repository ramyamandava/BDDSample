package runner;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		publish=true,
		features="src/test/resources/TaggedFeatures",
		glue= {"stepDefinition"},
		monochrome=true,
	//  tags="@RegressionTest"
	//	tags="@RegressionTest or @SmokeTest"
		tags="@PhaseOne and @RegressionTest or @PhaseOne and @SmokeTest"
		//dryRun=false,
		//plugin= {
		//		"pretty",
		//		"html:target/reports/HtmlReport.html",
		//		"usage:target/reports/UsageReport",
		//		"json:target/reports/JsonReport.json",
		//		"junit:target/reports/JunitReport",
		//		"rerun:target/failedScenarios.txt",
		//		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		//}
		
		)


public class CRMRunner {

	
}
