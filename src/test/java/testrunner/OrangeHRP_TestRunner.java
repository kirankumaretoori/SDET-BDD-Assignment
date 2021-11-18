package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(
		
		features = "src/test/java/featurefile" ,
		glue = "stepdefinitions" ,
		dryRun = false,
		strict = true,
		monochrome = true,
		format = {"pretty", "html:test-output"},
		tags = {"@SmokeTest , @RegressionalTest" }
		
		
		)


public class OrangeHRP_TestRunner {
	
	
	

}
