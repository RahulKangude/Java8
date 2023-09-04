
package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamAPI {
	public class Supplier_demo {

	}

	public static void main(String[] args) {

		Integer[] mrarr = { 10, 25, 3, 18, 3, 2, 7, 5, 1, 52, 52, 9, 3 };

//Arrays.stream(mrarr).     distinct().                         sorted(Collections.reverseOrder()).forEach(System.out::println);
//convert into Stream	//remove dublicate and return Stream  //ascending order and return Stream 
//System.out.println("/////////////////////////////////////////////////");
//Arrays.stream(mrarr).sorted(Collections.reverseOrder()).forEach(System.out::println);

//Arrays.stream(mrarr).sorted().filter(r->r>=10).filter(r->r%2==0).forEach(System.out::println);
//
//Long l1=Arrays.stream(mrarr).sorted().filter(r->r>=10).filter(r->r%2==0).count();
//System.err.println( "count of number-->>"+l1);

		// 1.sort an array of class type
//     Integer []myarr= {2,56,7,1,2,8,4,25,14,3,6,9,2,4521,22,52,4,1,15};     
//     Arrays.stream(myarr).sorted().collect(Collectors.toList()).forEach(System.out::println);;

//  2.Sort Array DEcending order 
//     Integer []myarr1= {2,56,7,1,2,8,4,25,14,3,6,9,2,4520,22,52,4,1,15,66};  
//   Arrays.stream(myarr1).sorted(Collections.reverseOrder()).filter(a->a%2==0 &&a>10).forEach(System.out::println);;     
//  System.out.println(Arrays.stream(myarr1).sorted(Collections.reverseOrder()).collect(Collectors.toList()));

//  3.Sort an array and remove dublicate
//  Integer []myarr3= {2,56,7,1,2,8,4,25,14,3,6,9,2,4520,22,52,4,1,15,66};  
//  Arrays.stream(myarr3).sorted().distinct().forEach(System.out::println);

		//////////////////////////////////////////////////

		// 4.sort an array of primitive type
//	// -->>normal way
//	      int a[]= {50,89,1,73,654,26,79,26,6,2,4,4,1};
//	      Arrays.sort(a);
//	      System.out.println(Arrays.toString(a));
//	// java 8
//	    a=  Arrays.stream(a).sorted().toArray();
//	    System.out.println(Arrays.toString(a));

		// 5.dublicate in list

		// convectinal way
		List<String> names = new ArrayList<String>();
		names.add("Rahul");
		names.add("Ravi");
		names.add("Sham");
		names.add("Aditya");
		names.add("Pranav");
		names.add("Pranav");
		names.add("Mayur");
		names.add("Tejas");
		names.add("Rahul");
//
//		// System.out.println("names in list " + names);
//
//		Set<String> s1 = new HashSet<String>(names);
//		// System.out.println("names in set " + s1);
//
//		// java 8
//		List<String> unique_names = names.stream().distinct().collect(Collectors.toList());
//		System.out.println(unique_names);
//
//		// print duplicate elements
//		for (String unique_names1 : unique_names) {
//			names.remove(unique_names1);
//		}
//		names.forEach(System.out::println);

		// Count and print duplicate in list

		List<Integer> marks = Arrays.asList(5, 8, 6, 7, 9, 1, 2, 5, 9, 2, 3, 5, 3, 4, 6, 10);
		Set items = new HashSet();

		Set<Integer> result = marks.stream().filter(n -> !items.add(n)).collect(Collectors.toSet());
		result.forEach(System.out::println);
		Long count = marks.stream().filter(n -> !items.add(n)).collect(Collectors.counting());
		System.out.println("count -->>" + count);

	}

}
