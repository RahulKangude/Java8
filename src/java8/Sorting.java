package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
	public static void main(String[] args) {

//		List<Student_details> mylist = Student_details.getStudent_details();
//		 mylist.stream().filter(k -> k.mark > 50).forEach(System.out::println);

//		List<Student_details> passlist = get_student_result(mylist, "pass");
//		List<Student_details> faillist = get_student_result(mylist, "fail");
//		System.out.println("pass list " + passlist);
//		System.out.println("pass list " + faillist);

		// 1 way sorting
//		List<Student_details> mylist = Student_details.getStudent_details();
//		mylist.stream().sorted(new Markcomparator()).forEach(System.out::println);;
//		System.out.println(mylist);

		// 2 way
		List<Student_details> mylist = Student_details.getStudent_details();
		// Comparator<Student_details> comparemark=((o1,o2)->o2.mark-o1.mark);
		Comparator<Student_details> comparemark1 = Comparator.comparing(Student_details::getMark);
		Comparator<Student_details> compare_Rollnum = Comparator.comparing(Student_details::getRoll_no);

		mylist.stream().sorted(comparemark1).forEach(System.out::println);
		System.out.println("------------------------------------------");
		mylist.stream().sorted(compare_Rollnum).forEach(System.out::println);
	}

	static List<Student_details> get_student_result(List<Student_details> list, String d) {

		if (d.equalsIgnoreCase("pass")) {
			return list.stream().filter(k -> k.mark > 50).collect(Collectors.toList());
		} else if (d.equalsIgnoreCase("fail")) {
			return list.stream().filter(k -> k.mark < 50).collect(Collectors.toList());
		} else
			System.out.println("inavlid data");
		return null;

	}
}

//class Markcomparator implements Comparator<Student_details>{
//
//	@Override
//	public int compare(Student_details o1, Student_details o2) {
//		
//		return o2.mark-o1.mark;
//	}
//	 
//}

class Student_details {
	String name;
	Integer mark;
	Integer roll_no;

	public Student_details(String name, Integer mark, Integer roll_no) {
		super();
		this.name = name;
		this.mark = mark;
		this.roll_no = roll_no;
	}

	@Override
	public String toString() {
		return "Student_details [name=" + name + ", mark=" + mark + ", roll_no=" + roll_no + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMark() {
		return mark;
	}

	public void setMark(Integer mark) {
		this.mark = mark;
	}

	public Integer getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(Integer roll_no) {
		this.roll_no = roll_no;
	}

	public static List<Student_details> getStudent_details() {
		Student_details s1 = new Student_details("Rahul", 98, 1);
		Student_details s2 = new Student_details("Pranav", 100, 5);
		Student_details s3 = new Student_details("urvashi", 74, 2);
		Student_details s4 = new Student_details("manish", 49, 4);
		Student_details s5 = new Student_details("narayan", 45, 11);

		List<Student_details> list = new ArrayList<Student_details>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		return list;
	}

}