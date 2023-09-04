package d.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Collection_demo {
	public static void main(String[] args) {
   
		ArrayList<Integer>l=new ArrayList<>();
		l.add(20);
		l.add(2);
		l.add(50);
		l.add(0);
		l.add(620);
		l.add(250);
		l.add(202);
		l.add(2014);
System.out.println(l);
	


// other way java 8
 //  Comparator<Integer> c=(i1,i2)->i1.compareTo(i2);
  Comparator<Integer> c=(i1,i2)->(i1<i2)?-1:(i1>i2)?1:0;
   


	Collections.sort(l,c);
	System.out.println(l);
	}
}

class Mycomparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o1.compareTo(o2);
	}
	
}