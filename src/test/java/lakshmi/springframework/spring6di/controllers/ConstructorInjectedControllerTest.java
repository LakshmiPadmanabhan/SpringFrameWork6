package lakshmi.springframework.spring6di.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lakshmi.springframework.spring6di.services.GreetingServiceImpl;
@SpringBootTest
class ConstructorInjectedControllerTest {
	@Autowired
	ConstructorInjectedController cic;

//	@BeforeEach
//	void setUp() throws Exception {
//		cic=new ConstructorInjectedController(new GreetingServiceImpl());
//	}

	@Test
	void test() {
		System.out.println("In CIC: "+cic.sayHello());
	}

}
