package lakshmi.springframework.spring6di.services.envServices;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("envService")
@Profile("uat")
public class EnvironmentServiceUAT implements EnvironmentService {

	@Override
	public String getEnv() {
		// TODO Auto-generated method stub
		return "User Acceptance Testing";
	}

}
