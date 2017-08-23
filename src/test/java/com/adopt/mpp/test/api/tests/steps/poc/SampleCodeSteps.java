package com.adopt.mpp.test.api.tests.steps.poc;

import com.adopt.mpp.cucumber.SampleCode;

import net.thucydides.core.annotations.Step;

public class SampleCodeSteps {

	private SampleCode sampleCode = new SampleCode();
	
	@Step("Set CustomMessage step")
	public void setCustomMessageStep(String customMessage){
		sampleCode.setCustomMessage(customMessage);
	}
	
	@Step
	public String getMessageStep(){
		return sampleCode.returnMessage();
	}
	
	@Step
	public void concatenateDefaultMessageWithCustomMessage(){
		sampleCode.concatenateDefaultMessageWithCustomMessage();
	}
	
	@Step
	public void setCutomFlagStep(String value){
		if("on".equals(value)){
			sampleCode.setCustomMessageFlag(true);
		}else if("off".equals(value)){
			sampleCode.setCustomMessageFlag(false);	
		}
		
		sampleCode.setCustomMessageFlag(false);	
	}
	
}
