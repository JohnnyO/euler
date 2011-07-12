package com.github.johnnyo.euler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * Another simple brute force solution, as long as we have access to arbitrary precision arithmetic.
 * 
 * @author JohnnyO
 * 
 */
public class Problem013 extends BaseTestCase {

    @Override
    public final String getAnswer() {
        return "5537376230";
    }

    @Override
    public final String solve() {
        try {
            InputStream is = this.getClass().getResourceAsStream("data/problem-013.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line = null;
            BigInteger sum = new BigInteger("0");
            while ((line = reader.readLine()) != null) {
                sum = sum.add(new BigInteger(line));
            }
            return sum.toString().substring(0, 10);
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return null;
        }
    }

}
