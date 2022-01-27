package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DataTableUsingExamples {

WebDriver driver;
@Given("^User has navigated to the required page$")
public void user_has_navigated_to_the_required_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
}

@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enters_and(String username, String password) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("txtUsername")).sendKeys(username);
	driver.findElement(By.id("txtPassword")).sendKeys(password);
}

@When("^Click the submit button$")
public void click_the_submit_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.name("Submit")).click();
}


}
