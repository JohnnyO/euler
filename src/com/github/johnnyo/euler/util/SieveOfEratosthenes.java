package com.github.johnnyo.euler.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * By using a sieve of Eratosthenes, this class calculates a list of all primes below a specified limit.
 * 
 * Currently being used in the solutions of problems 7 and 10.
 * 
 * @author johnnyo
 * 
 */
public class SieveOfEratosthenes implements Iterable<Integer> {

	private final List<Integer> primes = new ArrayList<Integer>();

	/**
	 * Calculates all the primes below the given limit.  All significant computation is done in the constructor.
	 * @param limit
	 */
	public SieveOfEratosthenes(final int limit) {
		assert (limit > 2);
		int[] sieve = new int[limit];

		for (int i = 0; i < limit; i++) {
			sieve[i] = i;
		}
		sieve[0] = 0;
		sieve[1] = 0;

		for (int i = 0; i < limit; i++) {
			if (sieve[i] != 0) {
				primes.add(i);
				for (int j = 2 * i; j < limit; j = j + i) {
					sieve[j] = 0;
				}
			}
		}
	}
	
	/**
	 * Allows for direct access to the nth prime.  
	 * Index is one-based.  (i.e.  get(1) returns 2, get(2) returns 3, etc)
	 * @param index
	 * @return the nth prime computed by this sieve
	 */
	public Integer get(int index) {
		//we substract one, because the array is 0-based, and the nth primes would be 1-based
		return primes.get(index - 1);  
		
	}

	@Override
	/**
	 * Convenience method for accessing a iterable and using the sieve in an enhanced for loop
	 */
	public Iterator<Integer> iterator() {
		return primes.iterator();
	}

}
