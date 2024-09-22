package com.deloitte.lab9.ex4;

interface CitizenDetailInput {
	Citizen create(String name, int age);
}

public class CreationUsingMethodReference {
	public static void main(String[] args) {

		CitizenDetailInput InputSpace = (name, age) -> new Citizen(name, age);

		Citizen citizen = InputSpace.create("Ajay Pritam", 40);

		System.out.println(citizen);

	}

}
