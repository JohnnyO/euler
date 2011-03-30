package com.github.johnnyo.euler;

import java.io.*;
import java.util.*;

/**
 * Using the provided file 46K text file containing over five-thousand first
 * names, begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply
 * this value by its alphabetical position in the list to obtain a name score.
 * 
 * For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the
 * 938th name in the list. So, COLIN would obtain a score of 938*53 = 49714.
 * 
 * What is the total of all the name scores in the file?
 *  
 * @author johnnyo
 * 
 */
public class Problem022 extends BaseTestCase {

	@Override
	public String getAnswer() {
		return "871198282";
	}

	@Override
	public String solve() {
		String input = this.getInput();
		List<String> names = new ArrayList<String>();
		for (String name : input.split(",")) {
			// remove start and end quote character
			names.add(name.substring(1, name.length() - 1));
		}

		Collections.sort(names);

		long totalScore = 0;
		for (int index = 0; index < names.size(); index++) {
			String name = names.get(index);

			// add one below because the problem definition uses 1-based indexing for scoring
			int score = this.getScore(name) * (index + 1);
			totalScore = totalScore + score;
		}
		return Long.toString(totalScore);
	}

	private int getScore(String name) {
		int score = 0;
		for (char c : name.toCharArray()) {
			score += Character.getNumericValue(c) - 9; // getNumericValue returns 10-35
		}
		return score;
	}

	public String getInput() {
		try {
			String input = "";
			InputStream is = this.getClass().getResourceAsStream("data/problem-022.txt");
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			String line = null;
			while ((line = reader.readLine()) != null) {
				input += line;
			}
			return input;
		} catch (IOException ioe) {
			return null;
		}
	}

}
