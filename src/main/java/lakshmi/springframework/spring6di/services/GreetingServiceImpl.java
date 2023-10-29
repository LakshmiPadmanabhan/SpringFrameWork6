package lakshmi.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Greetings from Service! Hello Everyone";
	}

}
