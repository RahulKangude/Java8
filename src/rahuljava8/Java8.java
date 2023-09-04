package rahuljava8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8 {
	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();
		l.add(82);
		l.add(99);
		l.add(28);
		l.add(1999);
		l.add(1);
	//	l.add(-1);
		l.add(25);
		l.add(25);
		l.add(82);
		System.out.println("-----Que1 Given a list of integers, find out all the even numbers exist in the list using Stream functions-----");
		List<Integer> list = l.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(list);

		
		System.out.println("\n Q2 Given a list of integers, find out all the numbers starting with 2 using Stream functions?");;
        l.stream().map(s->s+"").map(s->s.toLowerCase()).filter(s->s.startsWith("2")).collect(Collectors.toList()).forEach(s->System.out.println("2"));
        
        System.out.println("\n -----Q3 How to find duplicate elements in a given integers list in java using Stream functions-----/n?");
        //firstway
        Set l1=new HashSet();
        Set<Integer>list1=l.stream().filter(i->!l1.add(i)).collect(Collectors.toSet());
        System.out.println("list "+list1);
        //second way
        Set<Integer>set=l.stream().filter(s-> Collections.frequency(l,s)>1).collect(Collectors.toSet());
		System.out.println("Dublicate values: " + set);

//        Map<String,Long>countmap=l.stream().map(s->s+"").collect(Collectors.groupingBy(r->r,Collectors.counting()))
//        		.entrySet().stream().filter(entry -> entry.getValue() >1)
//        		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
//        System.out.println(countmap);
		System.out.println("\n Q4 -----Given the list of integers, find the first element of the list using Stream functions------?");
		l.stream().findAny().ifPresent(System.out::println);
		
		System.out.println("\n Q5 ---------------------------sum of the list--------------------------------------------");
		Optional<Integer> sum=l.stream().reduce((a,b)->a+b);
        System.out.println("total addition  is-->> "+sum);
        
        System.out.println("\n Q6----------------------------Q6avg of the list-----------------------------------------------");
        Double d=l.stream().mapToInt(s->s).average().getAsDouble();
        System.out.println(d);
           
        System.out.println("\n Q7---------------------------get List of squre of g"
        		+ ""
        		+ "eiven list--------------------------------");
       List<Integer>square=l.stream().map(s->s*s).collect(Collectors.toList());
         System.out.println(square);
         
         System.out.println("/n Q8-----------------get squre of list the values are gretter than 1000 take avg-------------");
         Double dd=l.stream().map(s->s*s).filter(i->i>1000).mapToInt(s->s).average().getAsDouble();
         System.out.println(dd);
         
         System.out.println("\n Q9-------------------Max and min value form list-----------------------------------------");
         Integer max=l.stream().max(Comparator.comparing(Integer::valueOf)).get();
         Integer min =l.stream().min(Comparator.comparing(Integer::valueOf)).get();
         System.out.println("max value: "+max+ "   min value:"+min);
         
         System.out.println("/n Q10------------------Sort list by assending and desending order-----------------------------");
        
         List<Integer>accending=l.stream().sorted().collect(Collectors.toList());
         List<Integer>descending=l.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
         System.out.println("accending order : "+accending+"\n\t  descending order "+descending);
         
         System.out.println("\n Q10------------------get first 5 no and addition of that no----------------------------");
         Integer limit=l.stream().limit(5).reduce((a,b)->a+b).get();
         System.out.println("limit 5 addition  is: "+limit);
         
         System.out.println("\n Q11-------------skip first 5 no and return addition of remaing no---------------------");
         Integer skip=l.stream().skip(5).reduce((a, b)->a+b).get();
         System.out.println("skip first 5 : "+skip);
         
         System.out.println("\n Q10----------------Get 2nd Highest and lowest no in list----------------------------");
         Integer Highest=l.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
         Integer Lowest=l.stream().sorted().distinct().skip(1).findFirst().get();
         System.out.println("Second Highest number is: "+Highest+" second Lowest number is : "+Lowest);
	}
}