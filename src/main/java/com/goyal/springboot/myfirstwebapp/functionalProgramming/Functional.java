package com.goyal.springboot.myfirstwebapp.functionalProgramming;

import java.util.List;

public class Functional {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(22, 28, 93, 48, 2, 22, 48, 9, 3);
		// printAllNumbersInListFunctional(numbers);
		printEvenNumbersInListFunctional(numbers);
	}

	//private static boolean isEven(int number) { return number % 2 == 0; }

	//private static void print(int number) { System.out.println(number); }
	
	private static void printAllNumbersInListFunctional(List<Integer> numbers) {

		// [22,28,93,48,2,22,48,9,3]
		// 22
		// 28
		// 93
		// 48
		// ....

		numbers.stream().forEach(System.out::println); // Method Reference
	}

	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {

		numbers.stream()
			.filter(number -> number%2 == 0)
			.forEach(System.out::println); // Method Reference
		
		//.filter(Functional::isEven) // Filter - Only Allow Even Numbers
	}

}
