package com.adopt.mpp.cucumber;

public class SampleCode {

	private boolean customMessageFlag;
	private String customMessage;
	private final String defaultMessage = "Hello World from Cucumber!";
	
	public String returnMessage(){
		if(customMessageFlag){
			return customMessage;
		}
		return defaultMessage;
	}
	
	public void concatenateDefaultMessageWithCustomMessage(){
		this.customMessage = customMessage + customMessage ;
	}
	
	public void setCustomMessage(String customMessage){
		this.customMessage = customMessage;
	}
	
	public void setCustomMessageFlag(boolean customMessageFlag){
		this.customMessageFlag = customMessageFlag;
	}
	
}