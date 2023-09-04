package d.StreamProblem;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test3 {
	public static void main(String[] args) {

//		ArrayList<Integer> arr2=new ArrayList<>();
//		arr2.add(34);arr2.add(45);arr2.add(50);arr2.add(78);arr2.add(18);arr2.add(2);arr2.add(12);
//		
//		
//		List<Integer> list=arr2.stream().filter(i->i<35).collect(Collectors.toList());
////		list.forEach(System.out::println);
//		System.out.println(list);
//		
//		List<Integer>list2=arr2.stream().map(i->i+5).collect(Collectors.toList());
//		System.out.println(list2);
//		
//		
//		List<Integer>list3=arr2.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
//		System.out.println(list3);
//		
//		Integer list4=arr2.stream().max((i1,i2)->i1.compareTo(i2)).get();
//		System.out.println(list4);
//		
//		ArrayList<String> arr2 = new ArrayList<>();
//		arr2.add("Rahul Kangude");
//		arr2.add("Suyash");
//		arr2.add("Prasad");
//		arr2.add("Bharat");
//		arr2.add("Rushi");
//		arr2.add("Navnath");
//		arr2.add("Sagar");
//
//		List<String> sort = arr2.stream().sorted().collect(Collectors.toList());
//		System.out.println(sort);
//
//		Comparator<String> c1 = (i1, i2) -> {
//			int l1 = i1.length();
//			int l2 = i2.length();
//			if (l1 > l2)
//				return +1;
//			else if (l1 < l2)
//				return -1;
//			else
//				return i1.compareTo(i2);
//
//		};
//		sort = arr2.stream().sorted(c1).collect(Collectors.toList());
//		System.out.println(sort);
//	}
	
	String s="ababejfksbaznczzmficnsxscazcvdresazccd";
	
	String[]arr1=s.split("");
	List<String>list=Arrays.asList(arr1);
	
	Map<String, Long> count=list.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()))
			.entrySet().stream().filter(e->e.getValue()>1).
			collect(Collectors.toMap(Map.Entry::getKey , Map.Entry::getValue));
	count.forEach((num,co)->System.out.println(num + " " +co));
		
	
	
	
	}

}