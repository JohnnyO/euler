package com.github.johnnyo.euler;

import com.github.johnnyo.euler.util.Factors;

/**
 * What is the value of the first triangle number to have over five hundred divisors?
 * 
 * @author JohnnyO
 * 
 */
public class Problem012 extends BaseTestCase {

    @Override
    public final String getAnswer() {
        return "76576500";
    }

    @Override
    public final String solve() {
        int n = 1;
        while ((new Factors(triangle(n))).size() < 500) {
            n++;
        }
        return Long.toString(triangle(n));
    }

    private int triangle(final int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

}
