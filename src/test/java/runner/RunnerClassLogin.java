package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "featureFiles/LoginCases.feature", glue="stepDefinitions")
public class RunnerClassLogin {

	//it is used to combine feature file and step definition
	//define runner

}
