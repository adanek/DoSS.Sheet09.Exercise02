package test.java.unit;

import static org.junit.Assert.*;
import main.java.sheet09.exercise01.IIncrementer;
import main.java.sheet09.exercise01.Incrementer;

import org.junit.Test;

public class IncrementerTests {

	@Test
	public void increment_Value1_Returns2() {
		IIncrementer sut = new Incrementer();
		
		int expected = 2;
		int actual = sut.increment(1);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void increment_MaxValue_ReturnsMinValue() {
		IIncrementer sut = new Incrementer();
		
		int expected = Integer.MIN_VALUE;
		int actual = sut.increment(Integer.MAX_VALUE);
		
		assertEquals(expected, actual);
	}
	
//	@Test
//	public void fail() {
//		fail();
//	}
}
