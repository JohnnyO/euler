package com.github.johnnyo.euler;

import java.util.HashMap;
import java.util.Map;
/**
 * The following iterative sequence is defined for the set of positive integers:
 * 
 * n n/2 (n is even) n 3n + 1 (n is odd)
 * 
 * Using the rule above and starting with 13, we generate the following sequence:
 * 
 * 13 40 20 10 5 16 8 4 2 1 It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
 * Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 * 
 * Which starting number, under one million, produces the longest chain?
 * 
 * 
 * Solution:
 * 
 * @author JohnnyO
 * 
 */
public class Problem014 extends BaseTestCase {

    @Override
    public final String getAnswer() {
        return "837799";
    }

    @Override
    public final String solve() {
        long max = 0;
        long number = 0;
        for (int i = 1; i < 1000000; i++) {
            long count = cacheLookup(i);
            if (count > max) {
                max = count;
                number = i;
            }
        }
        return Long.toString(number);
    }

    private Map<Long, Long> cache = new HashMap<Long, Long>();
    {
        cache.put(1L, 1L);
        cache.put(2L, 2L);
    }

    /**
     * Computes the value for n, falling back on the cache, whenever possible.
     * 
     * @param n
     *            the number to lookup in the cache, or calculate when possible
     * @return the length of the chain for n
     */
    private long cacheLookup(final long n) {
        if (cache.containsKey(n)) {
            return cache.get(n);
        } else {
            long result = 0;
            if (n % 2 == 0) {
                result = 1 + cacheLookup(n / 2);
            } else {
                result = 1 + cacheLookup(3 * n + 1);
            }
            cache.put(n, result);
            return result;
        }
    }

}
