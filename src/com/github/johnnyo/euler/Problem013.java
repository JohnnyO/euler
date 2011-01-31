package com.github.johnnyo.euler;

import java.io.*;
import java.math.BigInteger;

/**
 * 
 * @author JohnnyO
 * 
 */
public class Problem013 extends BaseTestCase {

	@Override
	public String getAnswer() {
		return "5537376230";
	}

	@Override
	public String solve() {
		try {
			InputStream is = this.getClass().getResourceAsStream("problem-013-data.txt");
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			String line = null;
			BigInteger sum = new BigInteger("0");
			while ((line = reader.readLine()) != null) {
				sum = sum.add(new BigInteger(line));
			}
			return sum.toString().substring(0,10);
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return null;
		}
	}

}