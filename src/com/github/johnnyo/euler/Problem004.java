package com.github.johnnyo.euler;
/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is
 * 9009 = 91 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 * @author johnnyo
 * 
 */
public class Problem004 extends BaseTestCase {

    @Override
    public String getAnswer() {
        return "906609";
    }

    @Override
    /**
     * This is another problem that it is pretty easy to brute force in under a second, so we don't spend a lot of 
     * time over-optimizing
     */
    public String solve() {
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

    private boolean isPalindrome(int i) {
        String s = Integer.toString(i);
        String reverse = (new StringBuffer(s)).reverse().toString();
        return s.equals(reverse);
    }

}
