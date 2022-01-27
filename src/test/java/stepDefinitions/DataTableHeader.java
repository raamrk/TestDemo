package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DataTableHeader {
	WebDriver driver;

	@Given("^User has navigated to the correct page$")
	public void user_has_navigated_to_the_correct_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^User enters the valid credentials from datatable with header$")
	public void user_enters_the_valid_credentials_from_datatable_with_header(DataTable dataTable) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	List<Map<String,String>> maps	= dataTable.asMaps(String.class, String.class);
	    String username = maps.get(0).get("Username");
	    String password = maps.get(0).get("Password");	    
	    driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	    
	}

	@When("^Click the login or submit button$")
	public void click_the_login_or_submit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("Submit")).click();

	}



}
