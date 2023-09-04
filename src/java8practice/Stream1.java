package java8practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream1 {
	public static void main(String[] args) {

		// find duplicate numbers and count of the value
		Integer[] arr1 = { 1, 2, 4, 43, 87, 2, 95, 9, 2, 46, 1, 2, 56, 56, 2, 5, 5, 6, 15, 5, 1 };

		List<Integer> list = Arrays.asList(arr1);
//
//		Set<Integer> s1 = new HashSet<>();
//		
//		System.out.println("-------------find duplicate numbers and count of the number -----------------");
//
//		Set<Integer> remove = list.stream().filter(i -> !s1.add(i)).collect(Collectors.toSet());
//		System.out.println(remove);
//		Long count1 = remove.stream().count();
//		System.out.println("duplicate elements " + count1);
//		
//		
//		System.out.println("-------------- Type-2 count occurrences only duplicate number---------------");

		// Type-2 count occurrences only duplicate number
//		Map<Integer, Long> countMap = list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()))
//				.entrySet().stream().filter(entry -> entry.getValue() > 1)
//				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
//		// Print the counts
//		countMap.forEach((number, count) -> System.out.println(number + " : " + count));
//
		

		System.out.println("----------------Count the occurrences of the target number------------------");

		// Type --3. Count the occurrences of the target number
		// List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 3, 5, 1, 4, 6);
		int targetNumber = 2;
		// Count the occurrences of the target number
		long count = Collections.frequency(list, targetNumber);
		System.out.println("Number of occurrences of " + targetNumber + ": " + count);

		
		System.out.println("------------- Type--4 Count the occurrences of all numbers-----------------");

		
		// Type--4 Count the occurrences of all numbers
		Map<Integer, Long> countMap1 = list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		// Print the counts
		countMap1.forEach((number, count2) -> System.out.println(number + " : " + count2));
	}
}
