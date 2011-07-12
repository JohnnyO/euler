package com.github.johnnyo.euler;

import java.util.Set;

import com.github.johnnyo.euler.util.Factors;

/**
 * 
 * Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n). If d(a) = b
 * and d(b) = a, where a b, then a and b are an amicable pair and each of a and b are called amicable numbers.
 * 
 * For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The
 * proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
 * 
 * Evaluate the sum of all the amicable numbers under 10000.
 * 
 * 
 * @author JohnnyO
 * 
 */
public class Problem021 extends BaseTestCase {

    @Override
    public final String getAnswer() {
        return "31626";
    }

    @Override
    public final String solve() {
        int sum = 0;
        for (int a = 2; a < 10000; a++) {
            int b = d(a);
            if (d(b) == a && a != b) {
                sum += a; // we only add a because we'll find the other part of the part when we test b
            }
        }

        return Integer.toString(sum);
    }

    /**
     * the function as described in the problem definition.
     * 
     * @param n
     * @return
     */
    private int d(final int n) {
        Set<Long> set = new Factors(n).getProperDivisors();
        long sum = 0;
        for (long i : set) {
            sum += i;
        }
        return (int) sum;
    }
}
