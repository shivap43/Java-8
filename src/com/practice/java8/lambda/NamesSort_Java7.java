package com.practice.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

import org.omg.Messaging.SyncScopeHelper;

public class NamesSort_Java7 {
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person("shiva","prakash"),
				new Person("mohan", "kumar"),
				new Person("benjamin", "manamohan"),
				new Person("muthukumaran", "arumugam")
				);
		
		// Sort list by first name
		Collections.sort(persons, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.firstName.compareTo(o2.firstName);
			}
		});
		//create a method that prints all elements in the list
		
		for(Person p : persons) {
			System.out.println(p);
		}
		
		//create a method that prints all people that have first name beginning with M
		for(Person p : persons) {
			if(p.getFirstName().startsWith("m")) {
				System.out.println(p);
			}
			
		}
		
	}
}
