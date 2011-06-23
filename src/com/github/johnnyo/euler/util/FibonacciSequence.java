package com.github.johnnyo.euler.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * FibonacciSequence is an iterator over all the fibonacci numbers below a specified limit. For convenience, the first
 * two values returned are 1 and 2. Note that this may contradict some problems which assume the first two entries in
 * the sequence are 0 and 1. It depends on how the problem defines the start of the Fibonacci Sequence.
 * 
 * @author JohnnyO
 * 
 */
public class FibonacciSequence implements Iterator<Integer>, Iterable<Integer> {

    /**
     * Tracks the previous return value from the iteration.
     */
    private int prev = 0;
    /**
     * tracks the current return value from the iteration.
     */
    private int next = 1;

    /**
     * The iterator will terminate when the return value exceeds this limit.
     */
    private final int limit;

    /**
     * Creates an Iterator that returns all numbers in a Fibonacci Sequence below limit.
     * @param limit the maximum value of the sequence.  
     * @see Iterator
     */
    public FibonacciSequence(final int limit) {
        this.limit = limit;
    }

    @Override
    public final boolean hasNext() {
        return next + prev < limit;
    }

    @Override
    public final Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more elements in sequence below limit[" + limit + "]");
        }

        int temp = next;
        next = prev + next;
        prev = temp;
        return next;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();

    }

    @Override
    public final Iterator<Integer> iterator() {
        return this;
    }

}
