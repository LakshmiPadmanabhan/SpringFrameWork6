package lakshmi.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lakshmi.springframework.spring6di.services.GreetingServiceImpl;

@SpringBootTest
class SetterInjectedControllerTest {
	@Autowired
	SetterInjectedController sic;
//	@BeforeEach
//	void setUp() throws Exception {
//		sic=new SetterInjectedController();
//		sic.setGs(new GreetingServiceImpl());
//	}

	@Test
	void test() {
		System.out.println("In SIC: "+sic.sayhello());
	}

}
