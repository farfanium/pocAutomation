package com.adopt.mpp.test.api.tests.definition.java8.poc;

import com.adopt.mpp.test.api.tests.steps.poc.SampleCodeSteps;

import net.thucydides.core.annotations.Steps;

public class SampleTestJava8 {// implements En {

	@Steps
	private SampleCodeSteps sampleCodeSteps;
	
	public SampleTestJava8(){
		
//		Given("^I set the custom message as \"([^\"]*)\"$", (String customMessage) -> {
//			sampleCodeSteps.setCustomMessageStep(customMessage);
//		});
//		
//		When("^I set the custom message flag to \"([^\"]*)\"$", (String value) -> {
//			sampleCodeSteps.setCutomFlagStep(value);
//		});
//		
//		Then("^I should get the message \"([^\"]*)\"$", (String expectedValue) -> {
//			String actualMessage = sampleCodeSteps.getMessageStep();
//			Assertions.assertThat(expectedValue).isEqualTo(actualMessage);
////			Assert.assertEquals(expectedValue, actualMessage);
//		});
	}
}