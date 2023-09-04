package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_interface  {
	public static void main(String[] args) {
//     Consumer_interface ci=new Consumer_interface();
//     ci.accept(500);

	Integer []myarr= {12,96,5,4,2,1,3,8,99,5,2};
	List<Integer>my_list=Arrays.asList(myarr);
	
	
	
		
		
		
		Consumer<Integer>consumer=t->System.out.println("my value is=== "+t);
	//	consumer.accept(500);
		my_list.stream().forEach(consumer);
	}
//
//	@Override
//	public void accept(Integer t) {
//		System.out.println("my value is "+t );
//		
	
}
