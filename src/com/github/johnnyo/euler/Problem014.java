package com.github.johnnyo.euler;

import java.util.HashMap;
import java.util.Map;

public class Problem014 extends BaseTestCase {

    @Override
    public String getAnswer() {
        // TODO Auto-generated method stub
        return "837799";
    }

    @Override
    public String solve() {
        long max = 0;
        long number = 0;
        for (int i = 1; i < 1000000; i++) {
            long count = cacheLookup(i);
            if (count > max) {
                max = count;
                number = i;
            }
        }
        // TODO Auto-generated method stub
        return Long.toString(number);
    }

    private Map<Long, Long> cache = new HashMap<Long, Long>();
    {
        cache.put(1L, 1L);
        cache.put(2L, 2L);
    }

    /**
     * Computes the value for n, falling back on the cache, whenever possible
     * 
     * @param n
     *            the number to lookup in the cache, or calculate when possible
     * @return the length of the chain for n
     */
    private long cacheLookup(long n) {
        if (cache.containsKey(n))
            return cache.get(n);
        else {
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
