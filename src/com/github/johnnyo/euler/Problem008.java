package com.github.johnnyo.euler;

import java.util.HashMap;
import java.util.Map;

import com.github.johnnyo.euler.util.Cache;

/**
 * Find the greatest product of five consecutive digits in the 1000-digit number.
 * 
 * 
 * @author johnnyo
 * 
 */
public class Problem008 extends BaseTestCase {

	// This is our initial input
	private final String input = "7316717653133062491922511967442657474235534919493496983520312774506326239578318" +
			"0169848018694788518438586156078911294949545950173795833195285320880551112540698747158523863050715693" +
			"2909632952274430435576689664895044524452316173185640309871112172238311362229893423380308135336276614" +
			"2828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274" +
			"9219016997208880937766572733300105336788122023542180975125454059475224352584907711670556013604839586" +
			"4467063244157221553975369781797784617406495514929086256932197846862248283972241375657056057490261407" +
			"9729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465" +
			"6748139191231628245861786645835912456652947654568284891288314260769004224219022671055626321111109370" +
			"5442175069416589604080719840385096245544436298123098787992724428490918884580156166097919133875499200" +
			"5240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600" +
			"823257530420752963450";

	// rather than parsing each digit every time, we set up a simple map from the character representation to the
	// integer representation of a number

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
		Map<Character,Integer> map = Cache.getCharacterToIntegerMap();
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
