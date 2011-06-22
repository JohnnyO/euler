package com.github.johnnyo.euler;


/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1
 * to 10 without any remainder. What is the smallest positive number that is
 * evenly divisible by all of the numbers from 1 to 20?
 * 
 * 
 * @author johnnyo
 */
public class Problem005 extends BaseTestCase {

	
	public String getAnswer() {
		return "232792560";
	}

	@Override
	public String solve() {
		
		long answer = 1;
		for (int i=1; i < 21; i++) {
			answer = lcm(answer, i);
		}
		return Long.toString(answer);
	}

	/**
	 * Calculate the least common multiple of x and y using the standard formula
	 * @return
	 */
	private long lcm(long a, long b) {
		
		return (a*b)/gcd(a,b);
	}



	private long gcd(long a, long b) {
		while (b != 0) {
			long temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

}
