package lakshmi.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service("setterInjection")
public class GreetingServiceSetterInjection implements GreetingService {
	
	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hi from Setter Injection";
	}

}
