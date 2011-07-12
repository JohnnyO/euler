package com.github.johnnyo.euler;

import java.util.Map;

import com.github.johnnyo.euler.util.AdvancedMath;
import com.github.johnnyo.euler.util.Cache;

/**
 * Find the sum of the digits in the number 100!
 * 
 * 
 * @author JohnnyO
 * 
 */
public class Problem020 extends BaseTestCase {

    @Override
    public final String getAnswer() {
        return "648";
    }

    @Override
    public final String solve() {
        String s = AdvancedMath.factorial(100).toString();
        Map<Character, Integer> map = Cache.getCharacterToIntegerMap();
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += map.get(c);
        }
        return Integer.toString(sum);
    }

}
