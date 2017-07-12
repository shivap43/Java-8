package com.practice.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NamesSort_Java8 {
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person("shiva","prakash"),
				new Person("mohan", "kumar"),
				new Person("benjamin", "manamohan"),
				new Person("muthukumaran", "arumugam")
				);
		
		// Sort list by first name
		Collections.sort(persons, (a,b) -> a.getFirstName().compareTo(b.getFirstName()));
		//create a method that prints all elements in the list
		
		printConditionally(persons, p -> true);
		
		//create a method that prints all people that have first name beginning with M
		printConditionally(persons, p -> p.getFirstName().startsWith("m"));
		
	}

	

	private static void printConditionally(List<Person> persons, Condition condition) {
		for(Person p : persons) {
			if(condition.test(p)) {
				System.out.println(p);
			}
			
		}
	}
	
	
	
}

interface Condition{
	boolean test(Person person);
}

