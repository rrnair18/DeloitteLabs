package com.deloitte.lab6.ex6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidVoterChecker {

	private static List<Integer> votersList(Map<Integer, Integer> voter) {

		List<Integer> VoterList = new ArrayList<Integer>();

		for (Map.Entry<Integer, Integer> entry : voter.entrySet()) {
			int ID = entry.getKey();
			int age = entry.getValue();
			if (age > 18)
				VoterList.add(ID);
		}

		return VoterList;
	}

	public static void main(String[] args) {

		Map<Integer, Integer> Voter = new HashMap<>();

		Voter.put(101, 19);
		Voter.put(102, 11);
		Voter.put(103, 29);
		Voter.put(104, 41);
		Voter.put(105, 5);

		List<Integer> eligibleVoters = votersList((HashMap<Integer, Integer>) Voter);

		System.out.println("VoterIDs of voters eligible for voting : " + eligibleVoters);

	}

}
