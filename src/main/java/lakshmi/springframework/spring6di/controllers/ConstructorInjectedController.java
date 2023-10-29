package lakshmi.springframework.spring6di.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import lakshmi.springframework.spring6di.services.GreetingService;
@Controller
public class ConstructorInjectedController {

	private final GreetingService gs;

	public ConstructorInjectedController(@Qualifier("greetingServiceImpl")GreetingService gs) {
		super();
		this.gs = gs;
	}
	public String sayHello() {
		return gs.sayGreeting();
	}
	
}
