package io.github.mahendrabagul.streamimprovements;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {
	public static void main(String[] args) {
		// Stream improvements
		IntStream.iterate(1, i -> i < 100, i -> i + 1).forEach(System.out::println);
		// Use of Optional
		Stream<Integer> s = Optional.of(1).stream();
		System.out.println(s.count());
	}
}
