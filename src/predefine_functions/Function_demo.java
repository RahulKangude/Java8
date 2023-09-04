package predefine_functions;

import java.util.function.Function;

public class Function_demo {
	public static void main(String[] args) {
//		Function<String, Integer> f = s -> s.length();
//		System.out.println(f.apply("Rahul Kangude"));
//		
//		Function<String, String> f1 = s -> s.toUpperCase();
//		System.out.println(f1.apply("Rahul Kangude"));
//		
		Function<Student,String> f=s->{
			int marks=s.marks;
			String grade="";
			if(marks>=80) grade="A[Dictionction]";
			else if(marks>=60) grade="B[First class]";
			else if(marks>=50) grade="C[Second class]";
			else if(marks>35) grade="D[Third class]";
			else grade="E[Failed]";
			return grade ;
		};
		
		Student[]s= {
				new Student(10, "Rahul", 95),
				new Student(14, "Bunty", 100),
				new Student(10, "Ramesh", 45),
				new Student(10, "Rakesh", 35),
				new Student(10, "prakash", 55),
		};
		
		for(Student s1:s) {
			System.out.println("Student name "+s1.name);
			System.out.println("Student marks "+s1.marks);
			System.out.println("Student grade "+f.apply(s1));
			System.out.println();
		}
	}
}

class Student {
	int roll_no;
	String name;
	int marks;
	public Student(int roll_no, String name, int marks) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.marks = marks;
	}
	
}