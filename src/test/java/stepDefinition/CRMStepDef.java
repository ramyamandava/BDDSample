package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CRMStepDef {
	
	@Before(value="@RegressionTest", order=1)
	public void readfromprop() {
		System.out.println("read from prop file");
	}
	
	@Before(order=2)
	public void intChrome() {
		System.out.println("Chrome");
	}
	
	
	
//	@Before("@RegressionTest")
//	public void intChrome() {
//		System.out.println("chrome");
//	}
//	
//	@Before("@SmokeTest")
//	public void intEdge() {
//		System.out.println("Edge");
//	}
//	@Before
//	public void initialize() {
//		System.out.println("Before each scenario");
//	}
//	@After
//	public void teardown() {
//		System.out.println("After each scenario");
//	}
//	
	@Given("User must have logged in")
	public void user_must_have_logged_in() {
	   System.out.println("User must have logged in");
	}
	@When("User create a new contact")
	public void user_create_a_new_contact() {
	   System.out.println("User create a new contact");
	}

	@When("User view a contact details")
	public void user_view_a_contact_details() {
		System.out.println("User view a contact details");
	}
	
	@When("User edit a contact")
	public void user_edit_a_contact() {
	  System.out.println("User edit a contact");
	}

	@When("User delete a contact")
	public void user_delete_a_contact() {
	   System.out.println("User delete a contact");
	}

	
	@When("User create a new Deal")
	public void user_create_a_new_Deal() {
	   System.out.println("User create a new Deal");
	}

	@When("User view a Deal details")
	public void user_view_a_Deal_details() {
		System.out.println("User view a Deal details");
	}
	
	@When("User edit a Deal")
	public void user_edit_a_Deal() {
	  System.out.println("User edit a Deal");
	}

	@When("User delete a Deal")
	public void user_delete_a_Deal() {
	   System.out.println("User delete a Deal");
	}
	
	
	
	@When("User create a new Task")
	public void user_create_a_new_Task() {
	   System.out.println("User create a new Task");
	}

	@When("User view a Task details")
	public void user_view_a_Task_details() {
		System.out.println("User view a Task details");
	}
	
	@When("User edit a Task")
	public void user_edit_a_Task() {
	  System.out.println("User edit a Task");
	}

	@When("User delete a Task")
	public void user_delete_a_Task() {
	   System.out.println("User delete a Task");
	}







}
