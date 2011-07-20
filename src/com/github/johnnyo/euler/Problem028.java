package com.github.johnnyo.euler;
/**
 * Starting with the number 1 and moving to the right in a clockwise direction a 5 by 5 spiral is formed as follows:
 * 
 * <pre>
 * 21 22 23 24 25
 * 20  7  8  9 10
 * 19  6  1  2 11
 * 18  5  4  3 12
 * 17 16 15 14 13
 * </pre>
 * 
 * It can be verified that the sum of the numbers on the diagonals is 101.
 * 
 * 101 = 1 + 3 + 5+ 7+ 9 + 13 + 17 + 21 + 25
 * 
 * What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed in the same way?
 * 
 * Solution:
 * 
 * Here, the trick is just coming up with an expression for each of the four diagonals, and then summing them. The
 * easiest way to come up with these equations is simple inspection.
 * 
 * for an nxn spiral, the value in the corners is as follows:
 * 
 * <pre>
 * NE: n^2 
 * SE: n^2 -3n + 3 
 * SW: (n-1)^2 + 1 
 * NW: n^2 - n + 1
 * </pre>
 * 
 * 
 * @author JohnnyO
 * 
 */
public class Problem028 extends BaseTestCase {

    @Override
    public final String solve() {
        long sum = 1; // the center value
        for (int n = 3; n <= 1001; n = n + 2) { // sprial size goes up by 2 each time cycle.
            sum += n * n; // NE corner
            sum += (n * n) - (3 * n) + 3; // SE corner
            sum += (n - 1) * (n - 1) + 1; // SW corner
            sum += n * n - n + 1; // NW corner
        }
        return Long.toString(sum);
    }

    @Override
    public final String getAnswer() {
        return "669171001";
    }

}
