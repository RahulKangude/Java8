package java8;

public class Student implements College, College2 {
	public static void main(String[] args) {
		System.out.println("hiiii");
//	College c1=new College() {//inline implementation by anonymus class		
//		public void add() {
//			System.out.println("add method call");
//		}
//	};
//
//	c1.add();

		College c1 = () -> {
			System.out.println("add method call");
			System.out.println("Student");
		};

		c1.subtract();
		c1.send1();
		College.recive1();
		Student s1 = new Student();
		s1.send1();
		s1.send2();
		s1.subtract();

	}

	@Override
	public void subtract() {
		System.out.println("Stduent subtract method call");
	}

//@Override
//public void send1() {
//	System.err.println("Student method call1"); 
//	//College.super.send1();
//}
//
//@Override
//public void send2() {
//	System.out.println("student method call2");
//	College.super.send1();
//}

}
