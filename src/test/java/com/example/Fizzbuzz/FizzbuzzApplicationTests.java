package com.example.Fizzbuzz;

import com.example.Fizzbuzz.services.FizzBuzzService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class FizzbuzzApplicationTests {

	@Autowired
	FizzBuzzService fizzBuzzService;

	@Test
	void contextLoads() {
	}

	@Test
	public void testOutput(){
		Assertions.assertNotNull(fizzBuzzService.findFizzBuzz(10));
	}

	@Test
	public void testResult(){
		Map result = fizzBuzzService.findFizzBuzz(15);
		Map<Integer,String> expectedResult = new HashMap<>();
		expectedResult.put(3,"Fizz");
		expectedResult.put(5,"Buzz");
		expectedResult.put(6,"Fizz");
		expectedResult.put(9,"Fizz");
		expectedResult.put(10,"Buzz");
		expectedResult.put(12,"Fizz");
		expectedResult.put(15,"FizzBuzz");
		Assertions.assertEquals(result,expectedResult);
	}

	@Test
	public void testNegativeInput(){
		Map result = fizzBuzzService.findFizzBuzz(-20);
		Assertions.assertNull(result);
	}
}
