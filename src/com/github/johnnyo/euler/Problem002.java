package com.github.johnnyo.euler;

import com.github.johnnyo.euler.util.FibonacciSequence;

/**
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the
 * even-valued terms.
 * 
 * @author JohnnyO
 * 
 */
public class Problem002 extends BaseTestCase {

    @Override
    public final String getAnswer() {
        return "4613732";
    }

    @Override
    public final String solve() {

        FibonacciSequence fibonacci = new FibonacciSequence(4000000);
        int sum = 0;
        for (Integer value : fibonacci) {
            if (value % 2 == 0) {
                sum = sum + value;
            }
        }
        return Integer.toString(sum);
    }

}
