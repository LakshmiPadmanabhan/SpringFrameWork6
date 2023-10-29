package lakshmi.springframework.spring6di.services.i18n;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import lakshmi.springframework.spring6di.controllers.i18n.MyI18nController;
//@ActiveProfiles("English")
@SpringBootTest
class i18nEnglishServiceTest {

	@Autowired
	MyI18nController mic;
	@Test
	void test() {
		System.out.println(mic.sayHello());
	}

}
