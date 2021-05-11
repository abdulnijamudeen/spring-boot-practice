package com.nizam.springbootpractice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootPracticeApplicationTests {

	@Test
	void contextLoads() {
		String test = "Test";
		assertEquals(test, "Test");
	}

}
