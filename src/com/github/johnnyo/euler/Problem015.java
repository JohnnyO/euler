package com.github.johnnyo.euler;

import java.math.BigInteger;

/**
 * 
 * 
 * 
 * @author JohnnyO
 * 
 */
public class Problem015 extends BaseTestCase {

    @Override
    public String getAnswer() {
        // TODO Auto-generated method stub
        return "137846528820";
    }

    /**
     * This solution is a simple permutation problem. There are 20 lateral moves and 20 vertical moves.
     * 
     * How many ways can we combine 20 lateral moves and 20 vertical moves?
     * 
     * answer = (40!) / (20!*20!)
     * 
     */
    @Override
    public String solve() {
        BigInteger numerator = factorial(40);
        BigInteger denominator = factorial(20).pow(2);
        return numerator.divide(denominator).toString();
    }

    private BigInteger factorial(int n) {
        BigInteger result = new BigInteger("1");
        for (int i = 2; i <= n; i++) {
            result = result.multiply(new BigInteger(Integer.toString(i)));
        }
        return result;

    }

}
