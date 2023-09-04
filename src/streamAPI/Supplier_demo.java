package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Supplier_demo {
//@Override
//	public String get() {
//		String h="Rahul";
//		return h;
  
Optional class
	
	public static void main(String[] args) {
		
	//	Supplier_demo d2=new Supplier_demo();
	//	System.out.println(d2.get());
		
		
		String []myarr= {};

 		List<String>my_list=Arrays.asList(myarr);
 		
 		Supplier<String>supplier=()->{return "No data found";};
 		
 		//System.out.println(supplier.get());
 		System.out.println(my_list.stream().findAny().orElseGet(supplier));
		
		}	
	}


