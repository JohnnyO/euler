package com.github.johnnyo.euler;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

/**
 * How many distinct terms are in the sequence generated by a^b for a in [2,100] and b in [2,100]?
 * 
 * This is another simple problem where a straightforward a brute force approach takes almost no time on modern
 * hardware.
 * 
 * @author JohnnyO
 * 
 */
public class Problem029 extends BaseTestCase {

    @Override
    public final String solve() {

        Set<BigInteger> values = new HashSet<BigInteger>();
        for (int a = 2; a <= 100; a++) {
            for (int b = 2; b <= 100; b++) {
                values.add(BigInteger.valueOf(a).pow(b));
            }
        }
        return Integer.toString(values.size());
    }

    @Override
    public final String getAnswer() {
        return "9183";
    }

}
