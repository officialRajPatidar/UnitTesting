//package com.todo.UnitTeastExampleServiceTest;
//
//import java.util.Date;
//
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//
//import com.todo.service.Calculator;
//
//import junit.framework.Assert;
//
//public class CalculatorTest {
//
//	@BeforeClass
//	public static void intit() {
//		System.out.println("before all the test case");
//		System.out.println("started test:"+new Date  () );
//	}
//	
//	@Before
//	public void beforeEache() {
//		System.out.println("beforee each case");
//	}
//	
//	@Test(timeout = 2000)
//	public void add() {
//		System.out.println("add method");
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		int res = Calculator.sum(5, 50);
//		int expected = 55;
//		 Assert.assertEquals(expected, res);
//	}
//	
//	@Test
//	public void summAll() {
//		System.out.println("summall method");
//
//		int res = Calculator.sumAll(2,4,5,6,7);
//		int expected = 24;
//		Assert.assertEquals(expected, res);
//	}
//
//	@AfterClass
//	public static void cleanUp() {
//		System.out.println("after all cases");
//		System.out.println("ended test:"+new Date  () );
//
//	}
//	
//}
