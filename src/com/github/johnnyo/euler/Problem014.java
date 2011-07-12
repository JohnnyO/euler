package com.github.johnnyo.euler;

/**
 * The following iterative sequence is defined for the set of positive integers:
 * 
 * n n/2 (n is even) n 3n + 1 (n is odd)
 * 
 * Using the rule above and starting with 13, we generate the following sequence:
 * 
 * 13 40 20 10 5 16 8 4 2 1 It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
 * Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 * 
 * Which starting number, under one million, produces the longest chain?
 * 
 * 
 * Solution:
 * 
 * Below is an iterative solution. Some time could be shaved off the solution if a cache were used for the length of
 * chains we have previously seen.
 * 
 * @author JohnnyO
 * 
 */
public class Problem014 extends BaseTestCase {

    @Override
    public final String getAnswer() {
        return "837799";
    }

    @Override
    public final String solve() {
        long max = 0;
        long number = 0;
        for (int i = 1; i < 1000000; i++) {
            long count = countChainLength(i);
            if (count > max) {
                max = count;
                number = i;
            }
        }
        return Long.toString(number);
    }

    private int countChainLength(final int input) {
        int count = 1;
        long n = input;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            count++;
        }
        return count;
    }

}
