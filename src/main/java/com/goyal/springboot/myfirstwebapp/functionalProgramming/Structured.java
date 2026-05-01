package com.goyal.springboot.myfirstwebapp.functionalProgramming;

import java.util.List;

public class Structured {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(22,28,93,48,2,22,48,9,3);
		//printAllNumbersInListStructured(numbers);
		printEvenNumbersInListStructured(numbers);
	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		
		for(int number:numbers) {
			System.out.println(number);
		}
	}
		
	private static void printEvenNumbersInListStructured(List<Integer> numbers) {
			
		for(int number:numbers) {
			if(number%2==0) {
			System.out.println(number);
			}
		}
	}

}
