package lakshmi.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service("propertyInjectionCustomService")
public class GreetingServicePropertyInjection implements GreetingService {

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Property Injection says Hi";
	}

}
