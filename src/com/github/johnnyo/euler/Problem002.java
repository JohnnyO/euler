package com.github.johnnyo.euler;

public class Problem002 extends BaseTestCase {

	@Override
	public String getAnswer() {
		return Integer.toString(4613732);
	}

	@Override
	public String solve() {
		int sum = 0;
		int a = 0;
		int b = 1;
		int temp;
		while (b < 4000000) {
			if (b % 2 == 0)
				sum += b;
			temp = a;
			a = b;
			b = temp + b;
		}
		return Integer.toString(sum);
	}

}
