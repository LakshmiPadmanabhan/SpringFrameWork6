package lakshmi.springframework.spring6di.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import lakshmi.springframework.spring6di.services.envServices.EnvironmentService;

@Controller
public class EnvironmentController {

	private final EnvironmentService envService;

	public EnvironmentController(EnvironmentService envService) {
		super();
		this.envService = envService;
	}
	public String getEnvironment() {
		return "Your working env is set to: "+ envService.getEnv();
	}
	
}
