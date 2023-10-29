package lakshmi.springframework.spring6di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import lakshmi.springframework.spring6di.controllers.MyController;

@SpringBootTest
class Spring6DiApplicationTests {
	@Autowired
	ApplicationContext ac;
	
	@Autowired
	MyController mc;
	
	@Test
	void TestType1() {
		System.out.println("in test1");
		MyController mc=ac.getBean(MyController.class);
		System.out.println(mc.sayHello());
	}
	
	@Test
	void TestType2() {
		System.out.println("in test2");
		System.out.println(mc.sayHello());
	}

	@Test
	void contextLoads() {
	}

}
