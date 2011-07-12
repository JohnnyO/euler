package com.github.johnnyo.euler;

import com.github.johnnyo.euler.util.SieveOfEratosthenes;

/**
 * What is the 10001st prime number?
 * 
 * @author johnnyo
 * 
 */
public class Problem007 extends BaseTestCase {

    private static final int NTHPRIME = 10001;
    private static final int FACTOR = 20;

    @Override
    public final String getAnswer() {
        return "104743";
    }

    @Override
    /**
     * Our solution is simply to use a Sieve of Eratosthenes with a big enough limit, then extract the 10001st prime.
     *
     */
    public final String solve() {
        // An arbitrarily chosen limit, based on the assumption that at least 5% of them will be prime
        SieveOfEratosthenes sieve = new SieveOfEratosthenes(NTHPRIME * FACTOR);

        int answer = sieve.get(10000);
        return Integer.toString(answer);
    }

}
