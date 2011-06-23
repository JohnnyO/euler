package com.github.johnnyo.euler.util;

import java.util.HashMap;
import java.util.Map;

/**
 * A minimal implementation of a mapping between the characters and their numeric representations. Using the cache is
 * faster than repeated calls to parsing routines.
 * 
 * @author JohnnyO
 * 
 */
public final class Cache {

    /**
     * Default constructor. This class is not instantiable.
     */
    private Cache() {

    }

    /**
     * lazily instantiated Map.
     */
    private static Map<Character, Integer> mapCharacterToInteger;

    /**
     * 
     * @return a Mapping from the Characters '0'..'9' to their corresponding integer values.
     */
    public static Map<Character, Integer> getCharacterToIntegerMap() {
        if (mapCharacterToInteger == null) {
            mapCharacterToInteger = new HashMap<Character, Integer>();
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
