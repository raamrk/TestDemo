package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "featureFiles/LoginParameterization.feature", glue="stepDefinitions", strict = true, monochrome = true, plugin = {"html:report/WebReport", "json:report/jsonreport.json"})
public class RunnerParameterization {

	//it is used to combine feature file and step definition
	//define runner

}
