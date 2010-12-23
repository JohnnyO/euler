package com.github.johnnyo.euler;

public class Problem006 extends BaseTestCase {

	@Override
	public String getAnswer() {
		return "25164150";
	}

	@Override
	public String solve() {
		long sumOfSquares = 0;
		long sum = 0;
		for (long i=0; i <= 100; i++) {
			sum = sum +  i;
			sumOfSquares = sumOfSquares + (i*i);
		}
		long difference = (sum*sum) - sumOfSquares;
		return Long.toString(difference);
	}
	
	

}
