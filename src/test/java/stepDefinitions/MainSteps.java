package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
	@Given("User is on NetBanking landing page")
	public void user_is_on_net_banking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User is on NetBanking landing page");
	    
	    System.out.println("Change 1 - IST user");
	    
	    System.out.println("Change 2 - EST user");
	    
	    System.out.println("3 - IST user - Merge changes");
	}
	
	public void new_test() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("New test added");

	}
	
	
	
//	@When("user login to application with {string} and {string}")
//	public void user_login_to_application_with_and (String username, String pwd) {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println(username +" and password is "+pwd);
//	}
	
	@When("^user login to application with (.+) and (.+)$")
	public void user_login_to_application_with_and (String username, String pwd) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(username +" and password is "+pwd);
	}
	
	@When("user login to application")
	public void user_login_to_application(List<String> data) {
		System.out.println("First name is "+data.get(0));
		System.out.println("Last name is "+data.get(1));
		System.out.println("Email ID is "+data.get(2));

	}

	
	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I validate the outcomes");
	}
	@Then("check more outcomes")
	public void check_more_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("check more outcomes");
	}

	  @Given ("setup the entries in database")
	  public void setupEntries() {
		  System.out.println("set up Entries");
	  }
	  @When ("launch the browser from config variables")
	  public void launchBrowser() {
		  System.out.println("launch Browser");
		  
	  }
	  
	  @When("hit the home page url of the banking site")
	  public void hitHomePage() {
		  System.out.println("Hit Home Page");
		  
	  }

}
