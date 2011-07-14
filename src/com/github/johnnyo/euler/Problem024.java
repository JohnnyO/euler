package com.github.johnnyo.euler;

import java.util.ArrayList;
import java.util.List;

import com.github.johnnyo.euler.util.AdvancedMath;

/**
 * A permutation is an ordered arrangement of objects. For example, 3124 is one possible permutation of the digits 1, 2,
 * 3 and 4. If all of the permutations are listed numerically or alphabetically, we call it lexicographic order. The
 * lexicographic permutations of 0, 1 and 2 are:
 * 
 * 012 021 102 120 201 210
 * 
 * What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
 * 
 * Solution:
 * 
 * This problem is actually fairly easily solved using pen and paper. We know that there are 10! total permutations of
 * the 10 digits. Of these 9! begin with 0, 9! begin with 1, 9! begin with 2, etc.
 * 
 * Since 9! = 362880, we know that the first 362,880 numbers begin with 0, then 362,881 to 725760 begin with 1, so the
 * millionth must begin with 2. Repeating this logic will give us our final answer.
 * 
 * Using this logic recursively, we are able to solve the problem.
 * 
 * 
 * @author JohnnyO
 * 
 */
public class Problem024 extends BaseTestCase {

    @Override
    public final String solve() {
        int[] index = new int[10]; // note that the last value is not populated, just defaults to zero

        int target = 1000000;
        int sum = 0;
        for (int i = 9; i > 0; i--) {
            int count = 0;
            int factorial = AdvancedMath.factorial(i).intValue();
            while (sum + factorial * (count + 1) < target) {
                count++;
            }
            sum += count * factorial;
            index[9 - i] = count;
        }

        List<Integer> digits = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            digits.add(i);
        }

        StringBuffer result = new StringBuffer(10);
        for (int i = 0; i < index.length; i++) {
            result.append(digits.remove(index[i]));
        }
        return result.toString();
    }

    @Override
    public final String getAnswer() {
        return "2783915460";
    }

}
