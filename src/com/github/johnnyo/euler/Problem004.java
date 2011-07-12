package com.github.johnnyo.euler;
/**
 * Problem:
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is
 * 9009 = 91 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 * Solution:
 * This is a fairly trivial problem to solve in a brute force fashion, presented below.
 * @author JohnnyO
 * 
 */
public class Problem004 extends BaseTestCase {

    @Override
    public final String getAnswer() {
        return "906609";
    }

    @Override
    public final String solve() {
        int max = 1;
        for (int x = 999; x > 100; x--) {
            for (int y = 999; y > 100; y--) {
                if (isPalindrome(x * y)) {
                    max = Math.max(max, x * y);
                }
            }
        }
        return Integer.toString(max);
    }

    /**
     * Tests if the current value (i) is a palindrome (i.e. reads the same backwards and forwards)
     * 
     * @param i
     *            - integer to be tested
     * @return true if i is a paindrome, false otherwise
     */
    private boolean isPalindrome(final int i) {
        String s = Integer.toString(i);
        String reverse = (new StringBuffer(s)).reverse().toString();
        return s.equals(reverse);
    }

}
