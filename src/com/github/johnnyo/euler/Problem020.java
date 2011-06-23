package com.github.johnnyo.euler;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import com.github.johnnyo.euler.util.Cache;

/**
 * Find the sum of the digits in the number 100!
 * 
 * 
 * @author JohnnyO
 * 
 */
public class Problem020 extends BaseTestCase {

    Map<Character, Integer> values = new HashMap<Character, Integer>();

    @Override
    public String getAnswer() {
        return "648";
    }

    @Override
    public String solve() {
        String s = factorial(100).toString();
        Map<Character, Integer> map = Cache.getCharacterToIntegerMap();
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += map.get(c);
        }
        return Integer.toString(sum);
    }

    private BigInteger factorial(int n) {
        assert (n > 1);
        BigInteger solution = new BigInteger("1");
        for (int i = 1; i < n; i++) {
            solution = solution.multiply(new BigInteger(Integer.toString(i)));
        }
        return solution;

    }

}
