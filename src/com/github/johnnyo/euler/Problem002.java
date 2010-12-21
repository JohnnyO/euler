package com.github.johnnyo.euler;

import com.github.johnnyo.euler.util.FibonacciSequence;

public class Problem002 extends BaseTestCase {

	@Override
	public String getAnswer() {
		return Integer.toString(4613732);
	}

	@Override
	public String solve() {

		FibonacciSequence fibonacci = new FibonacciSequence(4000000);
		int sum = 0;
		for (Integer value : fibonacci) {
			if (value % 2 == 0)
				sum = sum + value;
		}
		return Integer.toString(sum);
	}


}
