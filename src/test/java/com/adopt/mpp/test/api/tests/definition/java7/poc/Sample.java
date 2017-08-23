package com.adopt.mpp.test.api.tests.definition.java7.poc;

import org.netbeans.jemmy.*;
//import org.netbeans.jemmy.ComponentChooser;
//import org.netbeans.jemmy.operators.JButtonOperator;
//import org.netbeans.jemmy.ComponentChooser;
import org.junit.Assert;

import com.adopt.mpp.test.api.tests.steps.poc.SampleCodeSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Sample{

	@Steps
	private SampleCodeSteps sampleCodeSteps;
	
	@Given("^I set the custom message as \"([^\"]*)\"$")
	public void setCustomMessage(String customMessage) throws InterruptedException{
		runIt(new Object());
		Thread.sleep(10);
		sampleCodeSteps.setCustomMessageStep(customMessage);
		sampleCodeSteps.concatenateDefaultMessageWithCustomMessage();
	}
		
	@When("^I set the custom message flag to \"([^\"]*)\"$")
	public void setCustomMessageFlag(String value){
		sampleCodeSteps.setCutomFlagStep(value);
	}
		
	@Then("^I should get the message \"([^\"]*)\"$")
	public void getMessage(String expectedValue){
		String actualMessage = sampleCodeSteps.getMessageStep();
		Assert.assertEquals(expectedValue, actualMessage);
	}
	
	public int runIt(Object param) {
		try {
			new ClassReference("org.netbeans.jemmy.explorer.GUIBrowser").startApplication();
		} catch(Exception e) {
			e.printStackTrace();
			return 1;
		}
		return 0;
	}
}
