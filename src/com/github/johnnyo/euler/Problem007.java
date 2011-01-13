package com.github.johnnyo.euler;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * What is the 10001st prime number?
 * 
 * @author johnnyo
 * 
 */
public class Problem007 extends BaseTestCase {

	@Override
	public String getAnswer() {
		return "104743";
	}

	@Override
	/**
	 * Our solution is simply to use a Sieve of Eratosthenes with a big enough limit, then extract the 10001st prime.
	 *
	 */
	public String solve() {
		//200,000 is an arbitrarily chosen limit, based on the assumption that at least 5% of them will be prime
		List<Integer> primes = this.sieve(200000);   
		
		int answer = primes.get(10000);  //note the array index is 0-based
		return Integer.toString(answer);
	}

	/**
	 * Here we can implement a simple Sieve of Eratosthenes to generate a list of all primes below a certain limit
	 * @param limit the stopping point of the algorithm
	 * @return a sorted list of all the primes that are below limit
	 */
	public List<Integer> sieve(int limit) {
		int numbers[] = new int[limit];
		List<Integer> primes = new ArrayList<Integer>();
		


		for (int i=0; i < limit; i++) {
			numbers[i] = i;
		}
		numbers[0] = 0;
		numbers[1] = 0;

		
		for (int i=0; i < limit; i++) {
			if (numbers[i] != 0) {
				primes.add(i);
				for (int j = 2*i; j < limit; j= j + i) {
					numbers[j] = 0;
				}
			}
		}
		return primes;

	}

}
