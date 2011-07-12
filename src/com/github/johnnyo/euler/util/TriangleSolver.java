package com.github.johnnyo.euler.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.github.johnnyo.euler.BaseTestCase;

/**
 * Implementation of the solution to problems 18 and 67, which ask for the same solution, only applied to different
 * inputs.
 * 
 * The trick to solving this efficiently is to use a greedy algorithm that works backwards up the triangle, rather than
 * trying to guess the right path down the triangle. *
 * 
 * @author JohnnyO
 * 
 */
public abstract class TriangleSolver extends BaseTestCase {

    @Override
    public final String solve() {
        List<List<Integer>> triangle = this.getInput();
        for (int i = triangle.size() - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int max = triangle.get(i).get(j) + Math.max(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1));
                triangle.get(i).set(j, max);
            }
        }
        return triangle.get(0).get(0).toString();
    }

    /**
     * Loads the input arrays from disk as a list of lists to emulate the triangle data structure.
     * 
     * @return the triangle data available in the datafiles.
     */
    private List<List<Integer>> getInput() {
        try {
            List<List<Integer>> input = new ArrayList<List<Integer>>();
            InputStream is = this.getClass().getResourceAsStream(this.getDataFile());
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line = null;
            while ((line = reader.readLine()) != null) {
                List<Integer> numbers = new ArrayList<Integer>();
                for (String number : line.split(" ")) {
                    numbers.add(Integer.parseInt(number, 10));
                }
                input.add(numbers);
            }
            return input;
        } catch (IOException ioe) {
            throw new RuntimeException("Unable to Load Data for Triangle Solver");
        }
    }

    /**
     * Override to define the data for this triangle solver.
     * 
     * @return path to a triangle data file.
     */
    protected abstract String getDataFile();

}
