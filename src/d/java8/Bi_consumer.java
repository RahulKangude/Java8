package d.java8;

import java.util.ArrayList;
import java.util.function.BiConsumer;

public class Bi_consumer {
	public static void main(String[] args) {
		ArrayList<Employee12> l = new ArrayList<Employee12>();
		populate(l);
		BiConsumer<Employee12, Integer> e = (c, d) -> c.Emp_no = c.Emp_no + d;

		
	
		for (Employee12 employee : l) {
			e.accept(employee, 5);
		}
		
		for (Employee12 ee : l) {
			System.out.println("Emp_name "+ee.Emp_name);
			System.out.println("Emp_name "+ee.Emp_no );
			System.out.println();
		}
	}

	public static void populate(ArrayList<Employee12> l) {
		l.add(new Employee12(100, "Ram"));
		l.add(new Employee12(200, "sita"));
		l.add(new Employee12(250, "mahesh"));
		l.add(new Employee12(300, "Narad"));
		l.add(new Employee12(10, "Shayam"));
	}

}

class Employee12 {
	Integer Emp_no;
	String Emp_name;

	public Employee12(Integer emp_no, String emp_name) {
		super();
		Emp_no = emp_no;
		Emp_name = emp_name;
	}

	@Override
	public String toString() {
		return "Employee12 [Emp_no=" + Emp_no + ", Emp_name=" + Emp_name + "]";
	}

}
