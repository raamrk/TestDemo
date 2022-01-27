package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "featureFiles", glue="stepDefinitions", dryRun = false, monochrome = true, tags = {"@multiple"})
public class RunnerMultiple {

	//it is used to combine feature file and step definition
	//define runner

}
