package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:/Users/11017/workspace/Cucumebrframework/src/main/java/Feature/Deals.feature",
		glue={"stepDefination"},
		format={"pretty","html:test-output","json:json_output/cucumber.json"},
		dryRun=false,
		strict=true,
		monochrome=true // display the console output very readlble format  in  proper formate
		)
public class TestRunner {

}
