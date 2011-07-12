package com.github.johnnyo.euler;

import java.math.BigInteger;

import com.github.johnnyo.euler.util.AdvancedMath;

/**
 * Starting in the top left corner of a 2x2 grid, there are 6 routes (without backtracking) to the bottom right corner.
 * 
 * 
 * How many routes are there through a 20x20 grid?
 * 
 * Solution: This solution is a simple permutation problem. There are 20 lateral moves and 20 vertical moves.
 * 
 * How many ways can we combine 20 lateral moves and 20 vertical moves?
 * 
 * answer = (40!) / (20!*20!)
 * 
 * @author JohnnyO
 * 
 */
public class Problem015 extends BaseTestCase {

    @Override
    public final String getAnswer() {
        return "137846528820";
    }

    @Override
    public final String solve() {
        BigInteger numerator = AdvancedMath.factorial(40);
        BigInteger denominator = AdvancedMath.factorial(20).pow(2);
        return numerator.divide(denominator).toString();
    }

}
