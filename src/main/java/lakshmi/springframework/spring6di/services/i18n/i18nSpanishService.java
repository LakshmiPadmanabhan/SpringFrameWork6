package lakshmi.springframework.spring6di.services.i18n;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import lakshmi.springframework.spring6di.services.GreetingService;
@Profile("Spanish")
@Service("i18nService")
public class i18nSpanishService implements GreetingService {

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "hola, buenos días- Spanish";
	}

}
