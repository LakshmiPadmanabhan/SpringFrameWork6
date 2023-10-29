package lakshmi.springframework.spring6di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import lakshmi.springframework.spring6di.services.GreetingService;

@Controller
public class PropertyInjectedController {

	@Qualifier("propertyInjectionCustomService")
	@Autowired
	GreetingService gs;
	public String sayHello() {
		return gs.sayGreeting();
	}
}
