package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "featureFiles/TaggedHooks.feature", glue={"stepDefinitions", "hooks"}, dryRun =  false, tags = {"@Taggedhooks"}) // dry run just to check if all step definitions are there as per feature file
public class RunnerTaggedHooks {

	//it is used to combine feature file and step definition
	//define runner

}
