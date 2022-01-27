package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginParameterization {
	
	WebDriver driver;

	@Given("^User has navigated to Login page correctly$")
	public void user_has_navigated_to_Login_page_correctly() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^User enters the valid username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enters_the_valid_username_and_password(String username, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	}

	@When("^Click on the login button$")
	public void click_on_the_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("Submit")).click();
	}

	@Then("^User will be able to see the welcome page$")
	public void user_will_be_able_to_see_the_welcome_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Boolean result = driver.findElement(By.xpath("//img[@width = '283']")).isDisplayed();
		Assert.assertTrue(result);
		System.out.println("True");
	}


}

