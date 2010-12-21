package com.github.johnnyo.euler;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these 
 * multiples is 23.
 * 
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 * http://projecteuler.net/index.php?section=problems&id=1
 * @author johnnyo
 *
 */
public class Problem001 extends BaseTestCase {

	@Override
	public String getAnswer() {
		return "233168";
	}

	@Override
	public String solve() {
		int sum = 0;
		for (int i = 1; i < 1000; i++)
			if (i % 3 == 0 || i % 5 == 0)
				sum += i;
		return Integer.toString(sum);
	}

}
