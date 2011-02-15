package com.github.johnnyo.euler;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * To ensure that our solutions continue to be correct, each test is written as a JUnit test case.  This base
 * class ensures that each solution meets two criteria.  First, we make sure that we return a correct solution, and
 * second, we make sure that we were able to compute that solution is less than one minute.
 * 
 * From a workflow perspective, when attempting to solve a new problem, you should extend this class and implement
 * both getAnswer() and solve().  Obviously, when you first start working on a problem, you don't know the answer, so
 * simply have getAnswer() return unknown, then begin working on the problem.
 * 
 * Once you have successfully solved the problem and verified your answer at Project Euler, you can then update the 
 * getAnswer() method with the correct answer, then begin working on refactoring or optimizing your solution.
 * 
 * @author JohnnyO
 *
 */
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
	
	
	
	/**
	 * This method should compute the result, and return its String representation
	 * @return the computed solution to the problem
	 */
	public abstract String solve();
	
	
	
	/**
	 * Abstract method that returns a known answer to a problem in a String representation.
	 * NOTE:  This method should simply return the answer, not compute it.
	 * @return String representation of the answer to problem
	 */
	public abstract String getAnswer();

}
