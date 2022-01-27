package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BackgroundExample {
	@Given("^To pass SSLC$")
	public void to_pass_SSLC() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
System.out.println("Passed 10th");
	}

	@Given("^To pass HSC$")
	public void to_pass_HSC() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Passed 12th");
	}


	@Given("^To apply for NEET exam$")
	public void to_apply_for_NEET_exam() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
System.out.println("Applied for NEET");
	}

	@When("^The student clears with good score$")
	public void the_student_clears_with_good_score() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Cleared NEET");

	}

	@Then("^Gets admission in good medical college$")
	public void gets_admission_in_good_medical_college() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Got into Govt. medical college");

	}

	@Given("^To apply for JEE exam$")
	public void to_apply_for_JEE_exam() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Applied for JEE Mains");

	}

	@When("^The student clears with good cutoff$")
	public void the_student_clears_with_good_cutoff() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Cleared both mains and advanced");

	}

	@Then("^Gets admission in good Anna University$")
	public void gets_admission_in_good_Anna_University() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Got into Anna university");

	}

	
}
