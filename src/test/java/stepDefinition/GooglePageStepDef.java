package stepDefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GooglePageStepDef {

	 WebDriver driver;
	@Given("User is on Google Home Page")
	public void user_is_on_google_home_page() {
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("https://www.google.com/");
		
	}
	@When("User search Java Tutorial")
	public void user_search_java_tutorial() {
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("Java Tutorial");
		search.submit();
	  
	}
	@Then("Java Result Page should be displayed")
	public void java_result_page_should_be_displayed() {
	  String title=driver.getTitle();
	  Assert.assertEquals("Java Tutorial - Google Search", title);
	  
	}

	@When("User search Selenium Tutorial")
	public void user_search_Selenium_tutorial() {
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("Selenium Tutorial");
		search.submit();
	  
	}
	@Then("Selenium Result Page should be displayed")
	public void Selenium_result_page_should_be_displayed() {
	  String title=driver.getTitle();
	  Assert.assertEquals("Selenium Tutorial - Google Searc", title);
	  
	}
@After
public void attachScreenshotWithReport(Scenario scenario) throws IOException
{
	if(scenario.isFailed())
	{
		TakesScreenshot screen=(TakesScreenshot)driver;
		File src=screen.getScreenshotAs(OutputType.FILE);
		byte[] img=FileUtils.readFileToByteArray(src);
		scenario.attach(img, "image/png", "image1");
		
		
	}
}

}
