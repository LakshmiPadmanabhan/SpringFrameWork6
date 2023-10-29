package lakshmi.springframework.spring6di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lakshmi.springframework.spring6di.services.GreetingServiceImpl;

@SpringBootTest
class PropertyInjectedControllerTest {
	@Autowired
	PropertyInjectedController pic;
//	@BeforeEach
//	void setUp() throws Exception {
//		pic=new PropertyInjectedController();
//		pic.gs=new GreetingServiceImpl();
//	}

	@Test
	void sayHello() {
		System.out.println("In PIC: "+pic.sayHello());
	}

}
