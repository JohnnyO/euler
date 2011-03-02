package com.github.johnnyo.euler;

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

	String[] data = new String[] {
			"75",
			"95 64",
			"17 47 82",
			"18 35 87 10",
			"20 04 82 47 65",
			"19 01 23 75 03 34",
			"88 02 77 73 07 63 67",
			"99 65 04 28 06 16 70 92",
			"41 41 26 56 83 40 80 70 33",
			"41 48 72 33 47 32 37 16 94 29",
			"53 71 44 65 25 43 91 52 97 51 14",
			"70 11 33 28 77 73 17 78 39 68 17 57",
			"91 71 52 38 17 14 91 43 58 50 27 29 48",
			"63 66 04 68 89 53 67 30 73 16 69 87 40 31",
			"04 62 98 27 23 09 70 98 73 93 38 53 60 04 23"
	};

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
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();

		for (String s : data) {
			List<Integer> numbers = new ArrayList<Integer>();
			for (String number : s.split(" "))
				numbers.add(Integer.parseInt(number, 10));
			triangle.add(numbers);
		}
		
		for (int i=triangle.size() - 2; i >= 0; i--) {
			for (int j = 0 ; j < triangle.get(i).size(); j++) {
				int max = triangle.get(i).get(j) + Math.max(triangle.get(i+1).get(j), triangle.get(i+1).get(j+1));
				triangle.get(i).set(j, max);
			}
		}
		
		return triangle.get(0).get(0).toString();
	}
}
