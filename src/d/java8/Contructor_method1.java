package d.java8;

public class Contructor_method1 {

	public static void sum(int x, int y) {
		System.out.println("the sum " + (x + y));
	}

	public static void main(String[] args) {
		
		Interf1 i = (a, b) -> System.out.println("the multiply  " + (a * b));
		
		i.add(10, 20);
		
		Interf1 i1=Contructor_method1::sum;
		i1.add(100, 200);
		
}
}

interface Interf1 {
	public void add(int a, int b);
}