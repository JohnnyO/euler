package com.github.johnnyo.euler.util;

import java.math.BigInteger;

/**
 * Static collection of mathematical functions that are not available in the standard java Math implementation.
 * 
 * @author JohnnyO
 * 
 */
public final class AdvancedMath {

    /**
     * This class is not instantiable.
     */
    private AdvancedMath() {

    }

    /**
     * Calculates the GCD of a and b using Euclid's method.
     * 
     * @param x
     *            must be > 0
     * @param y
     *            must be > 0
     * @return the Greatest common divisor of a and b
     */
    public static long gcd(final long x, final long y) {
        assert (x > 0);
        assert (y > 0);

        long a = x;
        long b = y;
        while (b != 0) {
            final long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    /**
     * Calculate the least common multiple of x and y using the standard formula.
     * 
     * @param x
     *            must be > 0
     * @param y
     *            must be > 0
     * @return least common multiple of a and b.
     */
    public static long lcm(final long x, final long y) {
        assert (x > 0);
        assert (y > 0);

        return (x * y) / gcd(x, y);
    }

    /**
     * Calculates n! for a given long
     * 
     * @param n
     *            must be > 0
     * @return BigInteger representation of the n!
     */
    public static BigInteger factorial(final long n) {
        BigInteger result = new BigInteger("1");
        for (long i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;

    }

}
