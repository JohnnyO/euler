package com.github.johnnyo.euler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * What is the greatest product of four adjacent numbers in any direction (up, down, left, right, or diagonally) in the
 * 20x20 grid?
 * 
 * @author JohnnyO
 */

public class Problem011 extends BaseTestCase {

    /**
     * The grid of data to be processed.
     */
    private int[][] grid = new int[20][20];

    @Override
    public final String getAnswer() {
        return "70600674";
    }

    /**
     * In order to solve this one, we need to iterate through the grid in each of the 8 cardinal directions. We can
     * specify these cardinal direction by defining our direction with a xstep and a ystep. x=+1 and y=0 is EAST y=-1
     * and y=0 is WEST x=+1 and y=+1 is NORTHEAST, etc.
     * 
     * Now, we loop through each direction and perform a search in that direction
     * @return the largest value in all the possible cardinal directions.
     */
    @Override
    public final String solve() {
        this.getInput();
        long max = 0;
        for (int x = -1; x < 2; x++) {
            for (int y = -1; y < 2; y++) {
                if (!(x == 0 && y == 0)) { // if x and y are both zero, we aren't advancing, just cubing the numbers
                    max = Math.max(max, search(x, y));
                }
            }
        }

        return Long.toString(max);
    }

    /**
     * Populates the data array with the problem, read in from an outside data file.
     */
    private void getInput() {
        try {
            InputStream is = this.getClass().getResourceAsStream("data/problem-011.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line = null;
            for (int i = 0; i < 20; i++) {
                line = reader.readLine();
                String[] digits = line.split(" ");
                for (int j = 0; j < 20; j++) {
                    grid[i][j] = Integer.parseInt(digits[j]);
                }
            }
        } catch (IOException ioe) {
            throw new RuntimeException("Unable to load data for Problem 011");
        }
    }

    /**
     * A search simply figures out what the proper start and end points are for the loop, then runs through the grid to
     * find the biggest product in a given cardinal direction.
     * 
     * @param xIncrement direction of xChange
     * @param yIncrement direction of yChange
     * @return the largest value in the given cardinal direction.
     */
    private long search(final int xIncrement, final int yIncrement) {
        long max = 0;
        int xStart = 0;
        if (xIncrement < 0) {
            xStart = 3;
        }
        
        int xStop = 20;
        if (xIncrement > 0) {
            xStop = 17;
        }
        
        int yStart = 0;
        if (yIncrement < 0) {
            yStart = 3;
        }
            
        
        int yStop = 20;
        if (yIncrement > 0) {
            yStop = 17;
        }



        for (int x = xStart; x < xStop; x++) {
            for (int y = yStart; y < yStop; y++) {
                long product = 1;
                for (int i = 0; i < 4; i++) {
                    product = product * grid[x + (i * xIncrement)][y + (i * yIncrement)];
                }
                max = Math.max(product, max);
            }
        }
        return max;
    }

}
