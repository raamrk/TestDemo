package stepDefinitions;

import cucumber.api.java.en.Given;

public class ExpressionsStepDefinitions {

	@Given("^I have (\\d+) laptop$")
	public void i_have_laptop(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Laptop = "  +arg1);
	}

	@Given("^I have a CGPA of (\\d+\\.\\d+)$")
	public void i_have_a_CGPA_of(float arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("CGPA is " +arg2);
	}

	@Given("^\"(.*?)\" is a friend of \"(.*?)\" and \"(.*?)\"$")
	public void is_a_friend_of_and(String name1, String name2, String name3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Names are " +name1+ " , " +name2+ " and " +name3  );
	}

	
}
