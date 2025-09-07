package com.sssso.java.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class CollectionsDemo {

	public static void main(String[] args) {

		/*
		 * Collections framework: It is the combination of some interfaces and their
		 * implementations.
		 * 
		 * List - ArrayList, LinkedList Map - Hashmap, LinkedHashmap Set -
		 * LinkedHashset, Treeset Queue/Dequeue - ArrayDeque, etc.
		 * 
		 */

		/*
		 * ArrayList<Integer> arrayList = new ArrayList<Integer>(); arrayList.add(1);
		 * arrayList.add(3); arrayList.add(2); displayArrayList(arrayList); //
		 * arrayList.remove(0); Collections.sort(arrayList);
		 * displayArrayList(arrayList); Collections.reverse(arrayList);
		 * displayArrayList(arrayList);
		 * System.out.println(Collections.binarySearch(arrayList, 0));
		 */

		HashMap<Integer, String> keyMap = new HashMap<Integer, String>();
		keyMap.put(1, "Apple");
		keyMap.put(2, "Pineapple");
		keyMap.put(3, "Guava");
		keyMap.put(4, "Banana");
		for (Entry<Integer, String> entry : keyMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}

		keyMap.forEach((key, value) -> {
			System.out.println("Key: " + key + "::Value: " + value);
		});

	}

	public static void displayArrayList(ArrayList<Integer> arrList) {
		for (Integer element : arrList) {
			System.out.println(element);
		}
		System.out.println("**********************");
	}

}
