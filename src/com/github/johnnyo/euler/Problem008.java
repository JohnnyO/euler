package com.github.johnnyo.euler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

import com.github.johnnyo.euler.util.Cache;

/**
 * Find the greatest product of five consecutive digits in the 1000-digit number.
 * 
 * 
 * @author johnnyo
 * 
 */
public class Problem008 extends BaseTestCase {

    @Override
    public final String getAnswer() {
        return "40824";
    }

    @Override
    /**
     * This is another pretty straightforward solution, it simply requires us to do some conversion between a string,
     * its characters and the integers that they represent
     */
    public final String solve() {
        char[] digits = getInput().toCharArray();
        Map<Character, Integer> map = Cache.getCharacterToIntegerMap();
        int max = 0;
        for (int i = 0; i < digits.length - 5; i++) {
            int value = 1;
            for (int j = 0; j < 5; j++) {
                value *= map.get(digits[i + j]);
            }
            max = Math.max(max, value);
        }
        return Integer.toString(max);
    }

    private String getInput() {
        try {
            String input = "";
            InputStream is = this.getClass().getResourceAsStream("data/problem-008.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line = null;
            while ((line = reader.readLine()) != null) {
                input += line;
            }
            return input;
        } catch (IOException ioe) {
            return null;
        }
    }

}
