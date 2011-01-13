package com.github.johnnyo.euler;

/**
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000. Find the product abc.
 * 
 * 
 * @author johnnyo
 * 
 */
public class Problem009 extends BaseTestCase {

	@Override
	public String getAnswer() {
		return "31875000";
	}

	@Override
	/**
	 * Again, we just do a simple brute force method, 
	 */
	public String solve() {
		for (int a = 1; a < 1000; a++)
			for (int b = a; b < 1000; b++) {
				int c = 1000 - a - b;
				if (a * a + b * b == c * c) {
					return Integer.toString(a * b * c);
				}
			}
		return "Error";
	}

}
