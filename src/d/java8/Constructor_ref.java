package d.java8;

public class Constructor_ref {
	public static void main(String[] args) {

		// Interff i=(name,rollno,marks,age)->new Student(name,rollno,marks,age);
		Interff i1 = Student::new;
		System.out.println(i1);
		
	}
}

class Demo implements Interff {
	@Override
	public Student get(String name, int rollno, int marks, int age) {
		Student s = new Student(name, rollno, marks, age);
		return s;
	}
}

interface Interff {
	public Student get(String name, int rollno, int marks, int age);
}

class Student {
	String name;
	int rollno;
	int marks;
	int age;
	public Student(String name, int rollno, int marks, int age) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", marks=" + marks + ", age=" + age + "]";
	}
}