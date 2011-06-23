package com.github.johnnyo.euler.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * By using a sieve of Eratosthenes, this class calculates a list of all primes below a specified limit.
 * 
 * Currently being used in the solutions of problems 7 and 10.
 * 
 * @author JohnnyO
 * 
 */
public final class SieveOfEratosthenes implements Iterable<Integer> {

    /**
     * The list of calculated primes.
     */
    private final List<Integer> primes = new ArrayList<Integer>();

    /**
     * Calculates all the primes below the given limit. Currently, all significant computation is done in the
     * constructor.
     * 
     * @param limit
     *            the upper bound for this sieve.
     */
    public SieveOfEratosthenes(final int limit) {
        assert (limit > 2);
        int[] sieve = new int[limit];

        for (int i = 0; i < limit; i++) {
            sieve[i] = i;
        }
        sieve[0] = 0;
        sieve[1] = 0;

        for (int i = 0; i < limit; i++) {
            if (sieve[i] != 0) {
                primes.add(i);
                for (int j = 2 * i; j < limit; j = j + i) {
                    sieve[j] = 0;
                }
            }
        }
    }

    /**
     * Allows for direct access to the nth prime. Index is zero-based. (i.e. get(0) returns 2, get(1) returns 3, etc)
     * 
     * @param index
     *            the index (1-based into the array)
     * @return the nth prime computed by this sieve
     */
    public Integer get(final int index) {
        return primes.get(index);

    }

    /**
     * Convenience method for accessing a iterable and using the sieve in an enhanced for loop.
     * 
     * @return an Iterator of all the primes below "limit"
     */
    @Override
    public Iterator<Integer> iterator() {
        return primes.iterator();
    }

}
