package com.github.johnnyo.euler;

import java.math.BigInteger;

/**
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * 
 * What is the sum of the digits of the number 2^1000?
 * 
 * Solution: This is another problem that relies on arbitrary precision arithmetic, but is directly solvable once
 * such a feature is available.
 * 
 * @author JohnnyO
 * 
 */
public class Problem016 extends BaseTestCase {

    @Override
    public final String getAnswer() {
        return "1366";
    }

    @Override
    public final String solve() {
        BigInteger big = new BigInteger("2");
        big = big.pow(1000);
        String s = big.toString();
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum = sum + Integer.parseInt("" + c);
        }
        return Integer.toString(sum);
    }

}
