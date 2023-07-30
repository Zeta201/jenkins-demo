package com.zeta.springboot.jenkinsdemo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsDemoApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(JenkinsDemoApplication.class);
	
	@BeforeEach
	void beforeEach() {
		System.out.println("Before each executing...");
	}
	
	@Test
	public void test() {
		assertEquals(15, new MyMath().calcSum(new int[] {1,2,3,4,5}));
	}
	
	@Test
	public void test2() {
		assertEquals(0, new MyMath().calcSum(new int[] {}));
	}

	@Test
	public void test3() {
		assertTrue(new MyMath().getList().contains("aws".toUpperCase()));
	}
	
	@Test
	public void test4() {
		assertEquals(4, new MyMath().getList().size());
	}
	
	@Test
	public void test5() {
		assertArrayEquals(new int[] {0,1,2,3},new MyMath().getArray(4));
	}
}
