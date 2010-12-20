package com.github.johnnyo.euler;

import java.util.ArrayList;
import java.util.List;

public class Problem003 extends BaseTestCase {

	@Override
	public String getAnswer() {
		// TODO Auto-generated method stub
		return Integer.toString(6857);
	}

	@Override
	public String solve() {
		List<Integer> factors = primeFactors(600851475143L);
		Integer maxFactor = 0;
		for (Integer f : factors)
			maxFactor = Math.max(f, maxFactor);
			
		return maxFactor.toString();
	}

	
	public static List<Integer> primeFactors(long number) {
		long n = number; 
		List<Integer> factors = new ArrayList<Integer>();
		for (int i = 2; i <= n; i++) {
			while (n % i == 0) {
				factors.add(i);
				n /= i;
			}
		}
		return factors;
	}

}
