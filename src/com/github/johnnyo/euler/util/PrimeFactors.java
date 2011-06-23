package com.github.johnnyo.euler.util;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
/**
 * Utility class for calculating the prime factors of a given integer. Once calculated, the class can be queried for
 * both the list of all prime factors, as well as its set of proper divisors.
 * 
 * @author JohnnyO
 * 
 */
public final class PrimeFactors {

    /**
     * the number to be factors.
     */
    private final int number;
    /**
     * Storage for the computed list of factors.
     */
    private final Set<Integer> factors;

    /**
     * Calculates the list of prime factoprs.
     * 
     * @param n
     *            the number to be factored.
     */
    public PrimeFactors(final int n) {
        this.number = n;
        this.factors = new TreeSet<Integer>();
        this.calculate();
    }

    /**
     * 
     * @return the number of prime factors of n.
     */
    public int size() {
        return factors.size();
    }

    /**
     * Returns the list of unique factors of number as a Set.
     * 
     * @return the set of all factors on n.
     */
    public Set<Integer> getFactors() {
        return Collections.unmodifiableSet(factors);
    }

    /**
     * The set of proper divisors, i.e. all the factors of n such that factor < n. If n is not prime, this is equivalent
     * to the factors. If n is prime, then only {1} will be returned.
     * 
     * @return the Proper Divisors of
     */
    public Set<Integer> getProperDivisors() {
        Set<Integer> properDivisors = new TreeSet<Integer>();
        properDivisors.addAll(factors);
        properDivisors.remove(number);
        return properDivisors;
    }

    /**
     * Populates the set of prime numbers of "number".
     */
    private void calculate() {
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                factors.add(i);
                factors.add(number / i);
            }
        }
    }

}
