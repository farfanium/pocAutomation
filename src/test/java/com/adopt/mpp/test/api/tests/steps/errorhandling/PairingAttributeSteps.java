//package com.adopt.mpp.test.api.tests.steps.errorhandling;
//
//import org.assertj.core.api.Assertions;
//
//import com.adopt.aop.crs.server.is.persistence.pairing.PairingAttribute;
//import com.adopt.aop.crs.server.is.persistence.pairing.PairingAttributeHome;
//import com.adopt.framework.BusinessValidationException;
//import com.adopt.framework.SystemErrorException;
//import com.adopt.mpp.test.api.SessionProvider;
//
//import net.thucydides.core.annotations.Step;
//
//public class PairingAttributeSteps {
//
//	private PairingAttribute pairingAttribute;
//	private PairingAttributeHome pairingAttributeHome;
//	private SessionProvider provider = SessionProvider.getInstance(); 
//	private Throwable exception;
//	
//	@Step
//	public void createPairingAttribute(){
//		try {
//			pairingAttributeHome.create(pairingAttribute);
//			provider.getContext().getDatabase().commit();
//		} catch (BusinessValidationException | SystemErrorException e) {
//			exception = e;
//			e.printStackTrace();
//			try {
//				provider.getContext().getDatabase().rollback();
//			} catch (SystemErrorException e1) {
//				e1.printStackTrace();
//			}
//		}
//	}
//	
//	@Step
//	public void validateExceptionErrorMessage(String expectedErrorMessage){
//		Assertions.assertThat(exception).as("Validating Error Message:").hasMessage(expectedErrorMessage);
//	}
//	
//	@Step
//	public void configurePairingAttributeName(String pairingAttributeName){
//		pairingAttribute.setName(pairingAttributeName);
//	}
//	
//	@Step
//	public void configurePairingAttributeId(int pairingAttributeId){
//		pairingAttribute.setId(pairingAttributeId);
//	}
//	
//	@Step
//	public void buildPairingAttribute(){
//		pairingAttributeHome = PairingAttributeHome.instance(provider.getContext());
//		pairingAttribute  = (PairingAttribute) pairingAttributeHome.getInstance();
//		pairingAttribute.setActive(true);
//		pairingAttribute.setBiddable(false);
//		pairingAttribute.setId(4000);
//		pairingAttribute.setMinimumRest(11);
//		pairingAttribute.setName("TEST");
//		pairingAttribute.setPort(true);
//		pairingAttribute.setTimeStamp(1122312);
//	}
//	
//	@Step("Cleanup")
//	public void removePairingAttribute(){
//		try {
//			pairingAttributeHome.remove(pairingAttribute);
//			provider.getContext().getDatabase().commit();
//		} catch (SystemErrorException | BusinessValidationException e) {
//			e.printStackTrace();
//		}
//	}
//	
//}
