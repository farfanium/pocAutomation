//package com.adopt.mpp.test.api.tests.definition.java8.errorhandling;
//
//import com.adopt.mpp.test.api.tests.steps.errorhandling.PairingAttributeSteps;
//import com.adopt.mpp.test.api.tests.steps.errorhandling.SessionSteps;
//
//import net.thucydides.core.annotations.Steps;
//
//public class PairingAttributeDefinitionJava8{// implements En {
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
//	public PairingAttributeDefinitionJava8(){
//		
////		Given("^A Session has been oppened$", () -> {
////			sessionSteps.createSession();
////			sessionSteps.openSession();
////		});
////		
////		Given("^A Planning has been created$", () -> {
////			sessionSteps.createPlanning();
////		});
////		
////		Given("^A user has created a Pairing Attribute with  \"([^\"]*)\"$", (String pairingAttributeName) -> {
////			this.pairingAttributeName = pairingAttributeName;
////			pairingAttributeSteps.buildPairingAttribute();
////			pairingAttributeSteps.configurePairingAttributeName(pairingAttributeName);
////			pairingAttributeSteps.createPairingAttribute();
////		});
////		
////		
////		Given("^A user has created a Pairing Attribute with id \"([^\"]*)\"$", (Integer pairingAttributeId) -> {
////			this.pairingAttributeId = pairingAttributeId;
////			pairingAttributeSteps.buildPairingAttribute();
////			pairingAttributeSteps.configurePairingAttributeId(pairingAttributeId);
////			pairingAttributeSteps.createPairingAttribute();
////		});
////		
////		When("^A new user attempts to create a new Pairing Attribute with the same name$", () -> {
////			pairingAttributeSteps.buildPairingAttribute();
////			pairingAttributeSteps.configurePairingAttributeName(pairingAttributeName);
////			pairingAttributeSteps.createPairingAttribute();
////		});
////		
////		When("^A new user attempts to create a new Pairing Attribute with the same id$", () -> {
////			pairingAttributeSteps.buildPairingAttribute();
////			pairingAttributeSteps.configurePairingAttributeId(pairingAttributeId);
////			pairingAttributeSteps.configurePairingAttributeName("OTHER_NAME");
////			pairingAttributeSteps.createPairingAttribute();
////		});
////		
////		Then("^The application must return the user friendly error message \"([^\"]*)\"$", (String expectedErrorMessage) -> {
////			pairingAttributeSteps.validateExceptionErrorMessage(expectedErrorMessage);
////		});
////		
////		After(new String[]{"@ErrorHandling"}, () -> {
////			pairingAttributeSteps.removePairingAttribute();
////			sessionSteps.closeSession();
////		});
//	}
//	
//}