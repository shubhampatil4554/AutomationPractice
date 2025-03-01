package org03.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = { "src/test/resources/features/TricentisOrderPlacement.feature" }, // feature file or folder name
		glue = { "org01.stepDefination" },
		//tags = "@Smoke",
		//tags = "@Regression or @Smoke",
		//tags = "@Regression and not @Smoke",
		plugin = { "pretty","html:target/cucumber-reports.html", 
				"json:json_output/cucumber.json",
						"junit:junit_xml/cucumber.xml" }, 
		monochrome = true, dryRun = false, publish = true)
public class TestRunner extends AbstractTestNGCucumberTests {

}
