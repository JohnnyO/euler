package com.github.johnnyo.euler;

import com.github.johnnyo.euler.util.TriangleSolver;

/**
 * This solution is exactly the same as the solution to Problem 018, just with a different data file.
 * 
 * @author JohnnyO
 * 
 */
public class Problem067 extends TriangleSolver {

    public final String getAnswer() {
        return "7273";
    }

    @Override
    protected final String getDataFile() {
        return "data/problem-067.txt";
    }

}
