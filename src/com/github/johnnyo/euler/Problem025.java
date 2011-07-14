package com.github.johnnyo.euler;

import java.math.BigInteger;

/**
 * The Fibonacci sequence is defined by the recurrence relation:
 * 
 * F(n) = F(n-1) + F(n-2), where F(1) = 1 and F(2) = 1.
 * 
 * 
 * The 12th term, F12, is the first term to contain three digits.
 * 
 * What is the first term in the Fibonacci sequence to contain 1000 digits?
 * 
 * 
 * @author jjo135
 * 
 */
public class Problem025 extends BaseTestCase {

    @Override
    public final String solve() {
        final BigInteger limit = new BigInteger("10").pow(999);  
        
        long index = 2L;
        BigInteger current = new BigInteger("1");
        BigInteger prev = new BigInteger("1");
        
        while (current.compareTo(limit) < 0) {
            BigInteger temp = current.add(prev);
            prev = current;
            current = temp;
            index++;
        }

        return Long.toString(index);
    }
    @Override
    public final String getAnswer() {
        return "4782";
    }

}
