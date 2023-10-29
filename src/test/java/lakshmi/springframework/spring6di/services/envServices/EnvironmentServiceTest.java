package lakshmi.springframework.spring6di.services.envServices;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import lakshmi.springframework.spring6di.controllers.EnvironmentController;
@SpringBootTest
@ActiveProfiles({"prod","English"})
class EnvironmentServiceTest {
	@Autowired
	EnvironmentController ec;

	@Test
	void test() {
		System.out.println("Test: "+ ec.getEnvironment());
	}

}
