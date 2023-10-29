package lakshmi.springframework.spring6di.controllers;

import org.springframework.stereotype.Controller;

import lakshmi.springframework.spring6di.services.GreetingServiceImpl;

@Controller
public class MyController {
	private final GreetingServiceImpl greetingServiceImpl;
	
	public MyController() {
		super();
		this.greetingServiceImpl = new GreetingServiceImpl();
	}

	public String sayHello() {
		System.out.println("I'm in Contoller");
		return greetingServiceImpl.sayGreeting();
	}
}
