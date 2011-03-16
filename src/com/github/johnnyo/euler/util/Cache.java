package com.github.johnnyo.euler.util;

import java.util.HashMap;
import java.util.Map;

public class Cache {

	
	private static Map<Character, Integer> mapCharacterToInteger;	
	
	public static Map<Character,Integer> getCharacterToIntegerMap() {
		if (mapCharacterToInteger == null) {
			mapCharacterToInteger = new HashMap<Character,Integer>();
			mapCharacterToInteger.put('0', 0);
			mapCharacterToInteger.put('1', 1);
			mapCharacterToInteger.put('2', 2);
			mapCharacterToInteger.put('3', 3);
			mapCharacterToInteger.put('4', 4);
			mapCharacterToInteger.put('5', 5);
			mapCharacterToInteger.put('6', 6);
			mapCharacterToInteger.put('7', 7);
			mapCharacterToInteger.put('8', 8);
			mapCharacterToInteger.put('9', 9);
		}
		return mapCharacterToInteger;
	}

}
