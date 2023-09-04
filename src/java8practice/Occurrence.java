
package java8practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Occurrence {
	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 4, 43, 87, 2, 95, 9, 2, 46, 1, 2, 56, 56, 2, 5, 5, 6, 15, 5, 1 };
//		
//		
//		Type 1:System.out.println("--------To find the occurrence of Number in Java ----------");
		List<Integer> list = Arrays.asList(arr1);
//		Map<Integer, Long> countMap = list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()))
//				.entrySet().stream().filter(entry -> entry.getValue() > 1)
//				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
//		countMap.forEach((number, count) -> System.out.println(number + " : " + count));
//		
//		Type 2:System.out.println("----------------To find the occurrence of character---------------------");
//		Character []arr2= {'a','n','a','n','t','a'};
//				
//		List<Character> list1 = Arrays.asList(arr2);
//
//		Map<Character, Long> countMap1 = list1.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()))
//				.entrySet().stream().filter(entry -> entry.getValue() > 1)
//				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
//		countMap1.forEach((number, count) -> System.out.println(number + " : " + count));
//		
//	

//		Type 3: System.out.println("-----------------To find the occurrence of String---------------");
//		String litrals = "Rahulkangude";
//
//		String[] arrlitrals = litrals.split("");
//
//		List<String> list5 = Arrays.asList(arrlitrals);
//		System.out.println(list5);
//
//		Map<String, Long> countString = list5.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()))
//				.entrySet().stream().filter(entry -> entry.getValue() >1)
//				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
//		countString.forEach((a, b) -> System.out.println(a + " :: " + b));
//		

		// Type 4 frequency of repetetions in all List
//		Set<Integer>set=new HashSet<>();
//		
//		Map<Integer, Long>set1=list.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()));
//		
//		set1.forEach((a,b)->System.out.println(a+" : "+b));

		// Type 5 one number frequancy

		int target = 2;
		long l1 = Collections.frequency(list, target);

		System.out.println(target + "-->> " + l1);

	}
}
