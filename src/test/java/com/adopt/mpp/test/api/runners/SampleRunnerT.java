package com.adopt.mpp.test.api.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/",
		glue = "com.adopt.mpp.test.api.tests.definition.java7",
		dryRun = false)
public class SampleRunnerT {
	
}
