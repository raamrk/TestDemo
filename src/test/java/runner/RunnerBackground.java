package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "featureFiles", glue={"stepDefinitions","hooks"}, dryRun =  false, tags = {"@Background"}) // dry run just to check if all step definitions are there as per feature file
public class RunnerBackground {

	//it is used to combine feature file and step definition
	//define runner

}
