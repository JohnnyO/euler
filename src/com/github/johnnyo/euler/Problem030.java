package com.github.johnnyo.euler;


/*
 * Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
 * 
 * Again, solving this problem is a simple brute force attempt, however, we do have to figure out when we can 
 * stop iterating and be sure we have found all the numbers.
 * 
 * Note that 9^5 = 59049, which means that the largest possible sum for a 6 digit number is 6*9^5, or 354,294.
 * 
 * A seven digit number (i.e. everything over 1 million) could have a maximal sum of 7*9^5, which is under 1 million.
 * Thus, any number 7 digits or greater could not satisfy the initial condition.
 *
 *
 */
public class Problem030 extends BaseTestCase{
    
    private final static int UPPER_BOUND = 6*(int)(Math.pow(9,5));

    @Override
    public String solve() {
        int totalSum = 0;
        for (int i=2; i < UPPER_BOUND; i++) {
            String s = Integer.toString(i);
            int sum = 0;
            for (char c : s.toCharArray()) {
                sum += Math.pow(Integer.parseInt(c + ""), 5);
            }
            if (sum == i) {
                totalSum += sum;
            }
        }
        return Integer.toString(totalSum);
    }

    @Override
    public String getAnswer() {
        return "443839";
    }

}
