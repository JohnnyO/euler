package com.github.johnnyo.euler.util;

import java.util.Iterator;

/**
 * FibonacciSequence is an iterator over all the fibonacci numbers below a specified limit.  For convenience,
 * the first two values returned are 1 and 2.  Note that this may contradict some problems which assume the first two 
 * entries in the sequence are 0 and 1
 * @author johnnyo
 * 
 */
public class FibonacciSequence implements Iterator<Integer>, Iterable<Integer> {

	private int prev = 0;
	private int next = 1;

	private final int limit;

	public FibonacciSequence(int limit) {
		this.limit = limit;
	}

	@Override
	public boolean hasNext() {
		return next + prev < limit;
	}

	@Override
	public Integer next() {
		
		int temp = next;
		next = prev + next;
		prev = temp;
		return next;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();

	}

	@Override
	public Iterator<Integer> iterator() {
		return this;
	}

}
