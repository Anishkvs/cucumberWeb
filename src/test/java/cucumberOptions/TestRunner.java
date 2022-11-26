package cucumberOptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
          features = "src/test/java/features",
	    glue={"stepDefinations"},stepNotifications = true)

public class TestRunner {

	/*
	 * Jenkin test
	 * 
	 */
	
	
}
