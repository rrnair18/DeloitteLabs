package com.deloitte.lab6.ex4;

import java.util.HashMap;
import java.util.Map;

public class GetMedals {

	private static Map<Integer, String> getStudents(HashMap<Integer, Integer> studentMarks) {

		Map<Integer, String> medalMap = new HashMap<>();

		for (Map.Entry<Integer, Integer> entry : studentMarks.entrySet()) 
		{
			int regNumber = entry.getKey();
			int marks = entry.getValue();


			if (marks >= 90) {
				medalMap.put(regNumber, "Gold");
			} else if (marks >= 80 && marks < 90) {
				medalMap.put(regNumber, "Silver");
			} else if (marks >= 70 && marks < 80) {
				medalMap.put(regNumber, "Bronze");
			}
		}
		
		return medalMap;
	}
	
	public static void main(String[] args) {

		HashMap<Integer, Integer> studentMarks = new HashMap<>();
		studentMarks.put(101, 95);
		studentMarks.put(102, 85);
		studentMarks.put(103, 75);
		studentMarks.put(104, 65);

		Map<Integer, String> result = getStudents(studentMarks);
		System.out.println(result);
	}
	
}
