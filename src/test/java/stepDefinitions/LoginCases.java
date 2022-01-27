package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class LoginCases {
	WebDriver driver;
	@Given("^User has navigated to Login page$")
	public void user_has_navigated_to_Login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^User enters the valid username and password$")
	public void user_enters_the_valid_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}

	@When("^Clicks on login button$")
	public void clicks_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("Submit")).click();
	}

	@Then("^User will be able to see the home page$")
	public void user_will_be_able_to_see_the_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Boolean result = driver.findElement(By.partialLinkText("Welcome Rk")).isDisplayed();
		Assert.assertTrue(result);
		System.out.println("True");
	}
	
	@When("^User enters the invalid username and password$")
	public void user_enters_the_invalid_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtUsername")).sendKeys("Admins");
		driver.findElement(By.id("txtPassword")).sendKeys("123");
	}
	  
	

	@Then("^User will not be able to see the home page$")
	public void user_will_not_be_able_to_see_the_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Boolean result = driver.findElement(By.xpath("//*[contains(text(),'Invalid credentials')]")).isDisplayed();
		Assert.assertTrue(result);
		System.out.println("True");
	    
	}
	    


}
