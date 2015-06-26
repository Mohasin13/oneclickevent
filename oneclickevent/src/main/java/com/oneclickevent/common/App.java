package com.oneclickevent.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import com.oneclickevent.bo.SignUpBo;
import com.oneclickevent.model.UserSignupModel;
 

public class App {

	 public static void main( String[] args )
	    {
	    	ApplicationContext appContext =  new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
	 
	    	SignUpBo signUpBo = (SignUpBo)appContext.getBean("signUpBo");
	 
	    	/** insert **/
	    	UserSignupModel signup = new UserSignupModel();
	    	signup.setMobile(986930);
	    	signup.setPassword("HAIO");
	    	signup.setVerified(true);
	    	signUpBo.save(signup);
	 
	    	/** select **/
	    	UserSignupModel signup2 = signUpBo.findBySignupModel(986930);
	    	System.out.println(signup2);
	 
	    	/** update **/
	    	signup2.setPassword("HAIO-1");
	    	signUpBo.update(signup2);
	 
	    	/** delete **/
	    	signUpBo.delete(signup2);
	 
	    	System.out.println("Done");
	    }
	
}
