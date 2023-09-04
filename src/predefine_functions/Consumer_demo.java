package predefine_functions;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Consumer_demo {
	public static void main(String[] args) {

		Function<Student11, String> f = s -> {
			int marks = s.marks;
			String grade = "";
			if (marks >= 80)
				grade = "A[Dictionction]";
			else if (marks >= 60)
				grade = "B[First class]";
			else if (marks >= 50)
				grade = "C[Second class]";
			else if (marks > 35)
				grade = "D[Third class]";
			else
				grade = "E[Failed]";
			return grade;
		};

		Student11[] s = { new Student11(10, "Rahul", 95), new Student11(14, "Bunty", 100),
				new Student11(10, "Ramesh", 45), new Student11(10, "Rakesh", 35), new Student11(10, "prakash", 55), };
		Predicate<Student11> p1 = p -> p.marks > 60;
		Consumer<Student11> c = s1 -> {
			System.out.println("Student11 name " + s1.name);
			System.out.println("Student11 marks " + s1.marks);
			System.out.println("Student11 grade " + f.apply(s1));
			System.out.println();
		};
		for (Student11 s1 : s) {
			if (p1.test(s1)) {

				c.accept(s1);
			}
		}
	}
}

class Student11 {
	int roll_no;
	String name;
	int marks;

	public Student11(int roll_no, String name, int marks) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.marks = marks;
	}

}
