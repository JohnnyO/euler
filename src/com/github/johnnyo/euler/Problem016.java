package com.github.johnnyo.euler;

import java.math.BigInteger;

public class Problem016 extends BaseTestCase {

    @Override
    public String getAnswer() {
        return "1366";
    }

    @Override
    public String solve() {
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
