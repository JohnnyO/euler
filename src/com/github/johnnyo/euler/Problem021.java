package com.github.johnnyo.euler;

import java.util.Set;

import com.github.johnnyo.euler.util.PrimeFactors;

/**
 * 
 * @author jjo135
 * 
 */
public class Problem021 extends BaseTestCase {

    @Override
    public String getAnswer() {
        return "31626";
    }

    @Override
    public String solve() {
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
     * the function as described in the problem definition
     * 
     * @param n
     * @return
     */
    private int d(int n) {
        Set<Integer> set = new PrimeFactors(n).getProperDivisors();
        int sum = 0;
        for (int i : set) {
            sum += i;
        }
        return sum;
    }
}
