package com.github.johnnyo.euler;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * To ensure that our solutions continue to be correct, each test is written as a JUnit test case. This base class
 * ensures that each solution meets two criteria. First, we make sure that we return a correct solution, and second, we
 * make sure that we were able to compute that solution is less than one minute.
 * 
 * From a workflow perspective, when attempting to solve a new problem, you should extend this class and implement both
 * getAnswer() and solve(). Obviously, when you first start working on a problem, you don't know the answer, so simply
 * have getAnswer() return unknown, then begin working on the problem.
 * 
 * Once you have successfully solved the problem and verified your answer at Project Euler, you can then update the
 * getAnswer() method with the correct answer, then begin working on refactoring or optimizing your solution.
 * 
 * @author JohnnyO
 * 
 */
public abstract class BaseTestCase {

    /**
     * Message returned if the test takes longer than the elapsed time.
     */
    private static final String TIME_ELAPSED = "The solution took longer than one minute to obtain";
    /**
     * Solutions to Euler problems should take no longer than TIME_LIMIT_MS to solve the problem.
     */
    private static final int TIME_LIMIT_MS = 60 * 1000;

    /**
     * StandardTest is the test invoked by each and every solution to Project Euler. It checks that the solution is
     * correct, and that is was computable under the time limit.
     */
    @Test
    public final void standardTest() {
        final String answer = this.getAnswer();
        final long startTime = System.currentTimeMillis();
        final String solution = solve();
        final long elapsed = System.currentTimeMillis() - startTime;
        assertEquals(answer, solution); // Check that we got the right answer
        assertTrue(TIME_ELAPSED, elapsed < TIME_LIMIT_MS); // Check that it ran in the expected time
    }

    /**
     * This method should compute the result, and return its String representation.
     * 
     * @return the computed solution to the problem
     */
    public abstract String solve();

    /**
     * Abstract method that returns a known answer to a problem in a String representation. NOTE: This method should
     * simply return the answer, not compute it.
     * 
     * @return String representation of the answer to problem
     */
    public abstract String getAnswer();

}
