package com.github.johnnyo.euler;

public class Problem001 extends BaseTestCase {

	@Override
	public String getAnswer() {
		return Integer.toString(233168);
	}

	@Override
	public String solve() {
		int sum = 0;
		for (int i = 1; i < 1000; i++)
			if (i % 3 == 0 || i % 5 == 0)
				sum += i;
		return Integer.toString(sum);
	}

}
