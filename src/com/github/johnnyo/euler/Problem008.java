package com.github.johnnyo.euler;


import java.util.HashMap;
import java.util.Map;


/**
 * Find the greatest product of five consecutive digits in the 1000-digit number.


 * @author johnnyo
 *
 */
public class Problem008 extends BaseTestCase {

	//This is our initial input 
	private final String input = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
	
	//rather than parsing each digit every time, we set up a simple map from the character representation to the 
	//integer representation of a number
	private final Map<Character, Integer> map = new HashMap<Character, Integer>();
	{
		map.put('0', 0);
		map.put('1', 1);
		map.put('2', 2);
		map.put('3', 3);
		map.put('4', 4);
		map.put('5', 5);
		map.put('6', 6);
		map.put('7', 7);
		map.put('8', 8);
		map.put('9', 9);
	}

	@Override
	public String getAnswer() {
		// TODO Auto-generated method stub
		return "40824";
	}

	@Override
	/**
	 * This is another pretty straightforward solution, it simply requires us to do some conversion between a string,
	 * its characters and the integers that they represent
	 */
	public String solve() {
		char[] digits = input.toCharArray();

		int max = 0;
		for (int i = 0; i < digits.length - 5; i++) {
			int value = map.get(digits[i]);

			value *= map.get(digits[i + 1]);
			value *= map.get(digits[i + 2]);
			value *= map.get(digits[i + 3]);
			value *= map.get(digits[i + 4]);

			max = Math.max(max, value);
		}
		return Integer.toString(max);
	}

}
