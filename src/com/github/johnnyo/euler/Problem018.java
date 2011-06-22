package com.github.johnnyo.euler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Find the maximum total from top to bottom of the triangle below:
 * 
 * 
 * @author JohnnyO
 * 
 */
public class Problem018 extends BaseTestCase {

	@Override
	public String getAnswer() {
		return "1074";
	}

	@Override
	/**
	 * The trick to solving this efficiently is to use a greedy algorithm that works backwards up the triangle, rather
	 * than trying to guess the right path down the triangle.
	 */
	public String solve() {
		List<List<Integer>> triangle = this.getInput();
		for (int i = triangle.size() - 2; i >= 0; i--) {
			for (int j = 0; j < triangle.get(i).size(); j++) {
				int max = triangle.get(i).get(j) + Math.max(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1));
				triangle.get(i).set(j, max);
			}
		}
		return triangle.get(0).get(0).toString();
	}

	private List<List<Integer>> getInput() {
		try {
			List<List<Integer>> input = new ArrayList<List<Integer>>();
			InputStream is = this.getClass().getResourceAsStream(this.getDataFile());
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			String line = null;
			while ((line = reader.readLine()) != null) {
				List<Integer> numbers = new ArrayList<Integer>();
				for (String number : line.split(" "))
					numbers.add(Integer.parseInt(number, 10));
				input.add(numbers);
			}
			return input;
		} catch (IOException ioe) {
			throw new RuntimeException("Unable to Load Data for Problem 018");
		}
	}

	protected String getDataFile() {
		return "data/problem-018.txt";  //overriden in Problem067, since its the same solution with different data
	}
}
