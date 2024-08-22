package com.number;

public class Main {

	public static void main(String[] args) {

		String ssn = "951221-2111111";

		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);

		String secondNum = ssn.substring(7);
		System.out.println(secondNum);

	}

}
