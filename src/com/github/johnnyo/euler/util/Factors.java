package com.github.johnnyo.euler.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
/**
 * Utility class for calculating the factors of a given Long. Once calculated, the class can be queried for various
 * subsets, such as the set of prime factors, proper divisors, or all factors
 * 
 * @author JohnnyO
 * 
 */
public final class Factors {

    /**
     * the number to be factors.
     */
    private final long number;
    /**
     * Storage for the computed list of factors.
     */
    private final Set<Long> factors;

    /**
     * Calculates the list of prime factoprs.
     * 
     * @param n
     *            the number to be factored.
     */
    public Factors(final long n) {
        this.number = n;
        this.factors = new TreeSet<Long>();
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
    public Set<Long> getFactors() {
        return Collections.unmodifiableSet(factors);
    }

    /**
     * The set of proper divisors, i.e. all the factors of n such that factor < n. If n is not prime, this is equivalent
     * to the factors. If n is prime, then only {1} will be returned.
     * 
     * @return the Proper Divisors of
     */
    public Set<Long> getProperDivisors() {
        Set<Long> properDivisors = new TreeSet<Long>();
        properDivisors.addAll(factors);
        properDivisors.remove(number);
        return properDivisors;
    }

    /**
     * Calculates the prime factors of n.
     * @return the list of prime factors of the initial input
     */
    public Set<Long> getPrimeFactors() {
        long n = number;
         List<Long> primeFactors = new ArrayList<Long>();
        for (long i = 2; i <= n; i++) {
            while (n % i == 0) {
                primeFactors.add(i);
                n /= i;
            }
        }
        return new HashSet<Long>(primeFactors);
    }

    /**
     * Populates the set of factors of "number".
     */
    private void calculate() {
        for (long i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                factors.add(i);
                factors.add(number / i);
            }
        }
    }

}
