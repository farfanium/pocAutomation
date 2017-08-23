//package com.adopt.mpp.test.api.tests.steps.errorhandling;
//
//import com.adopt.aop.altitude.server.is.persistence.planning.Planning;
//import com.adopt.framework.BusinessValidationException;
//import com.adopt.framework.SystemErrorException;
//import com.adopt.mpp.test.api.SessionProvider;
//
//import net.thucydides.core.annotations.Step;
//
//public class SessionSteps {
//
//	private Planning planning;
//	private SessionProvider provider = SessionProvider.getInstance();
//	
//	@Step
//	public void createSession(){
//		provider.createSession();
//	}
//	
//	@Step
//	public void openSession(){
//		try {
//			provider.getSession().open("admin", "admin");
//		} catch (BusinessValidationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SystemErrorException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	@Step("Session Cleanup")
//	public void closeSession(){
//		provider.getSession().closeSession();
//	}
//	
//	@Step
//	public void createPlanning(){
//		planning = new Planning(provider.getContext());
//		planning.setId(4);
//		planning.setName("tst");
//		provider.getSession().setPlanning(planning);
//	}
//	
//}
