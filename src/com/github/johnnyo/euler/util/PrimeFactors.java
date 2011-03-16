package com.github.johnnyo.euler.util;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class PrimeFactors {

	private final int number;
	private final Set<Integer> factors;

	public PrimeFactors(int number) {
		this.number = number;
		this.factors = new TreeSet<Integer>();
		this.calculate();
	}

	public int size() {
		return factors.size();
	}

	public Set<Integer> getFactors() {
		return Collections.unmodifiableSet(factors);
	}
	
	public Set<Integer> getProperDivisors() {
		Set<Integer> properDivisors = new TreeSet<Integer>();
		properDivisors.addAll(factors);
		properDivisors.remove(number);
		return properDivisors;
	}

	
	
	
	private void calculate() {
		for (int i = 1; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				factors.add(i);
				factors.add(number / i);
			}
		}
	}

}
