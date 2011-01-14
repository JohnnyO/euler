package com.github.johnnyo.euler;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.github.johnnyo.euler.util.SieveOfEratosthenes;

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
		SieveOfEratosthenes sieve = new SieveOfEratosthenes(200000);
		
		int answer = sieve.get(10001);  
		return Integer.toString(answer);
	}

	
}
