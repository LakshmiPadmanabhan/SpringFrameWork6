package lakshmi.springframework.spring6di.controllers.i18n;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import lakshmi.springframework.spring6di.services.GreetingService;
@Controller
public class MyI18nController {
	private final GreetingService gs;
	
	public MyI18nController(@Qualifier("i18nService")GreetingService gs) {
		super();
		this.gs = gs;
	}


	public String sayHello()
	{
		return gs.sayGreeting();
	}
}
