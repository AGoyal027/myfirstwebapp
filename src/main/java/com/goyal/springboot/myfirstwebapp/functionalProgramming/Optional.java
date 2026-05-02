package com.goyal.springboot.myfirstwebapp.functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Optional {

	public static void main(String[] args) {
		
		List<String> fruits = Arrays.asList("apple", "banana", "mango");
		Predicate<? super String> predicate = fruit -> fruit.startsWith("k");
		java.util.Optional<String> optional = fruits.stream().filter(predicate).findFirst();
		System.out.println(optional);
		System.out.println(optional.isEmpty());
		System.out.println(optional.isPresent());
		System.out.println(optional.get());
		
		java.util.Optional<String> fruit = java.util.Optional.of("banana");
		java.util.Optional<String> empty = java.util.Optional.empty();
	}

}
