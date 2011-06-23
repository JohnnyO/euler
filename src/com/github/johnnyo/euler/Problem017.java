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

    private static final Map<Integer, String> wording = new HashMap<Integer, String>();

    @Before
    public void setUp() {
        wording.put(1, "one");
        wording.put(2, "two");
        wording.put(3, "three");
        wording.put(4, "four");
        wording.put(5, "five");
        wording.put(6, "six");
        wording.put(7, "seven");
        wording.put(8, "eight");
        wording.put(9, "nine");

        wording.put(11, "eleven");
        wording.put(12, "twelve");
        wording.put(13, "thirteen");
        wording.put(14, "fourteen");
        wording.put(15, "fifteen");
        wording.put(16, "sixteen");
        wording.put(17, "seventeen");
        wording.put(18, "eighteen");
        wording.put(19, "nineteen");

        wording.put(10, "ten");
        wording.put(20, "twenty");
        wording.put(30, "thirty");
        wording.put(40, "forty");
        wording.put(50, "fifty");
        wording.put(60, "sixty");
        wording.put(70, "seventy");
        wording.put(80, "eighty");
        wording.put(90, "ninety");

    }

    @Override
    public String getAnswer() {
        return "21124";
    }

    @Override
    public String solve() {
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            String s = print(i);
            // System.out.println(s.length() + " " +s);
            count += s.length();
        }
        return Integer.toString(count);
    }

    public String print(final int n) {

        if (wording.get(n) != null) {
            return wording.get(n);
        } else if (n < 100) {
            return wording.get(10 * (n / 10)) + wording.get(n % 10);
        } else if (n < 1000) {
            String head = wording.get(n / 100) + "hundred";
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
