package com.github.johnnyo.euler;

import com.github.johnnyo.euler.util.AdvancedMath;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder. What is
 * the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * 
 * Solution:
 * 
 * You can actually solve this one by hand, you simply need to collect all the unique prime factors of the numbers
 * under 20.  Alternatively, a quick solution is to calculate the lcm of the products from 1..20.
 * 
 * 
 * @author johnnyo
 */
public class Problem005 extends BaseTestCase {

    @Override
    public final String getAnswer() {
        return "232792560";
    }

    @Override
    public final String solve() {

        long answer = 1;
        for (int i = 1; i < 21; i++) {
            answer = AdvancedMath.lcm(answer, i);
        }
        return Long.toString(answer);
    }


}
