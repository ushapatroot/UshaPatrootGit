package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
// adding glue code
	// annotations are Gherkin language
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    System.out.println("Inside Step - user is on login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("Inside Step - user enters username and password");
	}

	@And("user clicks on login button")
	public void clicks_on_login_button() {
	   System.out.println("Inside Step - user clicks on login button");
	}

	@Then("user is logged in successfully")
	public void user_is_logged_in_successfully() {
	  System.out.println("Inside Step - user is logged in successfully");
	  
	// this is to test git push and comitt
			System.out.println("This is 2nd change for git");
	}

	
	
}
