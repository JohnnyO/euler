package com.github.johnnyo.euler;

/**
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the
 * sum.
 * 
 * Solution:
 * A brute force solution is solvable in trivial time.
 * @author JohnnyO
 * 
 */
public class Problem006 extends BaseTestCase {

    @Override
    public final String getAnswer() {
        return "25164150";
    }

    @Override
    public final String solve() {
        long sumOfSquares = 0;
        long sum = 0;
        for (long i = 0; i <= 100; i++) {
            sum = sum + i;
            sumOfSquares = sumOfSquares + (i * i);
        }
        long difference = (sum * sum) - sumOfSquares;
        return Long.toString(difference);
    }

}
