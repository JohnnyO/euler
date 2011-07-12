package com.github.johnnyo.euler;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;

/**
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
 * 
 * @author JohnnyO
 * @link http://projecteuler.net/index.php?section=problems&id=17
 */
public class Problem017 extends BaseTestCase {

    private static final Map<Integer, String> WORD_CACHE = new HashMap<Integer, String>();

    /**
     * Precache the unique stems for constructing numbers.
     */
    @Before
    public final void setUp() {
        WORD_CACHE.put(1, "one");
        WORD_CACHE.put(2, "two");
        WORD_CACHE.put(3, "three");
        WORD_CACHE.put(4, "four");
        WORD_CACHE.put(5, "five");
        WORD_CACHE.put(6, "six");
        WORD_CACHE.put(7, "seven");
        WORD_CACHE.put(8, "eight");
        WORD_CACHE.put(9, "nine");

        WORD_CACHE.put(11, "eleven");
        WORD_CACHE.put(12, "twelve");
        WORD_CACHE.put(13, "thirteen");
        WORD_CACHE.put(14, "fourteen");
        WORD_CACHE.put(15, "fifteen");
        WORD_CACHE.put(16, "sixteen");
        WORD_CACHE.put(17, "seventeen");
        WORD_CACHE.put(18, "eighteen");
        WORD_CACHE.put(19, "nineteen");

        WORD_CACHE.put(10, "ten");
        WORD_CACHE.put(20, "twenty");
        WORD_CACHE.put(30, "thirty");
        WORD_CACHE.put(40, "forty");
        WORD_CACHE.put(50, "fifty");
        WORD_CACHE.put(60, "sixty");
        WORD_CACHE.put(70, "seventy");
        WORD_CACHE.put(80, "eighty");
        WORD_CACHE.put(90, "ninety");

    }

    @Override
    public final String getAnswer() {
        return "21124";
    }

    @Override
    public final String solve() {
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            String s = print(i);
            count += s.length();
        }
        return Integer.toString(count);
    }

    private String print(final int n) {

        if (WORD_CACHE.get(n) != null) {
            return WORD_CACHE.get(n);
        } else if (n < 100) {
            return WORD_CACHE.get(10 * (n / 10)) + WORD_CACHE.get(n % 10);
        } else if (n < 1000) {
            String head = WORD_CACHE.get(n / 100) + "hundred";
            int remainder = n % 100;
            if (remainder != 0) {
                return head + "and" + print(remainder);
            } else {
                return head;
            }
        }
        if (n == 1000) {
            return "onethousand";
        }
        return null;
    }

}
