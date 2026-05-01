package com.goyal.springboot.myfirstwebapp.functionalProgramming;

import java.util.List;

public class Exercises {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(22, 28, 93, 48, 2, 22, 48, 9, 3);
		//printOddNumbersInListFunctional(numbers);
		printCubesOfOddNumbersInListFunctional(numbers);
		
		List<String> courses = 
				List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
		
		courses.stream()
		.forEach(System.out::println);
		
		courses.stream()
		.filter(course -> course.contains("Spring"))
		.forEach(System.out::println);
		
		courses.stream()
		.filter(course -> course.length()>=4)
		.forEach(System.out::println);
		
		courses.stream()
		.map(course -> course + " " + course.length())
		.forEach(System.out::println);
		
	}
	
	private static void printOddNumbersInListFunctional(List<Integer> numbers) {

		numbers.stream()
			.filter(number -> number%2 == 1)
			.forEach(System.out::println);
	}
	
	private static void printCubesOfOddNumbersInListFunctional(List<Integer> numbers) {

		numbers.stream()
			.filter(number -> number%2 != 0)
			.map(n -> n * n * n)
			.forEach(System.out::println);
	}

}
