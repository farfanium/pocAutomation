//package com.adopt.mpp.test.api.tests.definition.java7.errorhandling;
//
//import com.adopt.mpp.test.api.tests.steps.errorhandling.PairingAttributeSteps;
//import com.adopt.mpp.test.api.tests.steps.errorhandling.SessionSteps;
//
//import cucumber.api.java.After;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import net.thucydides.core.annotations.Steps;
//
//public class ErrorHandlingDefinition{
//
//	@Steps
//	SessionSteps sessionSteps;
//	@Steps
//	PairingAttributeSteps pairingAttributeSteps;
//	
//	
//	private int pairingAttributeId;
//	private String pairingAttributeName;
//	
//	@Given("^A Session has been oppened$")
//	public void sessionHasOppened(){
//		sessionSteps.createSession();
//		sessionSteps.openSession();
//	}
//	
//	@Given("^A Planning has been created$")
//	public void planningidCreated() {
//		sessionSteps.createPlanning();
//	}
//	
//	@Given("^A user has created a Pairing Attribute with name \"([^\"]*)\"$")
//	public void createPairingAttributeWithName(String pairingAttributeName) {
//		this.pairingAttributeName = pairingAttributeName;
//		pairingAttributeSteps.buildPairingAttribute();
//		pairingAttributeSteps.configurePairingAttributeName(pairingAttributeName);
//		pairingAttributeSteps.createPairingAttribute();
//	}
//	
//	
//	@Given("^A user has created a Pairing Attribute with id \"([^\"]*)\"$")
//	public void createPairingAttributeWithId(Integer pairingAttributeId) {
//		this.pairingAttributeId = pairingAttributeId;
//		pairingAttributeSteps.buildPairingAttribute();
//		pairingAttributeSteps.configurePairingAttributeId(pairingAttributeId);
//		pairingAttributeSteps.createPairingAttribute();
//	}
//	
//	@When("^A new user attempts to create a new Pairing Attribute with the same name$")
//	public void createPairingAttributeSameName() {
//		pairingAttributeSteps.buildPairingAttribute();
//		pairingAttributeSteps.configurePairingAttributeName(pairingAttributeName);
//		pairingAttributeSteps.createPairingAttribute();
//	}
//	
//	@When("^A new user attempts to create a new Pairing Attribute with the same id$")
//	public void createPairingAttributeSameId() {
//		pairingAttributeSteps.buildPairingAttribute();
//		pairingAttributeSteps.configurePairingAttributeId(pairingAttributeId);
//		pairingAttributeSteps.configurePairingAttributeName("OTHER_NAME");
//		pairingAttributeSteps.createPairingAttribute();
//	}
//	
//	@Then("^The application must return the user friendly error message \"([^\"]*)\"$")
//	public void validateErrorMessage(String expectedErrorMessage) {
//		pairingAttributeSteps.validateExceptionErrorMessage(expectedErrorMessage);
//	}
//	
//	@After({"@ErrorHandling"})
//	public void teardown() {
//		pairingAttributeSteps.removePairingAttribute();
//		sessionSteps.closeSession();
//	}
//
//}