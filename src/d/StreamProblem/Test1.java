package d.StreamProblem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		
//		ArrayList<Integer> arr1=new ArrayList<>();
//		arr1.add(0);arr1.add(1);arr1.add(50);arr1.add(5);arr1.add(8);arr1.add(2);
//		
//		System.out.println(arr1);
//		List<Integer> updatearr1=arr1.stream().map(i->i+10).collect(Collectors.toList());
//		System.out.println("updatedlist"+updatearr1);
		
		
		ArrayList<Integer> arr2=new ArrayList<>();
		arr2.add(34);arr2.add(45);arr2.add(50);arr2.add(78);arr2.add(18);arr2.add(2);arr2.add(12);		
		
		//mark less than 35 filter();
		List<Integer> failStudent=arr2.stream().filter(i->i<35).collect(Collectors.toList());
		System.out.println(failStudent);
		// no of Student count();
		Long noOf_failStudent=arr2.stream().filter(i->i<35).count();
		System.err.println(noOf_failStudent);
		
		//Sorted()
		List<Integer> aa=arr2.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted list "+aa);
		//
		//comparator custmized sorting
		List<Integer> descorder=arr2.stream().sorted((i1,i2)->(i1<i2?1:(i1>i2?-1:0))).collect(Collectors.toList());
		System.out.println("descorder list "+descorder);
		
		//comparable default natural sorting
//		List<Integer> descorder1=arr2.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
//		System.out.println("descorder1 list "+descorder1);
//		
		arr2.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList()).forEach(System.out::println);
     //   System.out.println("sorted List "+sort);		
		
	}
	
	
}
