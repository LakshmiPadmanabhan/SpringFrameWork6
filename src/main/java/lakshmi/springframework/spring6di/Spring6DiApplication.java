package lakshmi.springframework.spring6di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import lakshmi.springframework.spring6di.controllers.MyController;

@SpringBootApplication
public class Spring6DiApplication {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(Spring6DiApplication.class, args);
		MyController mc =ac.getBean(MyController.class);
		System.out.println("Inside main");
		System.out.println(mc.sayHello());
	}

}
