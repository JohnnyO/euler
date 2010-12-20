package com.github.johnnyo.euler;

import static org.junit.Assert.*;

import org.junit.Test;

public abstract class BaseTestCase {
	
	private static final String TIME_ELAPSED = "The solution took longer than one minute to obtain";
	
	@Test
	public void standardTest() {
		String answer = this.getAnswer();
		long startTime = System.currentTimeMillis();
		String solution = solve();
		long elapsed = System.currentTimeMillis() - startTime;
		assertEquals(answer, solution);   //Check that we got the right answer
		assertTrue(TIME_ELAPSED, elapsed < 60000);      //Check that it ran in the expected time 
	}
	
	
	public abstract String getAnswer();
	
	public abstract String solve(); 

}
