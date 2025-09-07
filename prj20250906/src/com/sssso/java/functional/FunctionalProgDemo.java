package com.sssso.java.functional;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FunctionalProgDemo {

	public static void main(String[] args) {

		/*
		 * Imperative Programming: In this we will mention how to achieve a task.
		 * Functional programming: It is the latest programming technique designed based
		 * on computation and evaluation based on mathematical functions. It works
		 * mostly using the pipeline (stream) of data.
		 */

//		List<String> cities = List.of("Hyderabad", "Ahmedabad", "Secunderabad");
//		List<String> areas = Arrays.asList("Kukatpally", "Khairtabad", "Ameerpet");
//
//		for (String city : cities) {
//			if (city.equalsIgnoreCase("Hyderabad"))
//				System.out.println(city);
//		}
//
//		System.out.println("************************");
//		Stream<String> citiesStream = cities.stream();
//		List<String> collectedList = citiesStream
//				.filter(city -> city.equalsIgnoreCase("Secunderabad"))
//				.collect(Collectors.toList());
//		
//		for (String city : collectedList) {
//			System.out.println(city);
//		}
//		
//		List<Integer> nums = List.of(6,54,23,98,12);
//		List<Integer> numsList = nums.stream()
//				.filter(num -> num%2 == 0)
//				.collect(Collectors.toList());
//		System.out.println(numsList);
//		
//		List<String> names = Arrays.asList("Apple", "PineApple", "Banana", "Cranberry", "Blueberry");
//		
//		Predicate<? super String> predicate = fruit -> fruit.startsWith("B");
//		
//		names.stream()
//			.filter(predicate)
//			.filter(BFruit -> BFruit.equalsIgnoreCase("Banana"))
//			.forEach(frt -> System.out.println(frt));
		
//		Example asked by student
		LinkedHashMap<String, List<String>> citiesAndAreas = new LinkedHashMap<String, List<String>>();
		citiesAndAreas.put("Vijayawada", List.of("Benz circle", "Vidyadharapuram"));
		citiesAndAreas.put("Hyderabad", List.of("Ameerpet", "MGBS"));
		citiesAndAreas.put("Secunderabad", List.of("Patny", "Jublee Busstation"));
		
		String findCity = "Hyderabad";
		String findArea = "Ameerpet";
		
		List<String> areas = citiesAndAreas.entrySet().stream()
			.filter(entry -> entry.getKey().equalsIgnoreCase(findCity))
			.flatMap(entry -> entry.getValue().stream())
			.filter(area -> area.equalsIgnoreCase(findArea))
			.collect(Collectors.toList());
		
		System.out.println(areas);
	

	}

}
