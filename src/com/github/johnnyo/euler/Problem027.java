package com.github.johnnyo.euler;

import java.util.Collection;
import java.util.TreeSet;

import com.github.johnnyo.euler.util.SieveOfEratosthenes;

/**
 * Euler published the remarkable quadratic formula:
 * 
 * n² + n + 41
 * 
 * It turns out that the formula will produce 40 primes for the consecutive values n = 0 to 39. However, when n = 40,
 * 402 + 40 + 41 = 40(40 + 1) + 41 is divisible by 41, and certainly when n = 41, 41² + 41 + 41 is clearly divisible by
 * 41.
 * 
 * Using computers, the incredible formula n² 79n + 1601 was discovered, which produces 80 primes for the consecutive
 * values n = 0 to 79. The product of the coefficients, 79 and 1601, is 126479.
 * 
 * Considering quadratics of the form:
 * 
 * n² + an + b, where |a| < 1000 and |b| < 1000
 * 
 * where |n| is the modulus/absolute value of n e.g. |11| = 11 and |-4| = 4 Find the product of the coefficients, a and
 * b, for the quadratic expression that produces the maximum number of primes for consecutive values of n, starting with
 * n = 0.
 * 
 * 
 * @author JohnnyO
 * 
 */
public class Problem027 extends BaseTestCase {

    private static final int LIMIT = 79 * 79 + 999 * 79 + 999; // assuming n < 79 (the example given)
    private static final Collection<Integer> PRIMES = new TreeSet<Integer>(new SieveOfEratosthenes(LIMIT).getPrimes());

    @Override
    public final String solve() {
        int max = 0;
        int product = 0;
        for (int a = -999; a < 1000; a++) {
            for (int b = 0; b < 1000; b++) { // we can start at b = 0, because if b < 0, when n=0, the soln is not prime
                int n = 0;
                while (isPrime(n * n + a * n + b)) {
                    n++;
                }
                if (n > max) {
                    max = n;
                    product = a * b;
                }
            }
        }
        return Integer.toString(product);
    }

    private boolean isPrime(final int possiblePrime) {
        if (possiblePrime >= LIMIT) {
            throw new RuntimeException("LIMIT set too low"); // just a sanity check in case we set the limit too low.
        }
        return PRIMES.contains(possiblePrime);

    }

    @Override
    public final String getAnswer() {
        return "-59231";
    }

}
