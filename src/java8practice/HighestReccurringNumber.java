package java8practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class HighestReccurringNumber {
	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 4, 43, 87, 2, 95, 9, 2, 46, 1, 2, 56, 56, 2, 5, 5, 6, 15, 5, 1 };
		
	List <Integer>list=Arrays.asList(arr1);
	Optional<Integer>list2=list.stream().max(Comparator.comparingInt(num->Collections.frequency(list,num)));
	}
}
