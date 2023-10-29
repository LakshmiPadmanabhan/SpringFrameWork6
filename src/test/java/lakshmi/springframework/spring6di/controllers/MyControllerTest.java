package lakshmi.springframework.spring6di.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyControllerTest {

	@Test
	void sayHello() {
		MyController mc = new MyController();
		System.out.println(mc.sayHello());
		
	}

}
