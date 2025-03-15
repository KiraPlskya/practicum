package org.sofiya.demo;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;
import org.sofiya.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PracticumApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test

	void personRepositoryTest(@Autowired EmployeeRepository employeeRepository) {
		Assert.assertEquals("Kira", employeeRepository.findById("Kira").get().getLogin());
		Assert.assertEquals("123", employeeRepository.findById("Kira").get().getPassword());
	}


}
