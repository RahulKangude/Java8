package java8;

public class Anonymus_innerclass {
	public static void main(String[] args) {

Runnable r=()-> {System.out.println("child thread");};
	Thread t=new Thread(r);
	t.start();
	
	}
}
//@FunctionalInterface
//interface a extends b,c{
//	void multiply();
//	}
//
//interface b{
//	
//}
//interface c{
//	void sub();
//}