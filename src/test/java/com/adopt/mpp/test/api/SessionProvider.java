//package com.adopt.mpp.test.api;
//
//import com.adopt.aop.altitude.server.is.business.security.Session;
//import com.adopt.framework.security.Context;
//
//public class SessionProvider {
//
//	private static final SessionProvider instance = new SessionProvider();
//	
//	private Session session;
//	private Context context;
//	
//	private SessionProvider(){}
//	
//	public static SessionProvider getInstance(){
//		if(instance == null){
//			
//		}
//		return instance;
//	}
//	
//	public void createSession(){
//		session = new Session() {
//			
//			@Override
//			public void initApplicationType() {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void registerApplicationSpecificManagers() {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void registerApplicationSpecificHomes() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
//		context = new Context(session);
//	}
//	
//	public Session getSession(){
//		return this.session;
//	}
//	
//	public Context getContext(){
//		return this.context;
//	}
//	
//}
