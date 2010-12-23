package com.github.johnnyo.euler;

import java.util.ArrayList;
import java.util.List;

public class Problem003 extends BaseTestCase {

	@Override
	public String getAnswer() {
		return "6857";
	}

	@Override
	public String solve() {
		List<Long> factors = primeFactors(600851475143L);
		Long maxFactor = 0L;
		for (Long f : factors)
			maxFactor = Math.max(f, maxFactor);
			
		return maxFactor.toString();
	}

	
	public static List<Long> primeFactors(long number) {
		long n = number; 
		List<Long> factors = new ArrayList<Long>();
		for (long i = 2; i <= n; i++) {
			while (n % i == 0) {
				factors.add(i);
				n /= i;
			}
		}
		return factors;
	}

}
