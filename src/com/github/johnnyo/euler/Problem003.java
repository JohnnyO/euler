package com.github.johnnyo.euler;


import com.github.johnnyo.euler.util.Factors;

/**
 * What is the largest prime factor of the number 600851475143 ?
 * 
 * @author JohnnyO
 * 
 */
public class Problem003 extends BaseTestCase {

    /**
     * The number to be factored.
     */
    private static final long COMPOSITE = 600851475143L;
    
    @Override
    public final String getAnswer() {
        return "6857";
    }

    @Override
    public final String solve() {
        Factors primeFactors = new Factors(COMPOSITE);
        
        Long maxFactor = 0L;
        for (Long f : primeFactors.getPrimeFactors()) {
            maxFactor = Math.max(f, maxFactor);
        }

        return maxFactor.toString();
    }


}
