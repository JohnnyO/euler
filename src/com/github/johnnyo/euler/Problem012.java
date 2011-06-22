package com.github.johnnyo.euler;

import com.github.johnnyo.euler.util.PrimeFactors;

/**
 * What is the value of the first triangle number to have over five hundred divisors?
 * 
 * @author JohnnyO
 * 
 */
public class Problem012 extends BaseTestCase {

	@Override
	public String getAnswer() {
		return "76576500";
	}

	@Override
	public String solve() {
		int n = 1;
		while ((new PrimeFactors(triangle(n))).size() < 500)
			n++;
		return Long.toString(triangle(n));
	}

	public int triangle(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

}
