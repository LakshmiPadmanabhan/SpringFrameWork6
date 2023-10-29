package lakshmi.springframework.spring6di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import lakshmi.springframework.spring6di.services.GreetingService;
@Controller
public class SetterInjectedController {
	
	//@autowired must be given above setter method and qualifier should be given in setter parameter or just after autowire .
	//If @autowired and @aulifier is given above property, on debugging we come to know that the setter is 
	//not executed, which is not the expected behaviour.
	
	
	GreetingService gs;
	@Autowired
	
	public void setGs(@Qualifier("setterInjection")GreetingService gs) {
		System.out.println("SetterInjectedController.setGs");
		this.gs = gs;
	}
	
	public String sayhello(){
		return gs.sayGreeting();
	}
}
