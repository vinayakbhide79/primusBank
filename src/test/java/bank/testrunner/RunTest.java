package bank.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
plugin= "pretty",
features = "src/test/resources/BUSINESS_LOGIC/CUCUMBER_SUITES",
tags = "@SmokeTest",
glue = "bank.cucumbermap",
monochrome = false

)
			

//REMEMBER EVERYTHING JUST BELOW PACKAGE AND EVEN ABOVE CLASS
public class RunTest {

	public static void main(String[] args) {
		

	}

}
