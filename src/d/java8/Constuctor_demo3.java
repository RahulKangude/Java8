package d.java8;

public class Constuctor_demo3{
	public static void main(String[] args) {
		interfff i = Sample::new;
		i.get("Rahul");
		// i.get();
		// Sample s1 = i.get("Rahul");
	}

	
}

class Sample {

	public Sample() {
		System.out.println("Sample class Constructor1");
	}

	public Sample(String s) {
		System.out.println("Sample class Constructor2" + s);
	}
	private static void Sample1() {
		// TODO Auto-generated method stub
		
	}

}

interface interfff {
	// public Sample get();

	public Sample get(String s);
}