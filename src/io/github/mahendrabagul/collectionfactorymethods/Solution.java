package io.github.mahendrabagul.collectionfactorymethods;

import java.util.List;

public class Solution {
	public static void main(String[] args) {
		/**
		 * Earlier approach
		 */
		// List<String> euCountries = new ArrayList<>();
		// euCountries.add("France");
		// euCountries.add("Bulgaria");
		// euCountries.add("Germany");

		List<String> myList = List.of("one", "two", "three");
		myList.stream().filter(s -> s.startsWith("t")).map(String::toUpperCase).sorted().forEach(System.out::println);
	}
}
