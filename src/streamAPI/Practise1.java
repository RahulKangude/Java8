package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Practise1 {
public static void main(String[] args) {
	Integer []arr1= {0,2,3,65,2,3,98,12,6,15,78,19,17};
	
	Long l1=Stream.of(arr1).count();
	System.out.println("count-->>"+l1);
	
   for(int i=0;i<arr1.length;i++) {
	   String s1=""+arr1[i];
	
	  // System.out.println( s1.startsWith("9"));
   }
   
   // Start with  (map-->> converting integer into String)
	List<Integer> mylist=Arrays.asList(0,2,3,65,2,3,98,12,6,15,78,19,17);
	 //mylist.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(System.out::println);;
	
	 
	//find maximum element
	 int max=mylist.stream().max(Integer::compare).get();
	 System.out.println("Maximum element in list "+max);
	 
	//Stream is one time use
	 Integer []arr22= {0,2,3,65,2,3,98,12,6,15,78,19,17};
	
	 List<Integer>list1=Arrays.asList(arr22);
	 Stream<Integer>stream1=list1.stream();
	 Stream<Integer>stream2=list1.parallelStream();//its
	stream1.forEach(System.out::println);
	System.out.println("------------------------------------");
	stream2.forEach(System.out::println);
	
}
}
