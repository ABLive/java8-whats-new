package com.ablive.streamapiandcollectors;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class FirstPredicates {

	public static void main(String[] args) {

		Stream<String> stream =  Stream.of("one", "two", "three", "four", "five");
		
		//	Predicate #1
		Predicate<String> p1 = s -> s.length() > 3;
		
		//	Consumer implementation #1 using Predicate #1
		stream
			.filter(p1)
			.forEach(s -> System.out.println(s));
		
		
		Stream<String> stream2 =  Stream.of("one", "two", "three", "four", "five");
		
		//	Predicate #2
		Predicate<String> p2 = Predicate.isEqual("two");
		
		//	Consumer implementation #2 using Predicate #2
		stream2
			.filter(p2)
			.forEach(s -> System.out.println(s));
		
 	}
	
}