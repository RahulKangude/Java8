package d.StreamProblem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
	public static void main(String[] args) {

		ArrayList<String> arr2=new ArrayList<>();
		arr2.add("Rahul Kangude");arr2.add("Suyash");arr2.add("Prasad");arr2.add("Bharat");arr2.add("Rushi");arr2.add("Navnath");arr2.add("Sagar");	

	// compareing only with alphabetical order
		List<String> descorder1=arr2.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		
		Comparator <String>c=(i1,i2)->{
			int l1=i1.length();
			int l2=i2.length();
			if(l1<l2) return -1;
			else if(l1>l2) return +1;
			else return i1.compareTo(i2);
			
		};
				
		List<String> custOrder=arr2.stream().sorted().collect(Collectors.toList());
		System.out.println("descorder1 list "+custOrder);
		
//		//// min(),max()
//		
//		ArrayList<Integer> arr1=new ArrayList<Integer>();
//		arr1.add(20);arr1.add(1);arr1.add(50);arr1.add(5);arr1.add(8);arr1.add(2);arr1.add(82);
//		 // 1 approch
//		Integer min=arr1.stream().min((i1,i2)->i1.compareTo(i2)).get();
//		Integer max=arr1.stream().max((i1,i2)->i1.compareTo(i2)).get();
//		System.out.println(" minimum value =="+min+ " "+"maximum value =="+max);
//		// 2 approch
//		Integer min1=arr1.stream().min((i1,i2)->-i1.compareTo(i2)).get();
//		Integer max1=arr1.stream().max((i1,i2)->-i1.compareTo(i2)).get();
//		System.out.println(" minimum value1 =="+min1+ " "+"maximum value1 =="+max1);
//		
//		/// forEach()
//		
//		arr1.stream().forEach(i->{System.out.println("square is "+i*i );});
//		
//		// ArrayList convert into array 
//		
//		Integer [] convert=arr1.stream().toArray(Integer[]::new);
//		System.out.println(Arrays.toString(convert));
//		
		// Stream.of() use to 
		
		Stream<Integer>s1=Stream.of(11,89,124,224,222,230,741,987);
		s1.forEach(System.out::println);
		System.out.println("********************************************************");
		
		Integer [] i1= {21,89,74,78,47,98,45,35};
		int maxx=Stream.of(i1).max((i2,i3)->i2.compareTo(i3)).get();
		System.out.println(maxx);
//		List<Integer> maxx=
		
	}
}
