package java8practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartWith {
	public static void main(String[] args) {

		List<String> s = Arrays.asList("Live","in","java");
		 s.stream().filter(k -> k.length()>3).forEach(System.out::println);
		 
		 Integer[] arr1 = { 1, 2, 4, 43, 87, 2, 95, 9, 2, 46, 1, 2, 56, 56, 2, 5, 5, 6, 15, 5, 1 };
		 String arr2=arr1.toString();
		 
		 List<String>list=Arrays.asList(arr2);
		 
		 List<String>l1=list.stream().filter(e->String.valueOf(s).startsWith("1")).collect(Collectors.toList());
		 System.out.println(l1);
			
		 
	}
}
