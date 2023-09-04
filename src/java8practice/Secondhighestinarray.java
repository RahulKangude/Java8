package java8practice;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Secondhighestinarray {
	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 4, 43, 87, 2, 95, 9, 2, 46, 1, 2, 56, 56, 2, 5, 5, 6, 15, 5, 1 };
		Integer s = findSecondHightest(arr1);
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		System.out.println(s);
	}

	public static int findSecondHightest(Integer[] arr1) {
		List<Integer> list = Arrays.asList(arr1);
		TreeSet<Integer> t1 = new TreeSet<>(list);

		// TreeSet<Integer> set = Arrays.stream(arr1).collect(TreeSet::new,
		// TreeSet::add, TreeSet::addAll);

		return t1.lower((t1.last()));

//		return Arrays.stream(arr1)
//        .distinct()
//        .sorted()
//        .skip(arr1.length - 2)
//        .findFirst()
//        .orElseThrow(() -> new IllegalArgumentException("Array has less than two distinct elements."));
	}
}
