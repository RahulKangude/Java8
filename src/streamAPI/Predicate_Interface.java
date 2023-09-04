package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate_Interface {

//	@Override
//	public boolean test(String t) {
//		if(t.startsWith("R")) {
//			return true;
//			
//		}
//		return false;
//	}

	// other way

	public static void main(String[] args) {
//		Predicate_Interface pi=new Predicate_Interface();
//		System.out.println(pi.test("Rahul"));
		
		
		List<String>names=Arrays.asList("Ram","Roshan","Suyash","Bunty","Tushar");

		Predicate<String> predicate = t -> {
			if (t.startsWith("R")) {
				return true;

			} else
				return false;
		};
	//	System.out.println(predicate.test("Rahul"));

		//names.stream().filter(predicate).forEach(System.out::println);;
		//or
		names.stream().filter(m->m.startsWith("R")).forEach(System.out::println);;
		
		
	}
}
