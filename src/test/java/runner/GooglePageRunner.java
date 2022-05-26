package runner;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		publish=true,
		features="src/test/resources/SampleFeatures/GooglePage.feature",
		glue= {"stepDefinition"},
		monochrome=true,
		dryRun=false,
		plugin= {
		//		"pretty",
				"html:target/reports/HtmlReport.html",
		//		"usage:target/reports/UsageReport",
		//		"json:target/reports/JsonReport.json",
		//		"junit:target/reports/JunitReport",
		//		"rerun:target/failedScenarios.txt",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		}
		
		)


public class GooglePageRunner {

	
}
