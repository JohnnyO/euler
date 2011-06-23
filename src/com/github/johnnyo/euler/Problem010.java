package com.github.johnnyo.euler;

import com.github.johnnyo.euler.util.SieveOfEratosthenes;

/**
 * Find the sum of all the primes below two million.
 * 
 * @author johnnyo
 * 
 */
public class Problem010 extends BaseTestCase {

    @Override
    public String getAnswer() {
        return "142913828922";
    }

    @Override
    /**
     * In order to solve this problem, we have extended the 
     */
    public String solve() {
        long sum = 0;
        SieveOfEratosthenes sieve = new SieveOfEratosthenes(2000000);
        for (Integer prime : sieve) {
            sum += prime;
        }

        return Long.toString(sum);
    }

}
