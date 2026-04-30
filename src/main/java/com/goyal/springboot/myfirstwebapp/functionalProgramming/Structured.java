package com.goyal.springboot.myfirstwebapp.functionalProgramming;

import java.util.List;

public class Structured {

	public static void main(String[] args) {
		
		printAllNumbersInListStructured(List.of(22,28,93,48,2,22,48,9,3));
	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		
		for(int number:numbers) {
			System.out.println(number);
		}
	}

}
