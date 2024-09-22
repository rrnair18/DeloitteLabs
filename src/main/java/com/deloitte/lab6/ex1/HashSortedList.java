package com.deloitte.lab6.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class HashSortedList {

	public static List<Integer> getValues(HashMap<String, Integer> map) {

		List<Integer> valueList = new ArrayList<>();

		for (Integer value : map.values()) {
			valueList.add(value);
		}

		Collections.sort(valueList);
		return valueList;
	}

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();
		map.put("one", 1);
		map.put("three", 3);
		map.put("two", 2);

		List<Integer> sortedValues = getValues(map);
		System.out.println(sortedValues);
	}

}
