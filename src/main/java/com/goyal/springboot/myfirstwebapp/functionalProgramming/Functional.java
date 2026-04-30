package com.goyal.springboot.myfirstwebapp.functionalProgramming;

import java.util.List;

public class Functional {

	public static void main(String[] args) {
		
		printAllNumbersInListFunctional(List.of(22,28,93,48,2,22,48,9,3));
	}
	
	private static void print(int number) {
		System.out.println(number);
	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		
		//[22,28,93,48,2,22,48,9,3]
		//22
		//28
		//93
		//48
		//....
		
		numbers.stream().forEach(Functional::print);//Method Reference
		
		/*
		 * for(int number:numbers) { System.out.println(number); }
		 */
	}

}
