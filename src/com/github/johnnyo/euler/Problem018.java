package com.github.johnnyo.euler;

import com.github.johnnyo.euler.util.TriangleSolver;

/**
 * Find the maximum total from top to bottom of the triangle below:
 * 
 * Solution:
 * 
 * The trick to solving this efficiently is to use a greedy algorithm that works backwards up the triangle, rather than
 * trying to guess the right path down the triangle. *
 * 
 * @author JohnnyO
 * 
 */
public class Problem018 extends TriangleSolver {

    @Override
    public final String getAnswer() {
        return "1074";
    }

    @Override
    protected final String getDataFile() {
        return "data/problem-018.txt"; 
    }
}
