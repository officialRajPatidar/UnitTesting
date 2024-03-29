package com.todo.UnitTeastExampleServiceTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.todo.service.Calculator;

public class CalculatorJunit5Test {

	@BeforeAll
	public static void beforeAll() {
		System.out.println("beforee all test case");
	}
	@Test
	public void add() {
		System.out.println("test case 1 ");

		int acutalres = Calculator.sum(4, 5);
		int expected= 9;
		Assertions.assertEquals(expected, acutalres , "test failed");
	}
	
	@Test
	@Disabled
	public void SummofAll() {
		System.out.println("test case 2 ");

		int acutalres = Calculator.sumAll(4, 5,5);
		int expected= 14;
		Assertions.assertEquals(expected, acutalres , "test failed");
	
	}
}
