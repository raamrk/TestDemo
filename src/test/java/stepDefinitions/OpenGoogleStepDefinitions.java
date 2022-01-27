package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OpenGoogleStepDefinitions {
	WebDriver driver;
	@Given("^user is entering google\\.co\\.in$")
	public void user_is_entering_google_co_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
	    driver.get("https://www.google.com/");
	}

	@When("^User types the term \"([^\"]*)\"$")
	public void user_types_the_term(String term) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(term);
	}

	@When("^press the enter key$")
	public void press_the_enter_key() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("^The search results for chandler should appear on screen$")
	public void the_search_results_for_chandler_should_appear_on_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	Boolean result = driver.findElement(By.partialLinkText("chander")).isDisplayed();
	
	if(result) {
		System.out.println("true");
	}
	
	}


	
	    
	}



