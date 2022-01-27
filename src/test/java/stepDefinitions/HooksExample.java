package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksExample {
	@Given("^Thanos has infinity stones$")
	public void thanos_has_infinity_stones() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Thanos has infinity stones");
	}

	@When("^Thanos snaps his fingers$")
	public void thanos_snaps_his_fingers() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
System.out.println("When he snaps his fingers");
	}

	@Then("^evryone dies$")
	public void evryone_dies() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Everyone dies");
	}


	
	

}
