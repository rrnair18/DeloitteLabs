package com.deloitte.lab6.ex2;

import java.util.HashMap;
import java.util.Map;

public class CharacterCalculator {

	private static Map<Character, Integer> countChars(char[] arr) {
		
		Map<Character, Integer> charCountMap = new HashMap<>();
		
		for (char c : arr) {		
			if(charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c)+1);
			}else {
				charCountMap.put(c, 1);
			}
		}
		
		return charCountMap;
	}

	public static void main(String[] args) {

		char[] arr = { 'a', 'b', 'c', 'a', 'b', 'z', 'd' };

		Map<Character, Integer> result = countChars(arr);
		System.out.println(result);

	}

}
