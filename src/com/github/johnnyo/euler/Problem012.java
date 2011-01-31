package com.github.johnnyo.euler;

import java.util.*;

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
		while (factors(triangle(n)).size() < 500)
			n++;
		return Long.toString(triangle(n));
	}

	private Set<Integer> factors(int n) {
		Set<Integer> factors = new TreeSet<Integer>();
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				factors.add(i);
				factors.add(n / i);
			}
		}
		return factors;
	}

	public int triangle(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

}
